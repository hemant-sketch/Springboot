package org.chaiaurcode.restdemo;

import org.chaiaurcode.restdemo.dto.CreateUserDto;
import org.chaiaurcode.restdemo.dto.UserDto;
import org.chaiaurcode.restdemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers() {
        return userRepository.getAll();
    }

    public UserDto getUserById(String id) {
        return userRepository.findUserById(id);
    }

    public UserDto createUser(CreateUserDto createUserDto) {
        return userRepository.save(createUserDto);
    }

    public UserDto updateUser(CreateUserDto createUserDto, String id) {
        if(userRepository.findUserById(id) == null) {
            return null;
        }

        return userRepository.update(createUserDto, id);
    }

    public void deleteUserById(String id) {
        if(userRepository.findUserById(id) == null) {
            return;
        }

        userRepository.deleteUser(id);
    }
}
