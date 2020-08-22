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
@Table(name = "booking_detail")
public class BookingDetail implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "detail_id")
	private Long detailId;

	@Column(name = "booking_id")
	private Long bookingId;

	@Column(name = "item_id")
	private String itemId;

	@Column(name = "quantity")
	private String quantity;
	
	@Column(name = "amount")
	private String amount;
	
	
}
