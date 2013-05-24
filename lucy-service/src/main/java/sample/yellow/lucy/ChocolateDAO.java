package sample.yellow.lucy;

import com.yammer.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;
import sample.yellow.lucy.entity.Chocolate;

public class ChocolateDAO extends AbstractDAO<Chocolate> {
  public ChocolateDAO(SessionFactory factory) {
    super(factory);
  }

  public void doStuff() {
    System.out.println("doing stuff");
  }
}
