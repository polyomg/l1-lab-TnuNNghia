package poly.Lab6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import poly.Lab6.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {
}
