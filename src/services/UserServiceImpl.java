package services;

import data.model.User;
import data.repositories.UserRepository;
import data.repositories.UserRepositoryImp;
import dtos.request.RegisterRequest;
import dtos.response.RequestResponse;
import util.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserServiceImpl implements UserService{
    private RegisterRequest registerRequest;
    private UserRepository userRepository=new UserRepositoryImp();
    @Override
    public User register(RegisterRequest registerRequest) {
        if(userExist(registerRequest.getUserName()))throw new IllegalArgumentException(registerRequest.getUserName()+"User Name already exists");
        return userRepository.saveUser(Mapper.map(registerRequest));
    }
    private boolean userExist(String userName) {
        User Found =userRepository.findUserByUserName(userName);
        return true;
    }
    @Override
    public RequestResponse findUser(int id) {
       User foundUser = userRepository.findUserById(id);
       if(foundUser == null)throw new NullPointerException("User doesnt exit");
       RequestResponse response = new RequestResponse();
       Mapper.map(foundUser,response);
        return response;
    }

    @Override
    public User findByUserName(String useName) {
        return null;
    }

    @Override
    public User findId(int id) {
        return null;
    }

    @Override
    public List<RequestResponse> findAll() {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteAll() {

    }
}
