package ne.billbenon.java.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchased")
@NoArgsConstructor
@Getter
@Setter
public class Purchased {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private int quantity;
    private double total;
    private Date date;

    public Purchased(Product product, int quantity, Date date) {
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }
}
