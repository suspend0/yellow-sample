package sample.yellow.lucy;

public class ChocolateFactory {
  private final ChocolateDAO dao;

  public ChocolateFactory(ChocolateDAO dao) {
    this.dao = dao;
  }

  public void goGoGo() {
    dao.doStuff();
    System.out.println("go go go go!!!");
  }
}
