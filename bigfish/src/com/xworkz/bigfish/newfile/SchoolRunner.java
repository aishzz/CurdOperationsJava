package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.School;

public class SchoolRunner {

	public static void main(String[] args) {

						String[] branchas = { "CSE", "ECS", "ME", "Civi", "Automobile" };
						String[] collegeNames = { "GEC Chamarajanagar", "GEC Hassan", "GEC KUshalNAgar" };
						String[] places = { "chamarajanagara", "hassan", "mandya", "davanagere" };
						String[] collageColors = { "White", "Red", "brown", "yellow" };

						School college = new School("Davanagere", collageColors, 2, branchas, 4, places, "Venkatesh",
								collegeNames);

						School.display();
					}

	}


