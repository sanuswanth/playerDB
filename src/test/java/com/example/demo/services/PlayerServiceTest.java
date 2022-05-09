package com.example.demo.services;

import com.example.demo.controller.CutomException;
import com.example.demo.entities.Player;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.service.PlayerService;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(value = { MockitoExtension.class })
class PlayerServiceTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();


	@Mock
	PlayerRepository playerRepository;

	@InjectMocks
	PlayerService playerService;


	@Test
	void getPlayerByIdExceptionTest() {
		when(playerRepository.findById("1234l")).thenReturn(Optional.empty());
		Assertions.assertThrows(CutomException.class, () -> {
			playerService.getPlayerById("1234l");

		});
	}

	@Test
	void getPlayerByIdException() {
		Player player = new Player();
		player.setPlayerID("123");
		when(playerRepository.findById("123")).thenReturn(Optional.of(player));
		assertEquals(playerService.getPlayerById("123").getPlayerID(), "123");
	}

	@Test
	void getPlayerByIdTest() {
		Player player = new Player();
		player.setPlayerID("123");
		when(playerRepository.findById("123")).thenReturn(Optional.of(player));
		assertEquals(playerService.getPlayerById("123").getPlayerID(), "123");
	}
}