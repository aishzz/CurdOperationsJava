package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.College;

public class CollegeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String[] branchas = { "CSE", "ECS", "ME", "Civi", "Automobile" };
				String[] collegeNames = { "GEC Chamarajanagar", "GEC Hassan", "GEC KUshalNAgar" };
				String[] places = { "chamarajanagara", "hassan", "mandya", "davanagere" };
				String[] collageColors = { "White", "Red", "brown", "yellow" };

				College college = new College("Davanagere", collageColors, 2, branchas, 4, places, "Venkatesh",
						collegeNames);

				college.display();
			}

	}

