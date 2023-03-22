package test;

import data.model.User;
import dtos.request.RegisterRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.UserService;
import services.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    private UserService userService;
    private RegisterRequest request;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl();
        request = new RegisterRequest();

        request.setFirstName("nelo");
        request.setLastName("nel");
        request.setPassword("password");
        request.setUserName("chichi@gmail.com");
    }

    @Test
    void testThatUserIsOneCountOne(){
        User savedUser = userService.register(request);
        assertTrue(savedUser.getUserId()!=0);
        };
@Test
    void testThatICanFindUserById(){
    User savedUser= userService.register(request);
    User foundUser = userService.findId(1);
    assertEquals(1,savedUser.getUserId());
}
   @Test
    void testThatMyExceptionOnDuplicateRegistrationWorks(){
    userService.register(request);
    assertThrows(IllegalArgumentException.class,()-> userService.register(request));
   }
@Test
    void test_wronguseridthrowsexception(){
    userService.register(request);
    assertThrows(IllegalArgumentException.class,()->userService.findId(2));
}
    }

