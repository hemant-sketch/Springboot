package org.chaiaurcode.restdemo.repository;

import org.chaiaurcode.restdemo.dto.CreateUserDto;
import org.chaiaurcode.restdemo.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {
    List<UserDto> users = new ArrayList<>();
    public UserRepository() {
        users.add(new UserDto(UUID.randomUUID().toString(), "Hemant", "hemant@test.com"));
        users.add(new UserDto(UUID.randomUUID().toString(), "Dhruv", "dhruv@test.com"));
        users.add(new UserDto(UUID.randomUUID().toString(), "Shivi", "shivi@test.com"));
    }

    public List<UserDto> getAll() {
        return this.users;
    }

    public UserDto findUserById(String id) {
        for(UserDto user : users){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public UserDto save(CreateUserDto createUserDto) {
        UserDto user = new UserDto(UUID.randomUUID().toString(), createUserDto.getName(), createUserDto.getEmail());

        users.add(user);
        return user;
    }

    public UserDto update(CreateUserDto createUserDto, String id) {
        for(UserDto user : users) {
            if(user.getId().equals(id)) {
                if (createUserDto.getEmail() != null) {
                    user.setEmail(createUserDto.getEmail());
                }
                if (createUserDto.getName() != null) {
                    user.setName(createUserDto.getName());
                }
                return user;
            }
        }
        return null;
    }

    public void deleteUser(String id) {
        users.removeIf((UserDto userDto) -> userDto.getId().equals(id));
    }
}
