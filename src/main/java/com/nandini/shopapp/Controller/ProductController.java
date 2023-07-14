package com.nandini.shopapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nandini.shopapp.Model.Product;
import com.nandini.shopapp.Repository.ProductRepository;
import com.nandini.shopapp.Service.ProductService;

@EnableMongoRepositories
@RestController
public class ProductController {
	@Autowired
	ProductRepository repo;
	@Autowired
	ProductService productservice;

	@GetMapping("/")
	public ResponseEntity<?> home() {

		return new ResponseEntity<>("welcome", HttpStatus.OK);
	}
//add product
	@CrossOrigin(origins = "*")
	@PostMapping("/addproduct")
	public ResponseEntity<?> addproduct(@RequestBody Product product) {

		return new ResponseEntity<>(productservice.saveProduct(product), HttpStatus.OK);

	}
//view all products
	@CrossOrigin(origins = "*")
	@GetMapping("/product/all")

	public List<Product> getAllProduct() {

		return productservice.getAllProduct();

	}
	//get product by id 
	@CrossOrigin(origins = "*")
		@GetMapping("/products/{id}")
		public Product getProduct(@PathVariable("id") Integer id) {
			return productservice.getProduct(id);
		}
	
		
		//updating product details
		@CrossOrigin(origins = "*")
		@PutMapping("/updateproduct")
		public Product updateProduct(@RequestBody Product product){
			return productservice.updateProduct(product);
		}
		
			
////		//deleting the product
		@CrossOrigin(origins = "*")
		@DeleteMapping("/deleteproduct")
		public Product deleteProduct(@RequestBody Product product){
		return productservice.cancelProduct(product);
	}
	//deleting the product by id
		@CrossOrigin(origins = "*")
		@DeleteMapping("/deleteproducts/{id}")
		public Product deleteProduct(@PathVariable("id") Integer id) {
			
			return productservice.deleteProduct(id);
		}
//		//deleting the product by id
//				@CrossOrigin(origins = "*")
//				@DeleteMapping("/deleteproducts/{name}")
//				public Product deleteProduct(@PathVariable("name") String ProductName) {
//					
//					return productservice.deleteProduct(ProductName);
//				}
//		
		
	
//	@GetMapping("/productapp/product/search/{ProductName}")
//    public  ResponseEntity<Product> getProductByName (@PathVariable ("ProductName") String ProductName){
//        Product product = repo.findByProductName(ProductName);
//        if (product != null) {
//            return ResponseEntity.status(HttpStatus.OK).body(product);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }



}
