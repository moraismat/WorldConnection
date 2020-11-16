package com.world.worldconnection;

import com.world.worldconnection.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorldConnectionApplication implements CommandLineRunner {

	@Autowired
	private DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(WorldConnectionApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		dbService.instantiateTestDataBase();
	}

}
