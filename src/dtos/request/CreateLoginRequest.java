package dtos.request;

import java.time.LocalDateTime;

public class CreateLoginRequest {
    private String userName;
    private String passWord;
    private LocalDateTime timeCreated= LocalDateTime.now();

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String toString() {
        return String.format("""
                        UserName: %s
                        Password: %s
                        Time created: %s
                """, userName,passWord,timeCreated);





    }}