package com.xworkz.interaction.boot;

import com.xworkz.interaction.Governer.AirpotAutority;
import com.xworkz.interaction.follower.Staff;
import com.xworkz.interaction.rules.AirPoat;

public class AirpoatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AirPoat airport = new Staff();
				AirpotAutority airpoat = new AirpotAutority(airport);
				airpoat.departure();

			}

	}

