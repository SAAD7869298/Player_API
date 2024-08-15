package com.spring.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.api.dao.PlayerDAO;
import com.spring.api.model.player;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerDAO playerdao;

	public PlayerServiceImpl() {

	}

	@Override
	@Transactional
	public List<player> allplayers() {
		return playerdao.allplayers();
	}

	@Override
	@Transactional
	public void saveplayer(player player) {
		playerdao.addplayer(player);
	}

	@Override
	@Transactional
	public player oneplayer(int id) {

		return playerdao.getPlayer(id);
	}

	@Override
	@Transactional
	public void deletesplayer(int id) {
		playerdao.removeplayer(id);
	}

	@Override
	@Transactional
	public void deletessomeplayer(List<Integer> ids) {
		playerdao.removesomeplayer(ids);
	}

}
