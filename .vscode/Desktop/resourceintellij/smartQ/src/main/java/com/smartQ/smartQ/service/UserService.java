package com.smartQ.smartQ.service;
import com.smartQ.smartQ.entity.User;
import java.util.List;
import java.util.Optional;
public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserById(Integer id);

    void deleteUser(Integer id);
}