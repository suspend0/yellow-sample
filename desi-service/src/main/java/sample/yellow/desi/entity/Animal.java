package sample.yellow.desi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANIMAL", schema = "DESI")
public class Animal {
  @Id Integer id;
  String name;
}
