package org.example.services;




import org.example.entites.Playlist;

import java.util.List;

public interface PlaylistService {
	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();
}
