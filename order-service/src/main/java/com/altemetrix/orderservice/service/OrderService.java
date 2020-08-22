package com.altemetrix.orderservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altemetrix.orderservice.domain.Booking;
import com.altemetrix.orderservice.domain.Restaurant;
import com.altemetrix.orderservice.repository.BookingRepository;
import com.altemetrix.orderservice.repository.RestaurantRepository;

@Service
public class OrderService {
	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private RestaurantRepository restaurantRepository;

	public Booking saveBooking(Booking booking) {

		return bookingRepository.save(booking);

	}

	public Restaurant saveRestaurant(Restaurant restaurant) {

		return restaurantRepository.save(restaurant);

	}

	public List<Restaurant> searchRestaurantByLocation(String location) {
		// TODO Auto-generated method stub
		return restaurantRepository.findByLocation(location);
	}

	public List<Restaurant> searchRatingOrPrice(Integer price, Integer rating) {
		if (!Objects.isNull(price) && rating == 0) {
			return restaurantRepository.searchRestaurantByPrice(price);
		} else if (!Objects.isNull(rating) && price == 0) {
			return restaurantRepository.searchRestaurantByRating(rating);
		}

		else {
			return new ArrayList<Restaurant>();
		}

	}

	public List<Restaurant> searchAllRestaurants() {
		// TODO Auto-generated method stub
		return restaurantRepository.findAll();
	}

}