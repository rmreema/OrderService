package com.altemetrix.orderservice.service;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.altemetrix.orderservice.domain.Restaurant;
import com.altemetrix.orderservice.domain.RestaurantItem;
import com.altemetrix.orderservice.repository.RestaurantRepository;

@RunWith(SpringRunner.class)
public class OrderServiceTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
 
        @Bean
        public OrderService employeeService() {
            return new OrderService();
        }
    }
 
    @Autowired
    private OrderService orderService;
 
    @MockBean
    private RestaurantRepository restaurantRepository;
    
    @Before
    public void setUp() {
        Restaurant restaurant = new Restaurant();
         restaurant.setRestaurantName("mario");
         restaurant.setRestaurantId(1L);
         restaurant.setLocation("madipakkam");
         restaurant.setRating(3);
         RestaurantItem item = new RestaurantItem();
         item.setItemId(1L);
         item.setItemName("chicken");
         item.setMatrixId(1);
         item.setRestaurantId(1L);
         Set<RestaurantItem> restaurantItems = new HashSet<>(); 
         restaurant.setRestaurantItems(restaurantItems);
         
     
         
        List<Restaurant> list = new ArrayList<>();
        list.add(restaurant);
        Mockito.when(restaurantRepository.findAll())
          .thenReturn(list);   
    }
 

@Test
	public void whenAll_RestaurantShouldBeFound() {
        List<Restaurant> found = orderService.searchAllRestaurants();
     
         assertEquals(found.size(), 1);
         
      
     }


}
