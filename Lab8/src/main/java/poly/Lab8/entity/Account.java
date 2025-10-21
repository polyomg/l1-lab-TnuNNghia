package poly.Lab8.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "accounts")
@Data
public class Account {
    @Id
    private String username;
    private String password;
    private String fullname;
    private String role; // e.g. "USER" or "ADMIN"

    public boolean isAdmin() {
        return "ADMIN".equalsIgnoreCase(role);
    }
}
