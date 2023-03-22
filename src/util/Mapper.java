package util;

import data.model.Email;
import data.model.User;
import dtos.request.CreateEmailRequest;

import dtos.request.RegisterRequest;
import dtos.response.RequestResponse;

import java.time.format.DateTimeFormatter;

public class Mapper {
    public static User map(RegisterRequest registerRequest ){
        User user = new User();
        user.setFirstName(registerRequest.getFirstName());
        user.setLastName(registerRequest.getLastName());
        user.setUserName(registerRequest.getUserName());
        user.setPassword(registerRequest.getPassword());
        return user;
    }
public static void map(RegisterRequest registerRequest,User user){
    user.setFirstName(registerRequest.getFirstName());
    user.setLastName(registerRequest.getLastName());
    user.setUserName(registerRequest.getUserName());
    user.setPassword(registerRequest.getPassword());
}
public static void map(CreateEmailRequest createEmailRequest, Email email){
     email.setSubject(createEmailRequest.getSubject());
     email.setBody(createEmailRequest.getBody());
     email.setEmailId(createEmailRequest.getId());
}
public static void map(User foundUser, RequestResponse response){
        response.setFullName(foundUser.getFirstName());
        response.getUserName(foundUser.getUserName());
        response.setUserId(foundUser.getUserId());
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("E,dd/MM/YYYY, hh:mm a");
    response.setDateRegistered(formatter.format(foundUser.getTimeCreated()));
}
}
