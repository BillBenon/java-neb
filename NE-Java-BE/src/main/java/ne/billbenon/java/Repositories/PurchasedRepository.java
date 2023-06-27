package ne.billbenon.java.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ne.billbenon.java.Models.Purchased;

public interface PurchasedRepository extends JpaRepository<Purchased, Long> {
}
