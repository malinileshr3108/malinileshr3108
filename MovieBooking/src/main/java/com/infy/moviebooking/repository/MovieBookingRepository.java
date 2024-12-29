package com.infy.moviebooking.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.infy.moviebooking.entity.MovieBooking;

public interface MovieBookingRepository extends CrudRepository<MovieBooking, Integer>{
@Query
   List<MovieBooking> getBookingsDetails (Long customerPhoneNo,LocalDate showDate);
   List<MovieBooking> findByScreenName(String screenName);
}
