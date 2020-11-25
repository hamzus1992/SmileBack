package com.smile.backend.service;

import com.smile.backend.model.PasswordResetTokenEntity;
import com.smile.backend.model.UserEntity;
import com.smile.backend.repository.PasswordResetTokenRepository;
import com.smile.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    PasswordResetTokenRepository passwordResetTokenRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createPasswordResetTokenForUser(final UserEntity user, final String token) {
        final PasswordResetTokenEntity myToken = new PasswordResetTokenEntity(token, user);
        passwordResetTokenRepository.save(myToken);
    }

    public UserEntity findById(Long userId) {
        return userRepository.getOne(userId);
    }

    public PasswordResetTokenEntity findTokenByUser(Long userId){
        return passwordResetTokenRepository.findByUser(userRepository.findById(userId).orElse(null));
    }

    public UserEntity changeUserPassword(final UserEntity user, final String password) {
        user.setPassword(passwordEncoder.encode(password));
        return userRepository.save(user);
    }

    public boolean checkIfValidOldPassword(final UserEntity user, final String oldPassword) {
        return passwordEncoder.matches(oldPassword, user.getPassword());
    }
}
