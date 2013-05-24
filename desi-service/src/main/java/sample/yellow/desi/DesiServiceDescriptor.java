package sample.yellow.desi;

import com.yammer.dropwizard.config.Environment;
import org.hibernate.SessionFactory;
import sample.yellow.desi.entity.Animal;
import sample.yellow.desi.entity.Mineral;
import sample.yellow.desi.entity.Vegetable;
import sample.yellow.lucy.ChocolateFactory;

import java.util.Arrays;
import java.util.List;

public class DesiServiceDescriptor {
  public List<Class<?>> entities() {
    return Arrays.asList(Animal.class, Vegetable.class, Mineral.class);
  }

  public void construct(Environment environment, SessionFactory factory, ChocolateFactory chocolateFactory) {
    TwentyQuestionsService svc = new TwentyQuestionsService(chocolateFactory,new TwentyQuestionsDAO(factory));
    environment.addResource(new TwentyQuestionsResource(svc));
  }
}
