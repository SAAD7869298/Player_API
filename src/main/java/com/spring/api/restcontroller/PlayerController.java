package com.spring.api.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.model.player;
import com.spring.api.service.PlayerService;

//http://localhost:8080/team_project/
@RestController
@RequestMapping("/api")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	/**
	 * Get all players.
	 * 
	 * @return List of players.
	 */
	// http://localhost:8080/player_api/api/players

	@GetMapping("/players")
	public List<player> players() {
		return playerService.allplayers();
	}

	/**
	 * Get a player by ID.
	 * 
	 * @param id The player's ID.
	 * @return The player object.
	 */
	// http://localhost:8080/player_api/api/oneplayer

	@GetMapping("/oneplayer/{id}")
	public player oneplayer(@PathVariable("id") int id) {
		return playerService.oneplayer(id);
	}

//	 //http://localhost:8080/player_api/api/oneplayer?id=2
//
//	@GetMapping("/oneplayer")
//	public player oneplayer1(@RequestParam int id) {
//		return playerService.oneplayer(id);
//	}

	/**
	 * Add a new player.
	 * 
	 * @param player The player to add.
	 * @return The added player.
	 */
// http://localhost:8080/player_api/api/addPlayer
	@PostMapping("/addPlayer")
	public void insertplayer(@RequestBody player player) {
		playerService.saveplayer(player);
		// return player;
	}

	/**
	 * Update an existing player.
	 * 
	 * @param player The player with updated information.
	 * @return The updated player.
	 */
//http://localhost:8080/player_api/api/updateplayer
	@PutMapping("/updateplayer")
	public void updateplayer(@RequestBody player player) {
		playerService.saveplayer(player);
// return player;
	}

	/**
	 * Delete a player by ID.
	 * 
	 * @param id The player's ID.
	 * @return HTTP status indicating the outcome.
	 */
	// http://localhost:8080/player_api/api/deleteonePlayer?id=3
	@DeleteMapping("/deleteonePlayer")
	public void delplayer(@RequestParam int id) {
		playerService.deletesplayer(id);
	}

	/**
	 * Delete multiple players by their IDs.
	 * 
	 * @param ids List of player IDs to delete.
	 * @return HTTP status indicating the outcome.
	 */
// http://localhost:8080/player_api/api/deletesomePlayer?ids=1&ids=2
	@DeleteMapping("/deletesomePlayer")
	public void delsomeplayer(@RequestParam List<Integer> ids) {
		playerService.deletessomeplayer(ids);
	}

}
