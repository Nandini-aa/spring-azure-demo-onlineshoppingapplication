package com.nandini.shopapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandini.shopapp.Exception.ProductNotFoundException;
import com.nandini.shopapp.Model.Product;
import com.nandini.shopapp.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repo;

	@Override
	public List<Product> getAllProduct() {
	
       return repo.findAll();


	}

	@Override
	public Product getByProductName(String ProductName) throws ProductNotFoundException {
		 if (repo.findByProductName(ProductName) == null)
         throw new ProductNotFoundException("Product Not Found");
      return repo.findByProductName(ProductName);
   }

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		  return repo.save(product);
	}

	@Override
	public Product getProduct(Integer productId) {
			 Product product = repo.findById(productId).get();
			repo.findById(productId);
			return product;
		}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public Product cancelProduct(Product product) {
		repo.delete(product);
		return product;
	}

	@Override
	public Product deleteProduct(Integer id) {
		Product product = repo.findById(id).get();
		repo.delete(product);
		return product;
	}

//	@Override
//	public Product deleteProduct(String productName) {
//		// TODO Auto-generated method stub
//		Product product = repo.findByProductName(productName).get();
//		repo.delete(product);
//		return product;
//	}
	

}
