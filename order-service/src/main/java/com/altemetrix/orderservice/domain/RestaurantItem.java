package com.altemetrix.orderservice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "restaurant_item")
public class RestaurantItem implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private Long itemId;

	@Column(name = "restaurant_id")
	private Long restaurantId;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "matrix_id")
	private Integer matrixId;
	

}
