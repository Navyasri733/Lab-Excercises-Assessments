package com.Example.repository;

import java.util.List;

import com.Example.entity.Address;

public interface IAddressRepository {
	
	Address addAddress(Address addr);
	Address deleteAddressById(int addrId);
	Address updateAddress(Address addr);
	List<Address>getAllAddresses(); 
	Address getAddressByAddress(int addrId);
	List<Address>getAddressByStudentId(int stuId);
	Address getAddressById(int addrId);
}
