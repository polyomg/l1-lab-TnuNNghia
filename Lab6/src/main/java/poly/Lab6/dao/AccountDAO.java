package poly.Lab6.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import poly.Lab6.entity.Account;

public interface AccountDAO extends JpaRepository<Account, String> {
}

