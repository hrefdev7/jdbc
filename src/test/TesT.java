package test;

import java.util.ArrayList;

import dao.DAO;
 
 
import entity.Customers;

public class TesT {

	public static void main(String[] args) {
		
Customers c= new Customers(null,"sofia","34534535","href@ff.gmail","tui");
 DAO.insertNewCustomer(c);

	ArrayList<Customers> allCustomers =new ArrayList<Customers>();
	
			allCustomers =DAO.getAllPCustomers();
			for(Customers uss:allCustomers) {
				System.out.println(uss.toString());
				
			}

//DatabaseConnection.getInstance()
	;}

}
