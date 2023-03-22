package controller;

import data.model.Email;
import dtos.request.CreateEmailRequest;
import services.EmailService;
import services.EmailServiceImp;

public class emailController {
    private final EmailService emailService=new EmailServiceImp();

    public Object createEmail(CreateEmailRequest request){
        return emailService.createNewEmail(request);
    }
public Object findEmail(int id){
        try {
            return emailService.findEmail(id);
        }catch (IllegalArgumentException e){
            return e.getMessage();
        }
}
}

