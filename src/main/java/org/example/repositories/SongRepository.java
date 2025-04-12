package org.example.repositories;


import org.example.entites.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer> {
	public Song findByName(String name);
}
