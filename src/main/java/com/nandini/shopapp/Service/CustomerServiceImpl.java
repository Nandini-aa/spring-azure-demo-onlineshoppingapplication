package com.nandini.shopapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandini.shopapp.Model.Customer;
import com.nandini.shopapp.Repository.CustomerRepository;
import com.nandini.shopapp.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer addCustomer(Customer customer) {

		return repo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Customer deleteCustomer(int custId) {
		Customer customer = repo.findById(custId).get();
		repo.delete(customer);
		return customer;
	}

	@Override
	public Customer viewCustomer(int custId) {
		return repo.findById(custId).orElse(new Customer());
	}

	@Override
	public List<Customer> viewAllCustomers() {

		return repo.findAll();
	}

}
