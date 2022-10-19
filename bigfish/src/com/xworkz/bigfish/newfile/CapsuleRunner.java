package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.Capsule;

public class CapsuleRunner {

	public static void main(String[] args) {
		

				String[] paymentOptions = { "Cash", "Credit" };
				String[] itemTypes = { "Capsule", "coldtablet", "fevertablet", "stomachpaintablet" };
				String[] dolo = { "dolo650", "dolo457", "dolo192" };
				String[] use = { "Relief", "FeelsBetter" };
				double[] packingCovers = { 0.5, 1, 1.5, 2, 5, 10 };

				Capsule capsule= new Capsule("Aishwarya medical Store", "RajajiNagar", 56010,
						"Loki", "5am - 9pm", paymentOptions, itemTypes, dolo, use,packingCovers);

				capsule.display();
			}

	}
