package poly.Lab8.config;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import poly.Lab8.entity.Account;
import poly.Lab8.service.AccountService;

@Component
public class DataLoader {
    @Autowired
    private AccountService accountService;

    @PostConstruct
    public void init() {
        Account admin = new Account();
        admin.setUsername("admin");
        admin.setPassword("admin");
        admin.setFullname("Administrator");
        admin.setRole("ADMIN");
        accountService.save(admin);

        Account user = new Account();
        user.setUsername("user");
        user.setPassword("user");
        user.setFullname("Normal User");
        user.setRole("USER");
        accountService.save(user);
    }
}

