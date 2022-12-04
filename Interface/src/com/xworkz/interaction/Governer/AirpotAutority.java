package com.xworkz.interaction.Governer;

import com.xworkz.interaction.rules.AirPoat;

public class AirpotAutority<AirpotRules> {
	
		private AirPoat airpoat;

		public AirpotAutority() {
			System.out.println("Default const of AirportAuthority");
		}

		public AirpotAutority(AirpotRules airpoat) {
			this.airpoat = (AirPoat) airpoat;
		}

		public void departure() {
			System.out.println("running wearMask and luggage");
			if (this.airpoat != null) {
				boolean check = this.airpoat.wearMask();
				int check1 = this.airpoat.luggage();
				{
					if (check == true && check1 == 0) {
						System.out.println("Staff follow the rules");
					} else {
						System.out.println("Staff not follow the rules");
					}
				}
			}
		}

	}


