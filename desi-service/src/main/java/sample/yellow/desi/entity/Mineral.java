package sample.yellow.desi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MINERAL", schema = "DESI")
public class Mineral {
  @Id Integer id;
  String name;
}
