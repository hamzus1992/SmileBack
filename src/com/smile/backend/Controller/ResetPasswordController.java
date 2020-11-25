package com.smile.backend.Controller;

import com.smile.backend.dto.PasswordDto;
import com.smile.backend.model.UserEntity;
import com.smile.backend.service.UserSecurityService;
import com.smile.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.rmi.UnexpectedException;

import java.util.UUID;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ResetPasswordController {

    @Autowired
    UserService userService;

    @Autowired
    UserSecurityService userSecurityService;

    @GetMapping(value = "/user/resetPassword/{id}")
    public String resetPassword(@PathVariable("id") long userId) throws UnexpectedException {
        UserEntity user = userService.findById(userId);
        if (user == null) {
            throw new UnexpectedException("User not found");
        }
        String token = UUID.randomUUID().toString();
        userService.createPasswordResetTokenForUser(user, token);
        return token;
    }

    @GetMapping("/user/changePassword/{token}")
    public boolean showChangePasswordPage( @PathVariable("token") final String token) {
        final String result = userSecurityService.validatePasswordResetToken(token);
        return result != null;
    }

    @PostMapping("/user/updatePassword")
    public UserEntity changeUserPassword(@RequestBody PasswordDto passwordDto) {
        final UserEntity user = userService.findById(passwordDto.getIdUser());
        return userService.changeUserPassword(user, passwordDto.getNewPassword());
    }
}
