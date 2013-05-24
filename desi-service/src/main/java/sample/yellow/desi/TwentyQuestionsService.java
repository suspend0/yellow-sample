package sample.yellow.desi;

import sample.yellow.lucy.ChocolateFactory;

public class TwentyQuestionsService {
  private final ChocolateFactory chocolateFactory;
  private final TwentyQuestionsDAO dao;

  public TwentyQuestionsService(ChocolateFactory chocolateFactory, TwentyQuestionsDAO dao) {

    this.chocolateFactory = chocolateFactory;
    this.dao = dao;
  }

  public void exec() {
    System.out.println("exec");
    chocolateFactory.goGoGo();
  }
}
