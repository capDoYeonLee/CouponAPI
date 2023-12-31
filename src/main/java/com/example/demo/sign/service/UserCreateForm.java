package com.example.demo.sign.service;

import com.example.demo.sign.domain.SiteUser;
import com.example.demo.sign.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@RequiredArgsConstructor
public class UserCreateForm {
//    private String username;
//    private String password1;
//    private String password2;
//    private String email;


    private final UserRepository userRepository;

    public UserCreateForm(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public SiteUser saveUser(SiteUser siteUser){
        log.info(siteUser.toString());
        return userRepository.save(siteUser);
    }
//
//    public String setUsername() {
//        if (username == null || username.trim().isEmpty()) {
//            throw new IllegalArgumentException("사용자ID는 필수항목입니다.");
//        }
//        if (username.length() < 3 || username.length() > 25) {
//            throw new IllegalArgumentException("사용자ID는 3자에서 25자 사이여야 합니다.");
//        }
//        return username;
//    }
//
//
//    public String setPassword1() {
//        if (password1 == null || password1.isEmpty()) {
//            //throw new IllegalArgumentException("비밀번호는 필수항목입니다.");
//        } // Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is java.lang.IllegalArgumentException: 비밀번호는 필수항목입니다.] with root cause
//        return password1;
//    }
//    public String setPassword2() {
//        if (password2 == null || password2.isEmpty()) {
//            // throw new IllegalArgumentException("비밀번호 확인은 필수항목입니다.");
//        }
////        if (password1 != password2){
////            throw new IllegalArgumentException("비밀번호가 다릅니다.");
////        }
//        return password2;
//    }
//
//    public String setEmail() {
//        if (email == null || email.isEmpty()) {
//            throw new IllegalArgumentException("이메일은 필수항목입니다.");
//        }
//        if (!isValidEmail(email)) {
//            throw new IllegalArgumentException("유효하지 않은 이메일 주소입니다.");
//        }
//        return email;
//    }
//
//    // 이메일 유효성 검사 메서드
//    private boolean isValidEmail(String email) {
//        // 이메일 유효성 검사 로직을 추가해야 합니다.
//        // 예시: 정규식을 이용한 간단한 이메일 형식 검사
//        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
//        return email.matches(regex);
//    }
//
//    // 생성자, getter 등 필요한 메서드들을 추가하면 됩니다.
}