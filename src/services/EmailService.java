package services;

import data.model.Email;
import dtos.request.CreateEmailRequest;

public interface EmailService {
    Email createNewEmail(CreateEmailRequest request);
    Email saveEmail(Email email);
    Email findEmail(int emailId);
    Email viewEmail(int emailId);

    Email sendEmail(Email email);

    Email receiveEmail(Email email);

    int count();


    Email deleteEmail(int emailId);
}
