package com.example.example.TongGiaHuy_420300154901.Nhom1.cau1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@PostMapping("/add")
	public Customer addCus(Customer customer) {
		return customerService.themCustomer(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer> listCustomer(){
		return customerService.listCustomer();
	}
}
