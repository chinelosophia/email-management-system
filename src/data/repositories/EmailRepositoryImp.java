package data.repositories;

import data.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailRepositoryImp implements EmailRepository{
int count;
List<Email>emails=new ArrayList<>();
    @Override
    public Email saveEmail(Email email) {
        if (email.getEmailId() == 0) {
            email.setEmailId(count()+1);
            emails.add(email);
            count++;
            return email;
        }
        throw new IllegalArgumentException("you cannot register twice");
    }

    @Override
    public Email findByEmailId(int emailId) {
        for (Email email:emails)
            if(email.getEmailId()==emailId){
            return email;
            }
        return null;
    }

    @Override
    public Email viewEmail(int emailId) {
        for (Email email:emails)
            if(email.getEmailId()==emailId){
                return email;
            }
        return null;
    }


    @Override
    public Email findAll() {
        return (Email) emails;
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
    public int count() {
        return count;
    }

    @Override
    public void deleteAll() {
        emails.clear();

    }


}
