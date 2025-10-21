package poly.Lab7.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import poly.Lab7.entity.Product;
import poly.Lab7.entity.Report;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
    @Query("FROM Product o WHERE o.price BETWEEN ?1 AND ?2")
    // bài 1
    List<Product> findByPrice(double minPrice, double maxPrice);
    // bài 4
//    List<Product> findByPriceBetween(double minPrice, double maxPrice);
    @Query("FROM Product o WHERE o.name LIKE ?1")
    //bài 2
    Page<Product> findByKeywords(String keywords, Pageable pageable);
    // thay cái này vào là bài 5
//    Page<Product> findAllByNameLike(String keywords, Pageable pageable);
    // --- Bài 3: Tổng hợp tồn kho theo loại hàng ---
    @Query("SELECT o.category.name AS category, SUM(o.price) AS sum, COUNT(o) AS count "
            + "FROM Product o "
            + "GROUP BY o.category.name "
            + "ORDER BY SUM(o.price) DESC")
    List<Report> getInventoryByCategory();


}

