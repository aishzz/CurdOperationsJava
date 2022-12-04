package com.xworkz.interaction.boot;

import com.xworkz.interaction.Governer.Librarian;
import com.xworkz.interaction.follower.Readers;
import com.xworkz.interaction.rules.LibraryRules;

public class LibrarianRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method  class LibrarianRunner {

			LibraryRules libraryRules = new Readers();
			Librarian Librarian = new Librarian(libraryRules);
			Librarian.checking();

		}


}
