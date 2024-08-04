package com.packages;
import java.util.*;

public class Customer {
	
	//Private attributes for customer information
	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	private String address;
	
	//Getter and Setter methods for each attribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//Main method to demonstrate the usage of the Customer class
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//Creating an object of customer 
		Customer customer =new Customer();
		
		//Taking the inputs from the user and setting values
		System.out.println("Enter Customer ID:");
		customer.setId(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Enter Customer NAME:");
		customer.setName(scanner.nextLine());
		
		System.out.println("Enter Customer Email:");
		customer.setEmail(scanner.nextLine());
		
		System.out.println("Enter Customer PHONE:");
		customer.setPhone(scanner.nextLong());
		
		System.out.println("Enter Customer PASSWORD:");
		customer.setPassword(scanner.nextLine());
		scanner.nextLine();
		
		System.out.println("Enter Customer ADDRESS:");
		customer.setAddress(scanner.nextLine());
		
		//Displaying the values using getters
		System.out.println("\nCustomer Details:");
		System.out.println("ID: "+ customer.getId());
		System.out.println("NAME: "+ customer.getName());
		System.out.println("EMAIL: "+ customer.getEmail());
		System.out.println("PHONE: "+ customer.getPhone());
		System.out.println("PASSWORD: "+ customer.getPassword());
		System.out.println("ADRESS: "+ customer.getAddress());
	}
	
}
