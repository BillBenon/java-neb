package ne.billbenon.java.Pojos.Request;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PurchasedRequest {
    private Long productId;
    private int quantity;
    private Date date;
}
