package org.example.services;



import org.example.entites.Playlist;
import org.example.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImplmentation implements PlaylistService{
	@Autowired
	PlaylistRepository repo;

	@Override
	public void addPlaylist(Playlist playlist) {
		repo.save(playlist);
	}

	@Override
	public List<Playlist> fetchAllPlaylists() {
		return repo.findAll();
	}
}
