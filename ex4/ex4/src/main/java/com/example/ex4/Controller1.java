package com.example.ex4;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller1 {

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable String id){
    return "hello " + id;
    }

    @PostMapping("/user")
    @ResponseBody
    public User addNewUser(@RequestBody User user){
        List<User> listNewUser = new ArrayList<User>();
        listNewUser.add(new User(user.getName(),user.getCity(),user.getAge()));
        return user;

    }

    @PutMapping("user/post")
    public String putUser(@RequestParam (required=true) String var1, String var2){
        return var1 +" "+ var2;

    }

}
