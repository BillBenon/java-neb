package ne.billbenon.java.Models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="products")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String code;
    private String name;
    private String type;
    private double price;
    private Date inDate;
    private String image;

    public Product(String name, String type, double price, String image) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.image = image;
    }
}
