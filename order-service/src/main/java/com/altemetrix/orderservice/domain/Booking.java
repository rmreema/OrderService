package com.altemetrix.orderservice.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "booking")

public class Booking implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private Long bookingId;

	@Column(name = "restaurant_id")
	private Long restaurantId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "email_id")
	private String emailId;

	@Column(name = "address")
	private String address;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_id" , updatable = true)
	private List<BookingDetail> bookingDetails;
}
