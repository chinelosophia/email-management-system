package data.repositories;

import data.model.Email;
import dtos.request.SendEmailRequest;
import services.UserService;
import services.UserServiceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmailRepositoryImp implements EmailRepository {
    int count;
    private static  List<Email> emails = new ArrayList<>();
    private UserService userService = new UserServiceImpl();
private LocalDateTime timeCreated= LocalDateTime.now();
    @Override
    public Email createEmail(Email email) {

        if (email.getEmailId() == 0) {
            email.setEmailId(count() + 1);
            emails.add(email);
            count++;
            return email;
        }
        return null;
    }



    @Override
    public Email savedEmail(Email email) {
        if (email.getEmailId() == 0) {
            email.setEmailId(count() + 1);
            emails.add(email);
            count++;
            return email;
        }
        return email;
    }


    @Override
    public Email findByEmailId(int emailId) {
        for (Email email : emails)
            if (email.getEmailId() == emailId) {
                return email;
            }
        return null;
    }

    @Override
    public List<Email> findBySubject(String subject) {
        List<Email> emailBySubject = new ArrayList<>();
        for (Email email :emails)
            if(Objects.equals(email.getSubject(), subject)){
        emailBySubject.add(email);

    }
        return emailBySubject;
    }

    @Override
    public List <Email>findAll() {
        return emails;
    }

    @Override
    public Email deleteByEmailId(int emailId) {
        for(Email email: emails)
            if(email.getEmailId()==emailId){
                emails.remove(email);
                count--;
                break;
    }
        return null;
    }

    @Override
    public int count()
    {
        return count;
    }

    @Override
    public List<Email>deleteAll() {
        emails.clear();

        return null;
    }


}
