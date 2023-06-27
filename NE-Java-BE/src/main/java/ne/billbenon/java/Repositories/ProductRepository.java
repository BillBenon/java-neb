package ne.billbenon.java.Repositories;

import ne.billbenon.java.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
