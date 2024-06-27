package com.example.bunker.encoder;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderUtil {

    @Bean
    public PasswordEncoder passwordEncoderUtil() {
        return new BCryptPasswordEncoder();
    }

    public String encode(String rawPassword) {
        return passwordEncoderUtil().encode(rawPassword);
    }

    public boolean matches(String rawPassword, String encodedPassword) {
        return passwordEncoderUtil().matches(rawPassword, encodedPassword);
    }
}
