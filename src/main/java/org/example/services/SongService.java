package org.example.services;



import org.example.entites.Song;

import java.util.List;

public interface SongService {
	public void addSong(Song song);

	public List<Song> fetchAllSongs();

	public boolean songExists(String name);

	public void updateSong(Song song);
}
