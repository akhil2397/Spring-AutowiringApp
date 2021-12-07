package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Dao {
     @Autowired // field injection can be done by reflection api when we want assign object to this private variable out of class
	private UserService userService;
      
	
	/*
	 * @Autowired // this will inform IOC to do DI for below public void
	 * setUserService(UserService userService) { this.userService = userService; }
	 */
	
	/*
	 * public Dao(UserService userService) {
	 * 
	 * this.userService = userService;
	 * 
	 * }// when we have only parameterized constructor we don't need to specify
	 * Autowired because as we already mentioned constructor so we know when object
	 * is created constructor will be called and so don't need to specify autowired
	 * IOC automatically after seeing constructor injects UserService object
	 * 
	 */
	public void saveUser() {
		
		boolean status = userService.save();
		if(status) {
			System.out.print("record inserted");
		}
		else
		{
			System.out.print("record not inserted");
		}
	}

	
}
