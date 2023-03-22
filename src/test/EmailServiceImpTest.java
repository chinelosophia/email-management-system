package test;

import data.model.Email;
import data.model.Status;
import dtos.request.CreateEmailRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.EmailService;
import services.EmailServiceImp;
import services.UserService;
import services.UserServiceImpl;
//import services.EmailServiceImp;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceImpTest {
    EmailService emailService;
    UserService userService;
    Email savedEmail;
    CreateEmailRequest createEmailRequest;
     Email email;

    @BeforeEach
    void setUp() {
        emailService = new EmailServiceImp();
         createEmailRequest = new CreateEmailRequest();
         createEmailRequest.setBody("This is an email from Test");
         createEmailRequest.setSubject("This is a Subject from Test");
         userService = new UserServiceImpl();

       email = new Email();
       email.setBody(createEmailRequest.getBody());
       email.setSubject(createEmailRequest.getSubject());

    }
    @Test
    void testThatICanCreateAnEmail(){
        Email savedEmail = emailService.saveEmail(email);
        assertEquals(savedEmail.getEmailId(), emailService.count());
        assertEquals(savedEmail.getStatus(), Status.DRAFT);
    }

    @Test
    void testThatICanSendAnEmail(){
        Email savedEmail = emailService.sendEmail(email);
        assertEquals(savedEmail.getEmailId(), emailService.count());
        assertEquals(savedEmail.getStatus(), Status.OUTBOX);
    }

@Test
    void testThatICanViewAnEmail() {
    Email savedEmail = emailService.sendEmail(email);
    Email foundEmail = emailService.findEmail(savedEmail.getEmailId());
    assertEquals(savedEmail.getEmailId(), emailService.count());
}
@Test
        void testThatICanFindEmail(){
        Email savedEmail = emailService.saveEmail(email);
        Email foundSave = emailService.findEmail(1);
        assertEquals(foundSave.getEmailId(),emailService.count());

    }
@Test
    void testThatICanDeleteAnEmail(){
        Email savedEmail = emailService.saveEmail(email);
        Email foundEmail = emailService.findEmail(1);
        emailService.deleteEmail(1);
        assertEquals(0,emailService.count());
}
}
