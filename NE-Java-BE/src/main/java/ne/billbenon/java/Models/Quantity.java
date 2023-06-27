package ne.billbenon.java.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "quantity")
@NoArgsConstructor
@Getter
@Setter
public class Quantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private int quantity;
    private String operation;
    private Date date;

    public Quantity(Product product, int quantity, String operation, Date date) {
        this.product = product;
        this.quantity = quantity;
        this.operation = operation;
        this.date = date;
    }
}
