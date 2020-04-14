package com.todo.app.conroller;

import com.todo.app.model.WelcomeModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class WelcomeController {

    @GetMapping("/hello")
    public WelcomeModel getWelcomeModel() {
        WelcomeModel welcomeModel = new WelcomeModel();
        welcomeModel.setMessage("hello from rest service");
        return welcomeModel;
        //throw new RuntimeException("Something went wrong");
    }

    @GetMapping("/hello/{name}")
    public WelcomeModel getWelcomeModel(@PathVariable String name) {
        WelcomeModel welcomeModel = new WelcomeModel();
        welcomeModel.setMessage(String.format("Hello, %s, from rest service", name));
        return welcomeModel;
        //throw new RuntimeException("Something went wrong");
    }
}
