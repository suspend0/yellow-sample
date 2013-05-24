package sample.yellow.lucy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHOCOLATE", schema = "LUCY")
public class Chocolate {
  @Id Integer id;
  String name;
}
