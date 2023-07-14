package com.nandini.shopapp.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends Exception {
	  public ProductNotFoundException(String message)
	    {
	        super(message);
	    }

}
