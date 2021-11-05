package com.example.socialnetwork.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
//@RequestMapping()
public class CookiesController {

    @GetMapping("/cookies")
    public String getCookies(
            @CookieValue(value = "color", defaultValue = "#fff") String color,
            @CookieValue(value = "language", defaultValue = "Russian") String language,
            @CookieValue(value = "size", defaultValue = "15") String size,
            HttpServletRequest request,
            @RequestParam("color")Optional<String> colorChoosen,
            Model model
    ) {
        model.addAttribute("color", color);
        model.addAttribute("language", language);
        model.addAttribute("size", size);
        return "cookies";

    }

    @PostMapping("/cookies")
    public String updateCookies(
            HttpServletResponse response,
            @RequestParam("color")Optional<String> colorChoosen,
            @RequestParam("language")Optional<String> languageChoosen,
            @RequestParam("size")Optional<String> sizeChoosen,
            Model model
    ) {
        String color = "#fff";
        String language = "English";
        String size = "20";
        if(colorChoosen.get() != null) {
            color = colorChoosen.get();
            response.addCookie(new Cookie("color", color));
        }
        if(languageChoosen.get() != null) {
            language = languageChoosen.get();
            response.addCookie(new Cookie("language", language));
        }
        if(sizeChoosen.get() != null) {
            size = sizeChoosen.get();
            response.addCookie(new Cookie("size", size));
        }
        model.addAttribute("color", color);
        model.addAttribute("language", language);
        model.addAttribute("size", size);
        return "cookies";

    }

}
