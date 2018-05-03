package com.lowes.commerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection="address")
@Setter @Getter
public class Address {

	@Id
	private int addressId;
	private String addressType;
	private String status;
	private int isprimary;
	private String personTitle;
	private String lastName;
	private String firstName;
	private String phone1;
	private String phone2;
	private String fax1;
	private String fax2;
	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	private String email1;
	private int selfAddress;
	private String field1;
	private String field2;
	private String field3;
	private String shippingGeoCode;
	private String taxGeoCode;
	private int optCounter;
}
