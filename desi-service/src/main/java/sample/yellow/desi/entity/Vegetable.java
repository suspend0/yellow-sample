package sample.yellow.desi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEG", schema = "DESI")
public class Vegetable {
  @Id Integer id;
  String name;
}
