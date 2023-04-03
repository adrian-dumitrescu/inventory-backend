package com.softedit.inventory.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/user")
//@RequestMapping({"/api","/api/user"})
@CrossOrigin(origins = "http://localhost:4200/")
public class AppUserController {
}
