package data.repositories;

import data.model.Email;
import dtos.request.SendEmailRequest;

import java.util.List;

public interface EmailRepository {
   Email createEmail(Email email);
   Email savedEmail(Email email);
    Email findByEmailId(int emailId);
   List <Email> findBySubject(String subject);
    List<Email> findAll();

    Email deleteByEmailId(int emailId);
    int count();
    List<Email>deleteAll();
}
