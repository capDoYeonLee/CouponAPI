package com.example.demo.sign.controller;

import com.example.demo.sign.domain.SiteUser;
import com.example.demo.sign.service.UserCreateForm;
import com.example.demo.sign.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequiredArgsConstructor
@Controller
public class UserController {


    private final UserCreateForm userCreateForm;
    private final UserService userService;

    @Autowired
    public UserController(UserService userService, UserCreateForm userCreateForm){
        this.userService = userService;
        this.userCreateForm = userCreateForm;
    }


    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("userCreateForm", userCreateForm);
        return "signup_form";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute SiteUser siteUser) {

//        if (!userCreateForm.setPassword1().equals(userCreateForm.setPassword2())) {
//            bindingResult.rejectValue("password2", "passwordInCorrect",
//                    "2개의 패스워드가 일치하지 않습니다.");
//            return "signup_form";
//        }

//        userService.create(userCreateForm.setUsername(),
//                userCreateForm.setEmail(), userCreateForm.setPassword1());

        userCreateForm.saveUser(siteUser);
        return "redirect:/";
    }
}