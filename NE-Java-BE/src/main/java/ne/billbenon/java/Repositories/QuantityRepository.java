package ne.billbenon.java.Repositories;

import ne.billbenon.java.Models.Quantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuantityRepository extends JpaRepository<Quantity, Long> {
}
