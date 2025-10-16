package poly.Lab6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import poly.Lab6.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String> {
}
