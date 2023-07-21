package com.example.demo.sign.service;


import com.example.demo.sign.domain.SiteUser;
import com.example.demo.sign.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);
        //user.setCode(code);
        //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); // 암호화하여 비밀먼호 저장 -> 해싱 함수를 사용하여 암호화 -> 객체 생성을 안하는 이유? 빈으로 등록한 passwordEncoder 객체를 주입받음.
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
        return user;
    }
}

