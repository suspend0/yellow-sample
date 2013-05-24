package sample.yellow.lucy;

import com.yammer.dropwizard.config.Environment;
import org.hibernate.SessionFactory;
import sample.yellow.lucy.entity.Chocolate;
import sample.yellow.lucy.entity.Cookie;

import java.util.Arrays;
import java.util.List;

public class LucyServiceDescriptor {
  public List<Class<?>> entities() {
    return Arrays.asList(Chocolate.class, Cookie.class);
  }

  public LucyServiceHandle construct(Environment environment, SessionFactory factory) {
    final ChocolateFactory cf = new ChocolateFactory(new ChocolateDAO(factory));
    environment.addResource(new ChocolateEndpoint(cf));

    return new LucyServiceHandle() {
      public ChocolateFactory getChocolateFactory() {
        return cf;
      }
    };
  }
}
