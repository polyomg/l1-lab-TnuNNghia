package poly.Lab8.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import poly.Lab8.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
}