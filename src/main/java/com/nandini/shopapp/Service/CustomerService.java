package com.nandini.shopapp.Service;

import java.util.List;

import com.nandini.shopapp.Model.Customer;

public interface CustomerService {

	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer deleteCustomer(int custId);

	Customer viewCustomer(int custId);

	List<Customer> viewAllCustomers();
}
