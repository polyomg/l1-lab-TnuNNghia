package poly.Lab7.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "Categories")
public class Category implements Serializable {

    @Id
    @Column(name = "Id")
    String id;

    @Column(name = "Name")
    String name;

    @OneToMany(mappedBy = "category")
    List<Product> products;
}
