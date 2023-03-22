package test;

import data.model.User;
import data.repositories.UserRepository;
import data.repositories.UserRepositoryImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImpTest {
    public static void main(String[] args) {

    }
private User user;
private User user2;
private UserRepository userRepository;

  @BeforeEach
  void setUp(){
       user = new User();
       user.setFirstName("chinelo");
       user.setLastName("may");
       user.setUserName("chichi");
       user.setPassword("ccc");
      userRepository = new UserRepositoryImp();

      user2= new User();
      user.setFirstName("chibaby");
      user.setLastName("pat");
      user.setUserName("chis");
      user.setPassword("cc");
userRepository = new UserRepositoryImp();
    }
    @Test
void saveUser_countIsOne() {
        User savedUser = userRepository.saveUser(user);
        assertEquals(1, userRepository.count());
    }
      @Test
              void testThatICanFindUserByTitle(){
          User savedUser = userRepository.saveUser(user2);
          User foundUser = userRepository.findUserByUserName("chis");
          assertEquals(1,userRepository.count());
        }

@Test
    void testThatICanFindById(){
      User savedUser = userRepository.saveUser(user2);
      User foundUser = userRepository.findUserById(2);
      assertEquals(1,userRepository.count());

}
@Test
    void testThatICanDelete(){
      User savedUser2 = userRepository.saveUser(user2);
      User savedUser= userRepository.saveUser(user);
      userRepository.delete(user2);
      assertEquals(1,userRepository.count());
}
    @Test
    void testThatICanDeleteAll() {
        User savedUser2 = userRepository.saveUser(user2);
        User savedUser = userRepository.saveUser(user);
        assertEquals(2,userRepository.count());
        userRepository.deleteAll();
        assertEquals(0, userRepository.count());
    }}

