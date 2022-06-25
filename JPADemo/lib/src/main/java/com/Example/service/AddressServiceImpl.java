package com.Example.service;

import java.util.List;

import com.Example.entity.Address;
import com.Example.repository.AddressRepositoryImpl;
import com.Example.repository.IAddressRepository;

public class AddressServiceImpl  implements IAddressService{

	
		IAddressRepository addrRepo = new AddressRepositoryImpl();
		
		
	@Override
	public Address addAddress(Address addr) {
		
		return addrRepo.addAddress(addr);
	}

	@Override
	public Address deleteAddressById(int addrId) {
		//search address
		Address addr = addrRepo.getAddressById(addrId);
		Address deletedAddr = null;
		if(addr!=null) {
			deletedAddr = addrRepo.deleteAddressById(addrId);
		}
		return deletedAddr;
	}

	@Override
	public Address updateAddress(Address addr) {
		
		Address searchAddr = addrRepo.getAddressById(addr.getAddrId());
		Address updatedAddr = null;
		if(searchAddr!= null) {
			 updatedAddr = addrRepo.updateAddress(addr);
		}
		return addrRepo.updateAddress(addr);
	}

	@Override
	public List<Address> getAllAddresses() {
	
		return addrRepo.getAllAddresses();
	}

	@Override
	public Address getAddressByAddress(int addrId) {
		
		return addrRepo.getAddressByAddress(addrId);
	}
	
	@Override
	public Address getAddressById(int addrId) {
		
		return addrRepo.getAddressById(addrId);
	}
	@Override
	public List<Address> getAddressByStudentId(int stuId) {
		
		return addrRepo.getAddressByStudentId(stuId);
	}

}
