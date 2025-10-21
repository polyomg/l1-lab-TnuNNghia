package poly.Lab8.service;


import poly.Lab8.entity.Account;

public interface AccountService {
    Account findById(String username);
    Account save(Account a);
}
