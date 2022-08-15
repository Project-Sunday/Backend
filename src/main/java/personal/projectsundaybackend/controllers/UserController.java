package personal.projectsundaybackend.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import personal.projectsundaybackend.entities.User;
import personal.projectsundaybackend.services.UserService;

import java.util.List;

@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User u) {
        LOGGER.info("register() started execution");
        ResponseEntity<String> responseEntity;

        // TODO

        return responseEntity;
    }

    @GetMapping("/login")
    public ResponseEntity loginPage() {
        LOGGER.info("loginPage() started execution");

        // TODO Render login page

        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User u) {
        LOGGER.info("login() started execution");
        ResponseEntity<User> responseEntity;

        // TODO

        return responseEntity;
    }

    @GetMapping("/logout")
    public ResponseEntity<String> logout() {
        LOGGER.info("logout() started execution");
        userService.logout();
        LOGGER.info("Logout Successful!");
        return new ResponseEntity<String>("Logout Successful!", HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        LOGGER.info("getUsers() started execution");
        return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("/users/{username}")
    public ResponseEntity<User> getUser(@PathVariable("username") String username) {
        LOGGER.info("getUser() started execution");
        ResponseEntity<User> responseEntity;

        // TODO

        return responseEntity;
    }

    @PutMapping("/users")
    public ResponseEntity<User> updateUser() {
        LOGGER.info("updateUser() started execution");
        ResponseEntity<User> responseEntity;

        // TODO

        return responseEntity;
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") int id) {
        LOGGER.info("deleteUser() started execution");
        ResponseEntity<String> responseEntity;

        // TODO

        return responseEntity;

    }
}
