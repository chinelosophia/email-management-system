package controller;

import data.model.Email;
import dtos.request.SendEmailRequest;
import services.EmailService;
import services.EmailServiceImp;

import java.util.List;

public class EmailController {
    EmailService emailService=new EmailServiceImp();

public String sendEmail(SendEmailRequest sendEmailRequest) {
    return emailService.sendEmail(sendEmailRequest);

}
public Email sendEmail(Email email) {
    return emailService.sendEmail(email);
}
    public Email findEmailById(int id){
    return emailService.findEmail(id);
}
    public List<Email> findEmailBySubject(String subject){
    return emailService.findBySubject(subject);
    }
  public Email deleteEmailById(int id){
    return emailService.deleteEmail(id);
  }
    public List<Email> viewInbox(String userName){
    return emailService.viewInbox(userName);

    }
    public List<Email> viewOutbox(String userName){
        return emailService.viewOutbox(userName);

    }


}

