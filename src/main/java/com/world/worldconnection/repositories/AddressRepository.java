package com.world.worldconnection.repositories;

import com.world.worldconnection.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
