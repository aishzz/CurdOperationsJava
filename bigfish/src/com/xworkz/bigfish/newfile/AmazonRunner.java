package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.Amazon;

public class AmazonRunner {

	
			public static void main(String[] args) {

				String[] categories = {"Grocery", "Mobiles", "Fashion", "Electronics"};
				String[] paymentMode = {"Debit Card", "Credit Card", "Cash On Delivery", "UPI"};
				String[] groceries = {"Atta, Rice & Dal", "Masala, Oil & Ghee", "Snacks", "Packaged Food", "Beverages"};
				String[] deliveryAddress = {"Home : BasaveshwarNagar", "Friend Roon : Rajajinagar"};
				String[] offers = {"Tshirts : 50-80% off", "Personal care : min 40% off"};
				String[] carts = {"Samsung galaxy a13", "samsung watch 4"};

				Amazon amazon = new Amazon("Flipkart", "Vinay", 8970877229l, "OnePlus Nord", 29000, categories,
						paymentMode, groceries, deliveryAddress, offers, carts);

				amazon.display();

			}

		
	}


