package data.repositories;

import data.model.Email;

public interface EmailRepository {
   Email saveEmail(Email email);
    Email findByEmailId(int emailId);

 Email viewEmail(int emailId);

 Email findAll();

    Email deleteByEmailId(int emailId);


     int count();

    void deleteAll();
}
