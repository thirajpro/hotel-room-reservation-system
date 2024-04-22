package com.pixel.hotelroomreservationsystem.repository;

import com.pixel.hotelroomreservationsystem.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Long> {
Optional<Users> findByEmail(String email);

}
