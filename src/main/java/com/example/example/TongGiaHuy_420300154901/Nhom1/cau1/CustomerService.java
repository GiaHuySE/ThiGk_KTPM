package com.example.example.TongGiaHuy_420300154901.Nhom1.cau1;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public interface CustomerService {
	public Customer themCustomer(Customer customer);
	
	public List<Customer> listCustomer();

}
