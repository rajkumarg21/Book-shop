package com.raj.rest.api.BookShop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/*
 * Authore : Rajkumar Saad
*/

@Entity
@Table(name = "address", schema = "core")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addressid")
	private Long addressId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)
	private User user;

	@Column(name = "houseno")
	private String houseNo;

	@Column(name = "street1")
	private String street1;

	@Column(name = "street2")
	private String street2;

	@Column(name = "villagecity")
	private String villageCity;

	@Column(name = "district")
	private String district;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "pincode")
	private String pincode;

	public Address(Long addressId, User user, String houseNo, String street1, String street2, String villageCity,
			String district, String state, String country, String pincode) {
		super();
		this.addressId = addressId;
		this.user = user;
		this.houseNo = houseNo;
		this.street1 = street1;
		this.street2 = street2;
		this.villageCity = villageCity;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getVillageCity() {
		return villageCity;
	}

	public void setVillageCity(String villageCity) {
		this.villageCity = villageCity;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
