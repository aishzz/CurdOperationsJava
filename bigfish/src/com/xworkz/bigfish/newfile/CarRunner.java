package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.Car;

public class CarRunner {

	public static void main(String[] args) {
		

				String[] category = { "cieling fan", "table fan" };
				String[] brands = { "crompton", "usha", "orient" };
				String[] seller = { "amazon", "fli[pkart" };
				boolean[] energySaving = { true, false };

				Car fan = new Car(2000, 6, "stainless steel", "orient", 4, category, brands, seller, energySaving);

				fan.display();
			}

	}

