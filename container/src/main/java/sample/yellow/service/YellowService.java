package sample.yellow.service;

import com.google.common.collect.ImmutableSet;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.db.DatabaseConfiguration;
import com.yammer.dropwizard.hibernate.HibernateBundle;
import com.yammer.dropwizard.hibernate.SessionFactoryFactory;
import sample.yellow.desi.DesiServiceDescriptor;
import sample.yellow.lucy.LucyServiceDescriptor;
import sample.yellow.lucy.LucyServiceHandle;

public class YellowService extends Service<YellowConfiguration> {
  private HibernateBundle<YellowConfiguration> hibernate;

  @Override public void initialize(Bootstrap<YellowConfiguration> bootstrap) {
    ImmutableSet.Builder<Class<?>> entities = ImmutableSet.builder();
    entities.addAll(new DesiServiceDescriptor().entities());
    entities.addAll(new LucyServiceDescriptor().entities());

    this.hibernate = new HibernateBundle<YellowConfiguration>(entities.build().asList(), new SessionFactoryFactory()) {
      public DatabaseConfiguration getDatabaseConfiguration(YellowConfiguration yellowConfiguration) {
        return yellowConfiguration.getDatabaseConfiguration();
      }
    };

    bootstrap.addBundle(this.hibernate);
  }

  @Override public void run(YellowConfiguration configuration, Environment environment) throws Exception {
    LucyServiceHandle lucyHandle = new LucyServiceDescriptor().construct(
        environment,
        hibernate.getSessionFactory());
    new DesiServiceDescriptor().construct(
        environment,
        hibernate.getSessionFactory(),
        lucyHandle.getChocolateFactory());
  }
}
