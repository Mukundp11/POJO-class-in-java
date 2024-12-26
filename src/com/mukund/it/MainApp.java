package com.mukund.it;

public class MainApp {

	public static void main(String[] args) {

		OrderDetails order1=new OrderDetails();
		order1.setCustomerName("Mukund");
		order1.setId(1111);
		order1.setPrice(10000);
		order1.setNoOfItems(5);
		MainApp app=new MainApp();
		app.printOrderInfo(order1);
	}
	public void printOrderInfo(OrderDetails orderDetails) {
		 System.out.println(orderDetails.getId());
		 System.out.println( orderDetails.getPrice());
		 System.out.println(orderDetails.getCustomerName());
		System.out.println(orderDetails.getNoOfItems());
		sendOrder(orderDetails);
	}
	
	public void sendOrder(OrderDetails orderDetails) {
		 System.out.println(orderDetails.getId());
		 System.out.println( orderDetails.getPrice());
		 System.out.println(orderDetails.getCustomerName());
		System.out.println(orderDetails.getNoOfItems());
	}


	}


