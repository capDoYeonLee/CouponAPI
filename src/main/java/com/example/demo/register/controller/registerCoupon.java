package com.example.demo.register.controller;

import com.example.demo.register.repository.Coupon;
import com.example.demo.register.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class registerCoupon {

    private final CouponService couponService;

    @GetMapping("/register") //요청 url
    public String hello(Model model) {
        model.addAttribute("data", "hello!!"); // key, value
        return "register"; // template/hello.html
    }

    @Autowired
    public registerCoupon(CouponService couponService) {
        this.couponService = couponService;
    }


    @PostMapping("/process_form")
    public String processForm(@ModelAttribute Coupon coupon) {
        couponService.saveCoupon(coupon);
        return "redirect:/success"; // 쿠폰 등록이 성공적으로 처리되었을 때 보여줄 페이지
    }

}
