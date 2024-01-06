package com.innovativeigniters.codeblox.controller;

import com.innovativeigniters.codeblox.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class UserRegistrationController {

    @RestController
    @RequestMapping("/users")
    public class UserController {

        @Autowired
//  TODO        private UserService userService;

        @PostMapping("/register")
        public ResponseEntity<String> registerUser(@RequestBody User user) {
    //TODO        User registeredUser = userService.registerUser(user);
            return ResponseEntity.ok("Success!");
        }

        // Other endpoints like login, updateProfile, etc.
    }

}
