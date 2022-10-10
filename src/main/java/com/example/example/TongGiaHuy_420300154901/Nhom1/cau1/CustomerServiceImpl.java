package com.example.example.TongGiaHuy_420300154901.Nhom1.cau1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepostitory customerRepostitory;

	@Override
	public Customer themCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepostitory.save(customer);
	}

	@Override
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		return customerRepostitory.findAll();
	}

}
