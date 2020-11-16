package com.world.worldconnection.repositories;

import com.world.worldconnection.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
