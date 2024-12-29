package com.infy.infytvseries.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.infy.infytvseries.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
Optional<User> findByEmailAndSeriesName(String email, String seriesName);
Optional<User> findByEmail(String email);
}
