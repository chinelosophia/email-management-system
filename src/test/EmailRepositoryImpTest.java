package test;

import data.model.Email;
import data.repositories.EmailRepository;
import data.repositories.EmailRepositoryImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailRepositoryImpTest {
//    public static void main(String[] args) {
//
//    }

    private Email email;
    private EmailRepository emailRepository;

    @BeforeEach
    void setUp() {
        email = new Email();
        email.setSubject("story");
        email.setBody("Business");
        emailRepository = new EmailRepositoryImp();
    }

    @Test
    void SaveEmail_CountOne() {
        Email savedEmail = emailRepository.saveEmail(email);
        assertEquals(1, emailRepository.count());
    }

    @Test
    void findEmailById() {
        Email savedEmail = emailRepository.saveEmail(email);
        Email foundEmail = emailRepository.findByEmailId(1);
        assertEquals(1, emailRepository.count());
    }

    @Test
    void deleteEmail() {
        Email savedEmail = emailRepository.saveEmail(email);
        emailRepository.deleteByEmailId(1);
        assertEquals(0, emailRepository.count());
    }
}