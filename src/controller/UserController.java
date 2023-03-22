package controller;

import dtos.request.RegisterRequest;
import services.UserService;
import services.UserServiceImpl;

public class UserController {
    private final UserService userService=new UserServiceImpl();
    public Object register(RegisterRequest request){
        try {
            return userService.register(request);

        }catch (IllegalArgumentException ex){
            return ex.getMessage();
        }
    }
public Object findUserById(int id){
        return userService.findUser(id);
}
}

