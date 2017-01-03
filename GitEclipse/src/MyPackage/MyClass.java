package MyPackage;

import org.testng.annotations.Test;

public class MyClass {
	@Test
    public void login(){
    	System.out.println("Login page");
    }
	@Test
    public void logout(){
		System.out.println("Logout Page");
		System.out.println("Bye Bye");
		System.out.println("All");
    }   
} 
