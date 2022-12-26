package com.gondue.shop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@RestController
@Slf4j
public class HealthCheckController {

    @GetMapping("/")
    public String healthy(Locale locale) {
        log.info("Welcome home! The client locale is {}.", locale);

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
        String formattedNow = now.format(formatter);

        return "This server is running.... " + formattedNow;
    }
}
