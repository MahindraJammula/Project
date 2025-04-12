package org.example.repositories;


import org.example.entites.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	public Users findByEmail(String email);
}
