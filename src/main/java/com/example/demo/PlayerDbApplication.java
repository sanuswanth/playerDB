package com.example.demo;

import com.example.demo.entities.Player;
import com.example.demo.repository.PlayerRepository;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@SpringBootApplication
public class PlayerDbApplication {
	
	@Autowired
	PlayerRepository playerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PlayerDbApplication.class, args);
	}
	
	
	@Bean
//	@Profile("!test")
	CommandLineRunner loadData() {
		return args -> {
			ClassPathResource cpr = new ClassPathResource("player.csv");
			BufferedReader reader = new BufferedReader(new InputStreamReader(cpr.getInputStream()));
			MappingIterator<Player> playerList = new CsvMapper().readerWithTypedSchemaFor(Player.class).readValues(reader);
			List<Player> readAll = playerList.readAll();
			readAll.remove(0);
			playerRepository.saveAll(readAll);
			/*Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a file name: ");
			System.out.flush();
			String filename = scanner.nextLine();
			File file = new File(filename);
			while(!file.exists()) {
				System.out.print("Enter a Valid file name: ");
				System.out.flush();
				filename = scanner.nextLine();
				file = new File(filename);
			}
			Reader reader = new FileReader(file);
			MappingIterator<Player> playerList = new CsvMapper().readerWithTypedSchemaFor(Player.class).readValues(reader);
			List<Player> readAll = playerList.readAll();
			readAll.remove(0);
			playerRepository.saveAll(readAll);*/
		    return;
		};
	}

}
