package com.spring.api.dao;

import java.util.List;

import com.spring.api.model.player;



public interface PlayerDAO {

	public List<player> allplayers();
	
	public player getPlayer(int id);
	
	public void addplayer(player player);
	
	public void removeplayer(int id);
	
	public void removesomeplayer(List<Integer> ids);
}
