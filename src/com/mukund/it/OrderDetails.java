package com.mukund.it;

public class OrderDetails {

		// id
		// price
		//customerName
		//noOfItems
		private int id;
		private double price;
		private String customerName;
		private int noOfItems;
		
		public OrderDetails() {
			
		}
		
		public OrderDetails(int id, double price, String customerName, int noOfItems) {
			super();
			this.id = id;
			this.price = price;
			this.customerName = customerName;
			this.noOfItems = noOfItems;
		}

		// setter of customerName
		public void setCustomerName(String customerName) {
			this.customerName=customerName;
		}
		
		// getter of customerName
		public String getCustomerName() {
			return this.customerName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getNoOfItems() {
			return noOfItems;
		}

		public void setNoOfItems(int noOfItems) {
			this.noOfItems = noOfItems;
		}
	}


