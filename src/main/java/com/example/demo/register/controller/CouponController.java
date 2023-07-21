//package com.example.demo.controller;
//
//import com.example.demo.repository.Coupon;
//import com.example.demo.service.CouponService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class CouponController {
//    private final CouponService couponService;
//
//    @Autowired
//    public CouponController(CouponService couponService) {
//        this.couponService = couponService;
//    }
//
//    @PostMapping("/process_form")
//    public String processForm(@ModelAttribute Coupon coupon) {
//        couponService.saveCoupon(coupon);
//        return "redirect:/success"; // 쿠폰 등록이 성공적으로 처리되었을 때 보여줄 페이지
//    }
//}
