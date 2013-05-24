package sample.yellow.lucy;

import javax.ws.rs.Path;

@Path("/lucy/chocolate")
public class ChocolateEndpoint {
  private final ChocolateFactory factory;

  public ChocolateEndpoint(ChocolateFactory factory) {this.factory = factory;}

  @Path("go") public void go() {
    factory.goGoGo();
  }
}
