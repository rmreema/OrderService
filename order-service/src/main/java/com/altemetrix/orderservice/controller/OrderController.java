package com.altemetrix.orderservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.altemetrix.orderservice.domain.Booking;
import com.altemetrix.orderservice.domain.Restaurant;
import com.altemetrix.orderservice.service.OrderService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/rest/order/")
@Api(tags = { "Order Service Operations" })
@Slf4j
public class OrderController {

	@Autowired
	private OrderService orderService;

	
	@PostMapping(value = "restaurant", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "restaurant", response = Booking.class)
	public @ResponseBody Restaurant saveRestaurant(@Valid @RequestBody Restaurant restaurant) {
		return orderService.saveRestaurant(restaurant);

	}
	@PostMapping(value = "booking", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "booking", response = Booking.class)
	public @ResponseBody Booking bookingOrder(@Valid @RequestBody Booking booking) {
		return orderService.saveBooking(booking);

	}
	
	@GetMapping(value = "location/search/{location}")
	@ApiOperation(value = "status", response = Restaurant.class)
	public List<Restaurant> searchRestaurantByLocation(@PathVariable("location") String location){
	
		 return orderService.searchRestaurantByLocation(location) ;
	
	}
			
	@GetMapping(value = "restaurant/search-price-rating/{price}/{rating}")
	@ApiOperation(value = "status", response = Restaurant.class)
	public List<Restaurant> searchRestaurantByRating(@PathVariable("price") Integer price,
			@PathVariable("rating") Integer rating){
	
		 return orderService.searchRatingOrPrice(price,rating) ;
	
	}
	
	@GetMapping(value = "restaurant/search-all")
	@ApiOperation(value = "status", response = Restaurant.class)
	public List<Restaurant> searchAllRestaurants(){
	
		 return orderService.searchAllRestaurants() ;
	
	}
	
	
	
}
