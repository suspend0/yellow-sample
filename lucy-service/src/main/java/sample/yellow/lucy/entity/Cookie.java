package sample.yellow.lucy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COOKIE", schema = "LUCY")
public class Cookie {
  @Id Integer id;
  String name;
}
