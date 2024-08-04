package com.corjava;
import java.util.*;

class Customer{
	
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
	
	//Method to display customer details
	public void displayCustomerDetails() {
		 System.out.println("ID: " + getId());
	     System.out.println("Name: " + getName());
	     System.out.println("Email: " + getEmail());
	     System.out.println("Phone: " + getPhone());
	     System.out.println("Password: " + getPassword());
	     System.out.println("Address: " + getAddress());
	}
}
class Encaps{
	
	//Main method to demonstrate the usage of the Customer class
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of customers:");
		int noOfCustomers=scanner.nextInt();
		scanner.nextLine();//Consume newLine
		
		//Creating an array to store Customer objects
		Customer[] customers=new Customer[noOfCustomers];
		
		//Loop to create and set values for each customer
		for(int i=0;i<noOfCustomers;i++) {
			customers[i]=new Customer();
			
			System.out.println("Enetr the detais of Customer"+(i+1)+":");
		
		
			//Taking the inputs from the user
			System.out.println("Enter Customer ID:");
			customers[i].setId(scanner.nextInt());
			scanner.nextLine();
			
			System.out.println("Enter Customer NAME:");
			customers[i].setName(scanner.nextLine());
			
			System.out.println("Enter Customer Email:");
			customers[i].setEmail(scanner.nextLine());
			
			System.out.println("Enter Customer PHONE:");
			customers[i].setPhone(scanner.nextLong());
			
			System.out.println("Enter Customer PASSWORD:");
			customers[i].setPassword(scanner.nextLine());
			scanner.nextLine();
			
			System.out.println("Enter Customer ADDRESS:");
			customers[i].setAddress(scanner.nextLine());
		}
		
		//Displaying the details of each Customer
		System.out.println("\nCustomer Details:");
		for(int i=0;i<noOfCustomers;i++) {
			System.out.println("\nCustomer"+(i+1)+":");
			customers[i].displayCustomerDetails();
		}
	}
}

