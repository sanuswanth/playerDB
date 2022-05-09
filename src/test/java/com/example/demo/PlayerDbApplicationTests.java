package com.example.demo;

import com.example.demo.entities.Player;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.service.PlayerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest
@ActiveProfiles(profiles = "test")
class PlayerDbApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	PlayerRepository playerRepository;

	@MockBean
	PlayerService playerService;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws Exception {
		List<Player> mockPlayerList = new ArrayList<>();
		Player mockPlayer = new Player();
		mockPlayer.setPlayerID("1234");
		mockPlayer.setNameFirst("Sanus");
		mockPlayerList.add(mockPlayer);
		when(playerService.getAllPlayers()).thenReturn(mockPlayerList);
		MockHttpServletResponse responseObject = mockMvc.perform(get("/api/players")).andExpect(status().isOk()).andReturn().getResponse();
		String resString = responseObject.getContentAsString();
		Player[] pojos = objectMapper.readValue(resString, Player[].class);
		List<Player> mcList = new ArrayList<>(Arrays.asList(pojos));
		assertEquals(1, mcList.size());
		assertEquals("Sanus",mcList.get(0).getNameFirst());
	}

}