package ne.billbenon.java.Models;

import javax.persistence.*;
import lombok.Data;
import ne.billbenon.java.Enums.ERole;

@Entity
@Table(name="roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public Role(ERole name) {
        this.name = name;
    }

    public Role() {

    }
}
