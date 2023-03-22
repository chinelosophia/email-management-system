package services;

import data.model.Email;
import data.model.Status;
import data.repositories.EmailRepository;
import data.repositories.EmailRepositoryImp;
import dtos.request.CreateEmailRequest;
import util.Mapper;

public class EmailServiceImp implements EmailService {

     EmailRepository emailRepository = new EmailRepositoryImp();
    UserService userService= new UserServiceImpl();


    @Override
    public Email createNewEmail(CreateEmailRequest createEmailRequest) {
        try{
            var foundUser = userService.findUser(createEmailRequest.getId());
        }catch (NullPointerException ex){
            throw new IllegalArgumentException
                    (String.format("User with this id does not exist",createEmailRequest.getId()));
        }
        Email email=new Email();
        Mapper.map(createEmailRequest,email);
        return emailRepository.saveEmail(email);
    }

    @Override
    public Email saveEmail(Email email) {
        email.setStatus(Status.DRAFT);
        return emailRepository.saveEmail(email);
    }

    @Override
    public Email viewEmail(int emailId) {
        return emailRepository.viewEmail(emailId);
    }

    @Override
    public Email sendEmail(Email email) {
        email.setStatus(Status.OUTBOX);
        return emailRepository.saveEmail(email);
    }
@Override
public Email receiveEmail(Email email){
        email.setStatus(Status.INBOX);
        return emailRepository.saveEmail(email);

}
    @Override
    public int count() {
        return emailRepository.count();
    }

    @Override
public Email findEmail(int emailId) {

        return emailRepository.findByEmailId(emailId);
    }

    @Override
    public Email deleteEmail(int emailId) {
        return emailRepository.deleteByEmailId(emailId);
    }
}



