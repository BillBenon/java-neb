package ne.billbenon.java.Pojos.Request;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class QuantityRequest {
    private String operation;
    private int quantity;
    private Date date;
    private Long productId;

}
