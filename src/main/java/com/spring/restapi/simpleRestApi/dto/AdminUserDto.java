package com.spring.restapi.simpleRestApi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.restapi.simpleRestApi.model.Status;
import com.spring.restapi.simpleRestApi.model.User;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdminUserDto {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String status;

    public User toUser() {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setFirstname(firstName);
        user.setLastname(lastName);
        user.setEmail(email);
        user.setStatus(Status.valueOf(status));

        return user;
    }

    public static AdminUserDto fromUser(User user){
        AdminUserDto adminUserDto = new AdminUserDto();
        adminUserDto.setId(user.getId());
        adminUserDto.setUsername(user.getUsername());
        adminUserDto.setFirstName(user.getFirstname());
        adminUserDto.setLastName(user.getLastname());
        adminUserDto.setEmail(user.getEmail());


        return adminUserDto;
    }
}
