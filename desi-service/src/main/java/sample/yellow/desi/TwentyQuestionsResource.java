package sample.yellow.desi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/desi/question")
public class TwentyQuestionsResource {
  private final TwentyQuestionsService svc;

  public TwentyQuestionsResource(TwentyQuestionsService svc) {this.svc = svc;}

  @GET public void call() {
    svc.exec();
  }
}
