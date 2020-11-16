package com.world.worldconnection.resources;

import com.world.worldconnection.domain.User;
import com.world.worldconnection.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "api")
public class UserResource {

    @Autowired
    public UserService userService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> findByid(@PathVariable int id){
        User user = userService.findById(id);

        return ResponseEntity.ok().body(user);
    }
}
