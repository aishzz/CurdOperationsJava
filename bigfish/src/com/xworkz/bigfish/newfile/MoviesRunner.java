package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.Movies;

public class MoviesRunner {

	
			public static void main(String[] args) {

				
				String[] movieSongs = { "Singera Siri", "Varaha Roopam", "Vaa Poruluya", "Rebel Song" };
				int[] ticketPrice = { 100, 260, 200 };
				String[] characters = { "Shiva", "Rukkamini", "Leela", "Sudakara", "Kamala" };
				String[] language = { "Kannada", "English", "Hindi", "Telugu" };
				String[] castName = { "Rishab Shetty", "Sapthami", "Kishor", "Promodha Shetty" };
				String[] theatreName = { "Kaveri", "PVR cinimas", "Prasanna" };

				Movies movie = new Movies("Kantara", "Rishab Shetty", "Sapthami", 22, 100, 5, movieSongs, ticketPrice,
						characters, language, castName, theatreName);
				
				movie.display();
			}

		
	}


