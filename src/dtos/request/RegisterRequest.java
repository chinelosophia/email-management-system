package dtos.request;

public class RegisterRequest {
    private String firstName;
    private String lastName;

    private static String userName;
    private String password;
    private String dateRegistered;

    public String toString() {
        return  "UserRequest{" +
                " firstName='" + firstName + '\'' +
                ",lastName='"  +  lastName + '\'' +
                ",userName='"  +  userName + '\'' +
                ",password='"  +  password + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
