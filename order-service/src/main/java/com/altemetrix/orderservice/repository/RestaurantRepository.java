package com.altemetrix.orderservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altemetrix.orderservice.domain.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

	List<Restaurant> findByLocation(String location);

	@Query("select r from Restaurant r" + " where  r.rating =:rating")
	List<Restaurant> searchRestaurantByRating(@Param("rating") Integer rating);

	@Query("select r from Restaurant r,RestaurantItem ri, PriceMatrix p"
			+ " where r.restaurantId = ri.restaurantId and " + " ri.matrixId = p.matrixId and"
			+ " current_time between p.startTime and p.endTime" + " and p.price = :price")
	List<Restaurant> searchRestaurantByPrice(@Param("price") Integer price);

}
