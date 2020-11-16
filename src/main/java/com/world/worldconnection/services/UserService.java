package com.world.worldconnection.services;

import com.world.worldconnection.domain.User;
import com.world.worldconnection.repositories.UserRepository;
import com.world.worldconnection.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(int id) {
        Optional<User> user = userRepository.findById(id);

        return user.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: "+id+", Tipo: "+user.getClass().getName()));
    }
}
