package poly.Lab6.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import poly.Lab6.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long> {
}

