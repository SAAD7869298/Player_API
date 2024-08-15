package com.spring.api.service;

import java.util.List;

import com.spring.api.model.player;



public interface PlayerService {

	public List<player> allplayers();

	public void saveplayer(player player);

	public player oneplayer(int id);

	public void deletesplayer(int id);
	
	public void deletessomeplayer(List<Integer> ids);

}
