package poly.Lab6.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import poly.Lab6.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {
}

