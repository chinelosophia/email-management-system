package services;

import data.model.User;
import dtos.request.RegisterRequest;
import dtos.response.RequestResponse;

import java.util.List;

public interface UserService {
    User register(RegisterRequest request);
    RequestResponse findUser(int id);
    User findByUserName(String useName);
    User findId(int id);
    List<RequestResponse> findAll();
    void delete(User user);
    void delete(int id);
    void deleteAll();


}
