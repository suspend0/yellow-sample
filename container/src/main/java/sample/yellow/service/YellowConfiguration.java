package sample.yellow.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.db.DatabaseConfiguration;

public class YellowConfiguration extends Configuration {
  @JsonProperty
  private DatabaseConfiguration databaseConfiguration;

  public DatabaseConfiguration getDatabaseConfiguration() {
    return this.databaseConfiguration;
  }
}
