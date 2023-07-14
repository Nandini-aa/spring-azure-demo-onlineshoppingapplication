package com.nandini.shopapp.Service;



import java.util.List;
//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nandini.shopapp.Exception.ProductNotFoundException;
import com.nandini.shopapp.Model.Customer;
import com.nandini.shopapp.Model.Product;
import com.nandini.shopapp.Repository.ProductRepository;

@Service
@Component
public interface ProductService {
//	@Autowired
//	ProductRepository repo;

	public Product saveProduct(Product product);

	public List<Product> getAllProduct();

	//public Product getProduct(Integer id);

	Product getByProductName(String ProductName) throws ProductNotFoundException;
	
	 public Product getProduct(Integer productId);

	public Product updateProduct(Product product);

	public Product cancelProduct(Product product);

	public Product deleteProduct(Integer id);

	//public Product deleteProduct(String productName);
	 
	 
	 
	 
	
//    @org.springframework.transaction.annotation.Transactional
//    public List<Product> getAllProduct() {
//        return repo.findAll();
//    }

// 
//	@org.springframework.transaction.annotation.Transactional
//    public Product getByProductName(String ProductName) throws ProductNotFoundException {
//        if (repo.findByProductName(ProductName) == null)
//            throw new ProductNotFoundException("Product Not Found");
//        return repo.findByProductName(ProductName);
//    }
//	
//	public List<Double> getProductByIdList(List<String> ProductIdList) {
//        List<Double> mfValueList = new ArrayList<>();
//        List<Product> mfList = repo.findByProductIdIn(ProductIdList);
//        for (Product m : mfList) {
//            mfValueList.add(m.getProductPrice());
//        }
//        return mfValueList;
//    }
//	  public Product saveProduct(Product product) {
//	        return repo.save(product);
//	
//	  }


	
	
}



