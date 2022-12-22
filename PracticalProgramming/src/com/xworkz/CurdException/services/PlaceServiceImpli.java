package com.xworkz.CurdException.services;

import javax.activity.InvalidActivityException;

import com.xworkz.CurdException.dto.PlaceDto;
import com.xworkz.CurdException.repository.PlaceRepository;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

public class PlaceServiceImpli implements PlaceService {
	private PlaceRepository placeRepository;

	public PlaceServiceImpli(PlaceRepository placeRepository) {
		System.err.println("_________________");
		System.out.println("Running the PlaceRepositoryImpl parameterised Constructor");
		this.placeRepository = placeRepository;
	}

	public void PlaceServiceImpli1(PlaceRepository placeRepository2) {
	
	}

	
	@Override
	public boolean validateData1(PlaceDto PlaceDto) throws InternalException {
		System.err.println("----");
			
		System.out.println("Validating the Place DTO to save data to place Repo:-" + PlaceDto);
		System.err.println("____________");
		String placeHesru = placeHesru.getplaceHesru();
		Double famousFor = famousFor.getfamousFor();
		String famousDish = famousDish.getfamousDish();
		boolean busStands = busStands.getbusStands();
		String famousSweet = famousSweet.getfamousSweet();

		boolean validplaceHesru = false;
		boolean validfamousFor = false;
		boolean validfamousDish= false;
		boolean validbusStands = false;
		boolean validfamousSweet = false;

		if (placeHesru != null && placeHesru.length() >= 4 && placeHesru.length() <= 20) {
			System.out.println("The nameOfPlace is valid :-" + placeHesru);
			validplaceHesru = true;
		} else {
			System.out.println("The nameOfPlace is not valid :-" + placeHesru);
		}
		if (famousFor != null && famousFor >= 1000 && famousFor <= 20000) {
			System.out.println("The arenInSQKM is valid :-" + famousFor);
			validfamousFor = true;
		} else {
			System.out.println("The arenInSQKM is not valid :-" + famousFor);
		}
		if (famousDish != null && famousDish.length() >= 4 && famousDish.length() <= 20) {
			System.out.println("The distName is valid :-" + famousDish);
			validfamousDish = true;
		} else {
			System.out.println("The distName is not valid :-" + famousDish);
		}
		if (busStands != null && busStands.length() >= 4 && busStands.length() <= 20) {
			System.out.println("The taName is valid :-" + busStands);
			validbusStands = true;
		} else {
			System.out.println("The taName is not valid :-" + busStands);
		}
		if (famousSweet != null && famousSweet.length() >= 4 && famousSweet.length() <= 20) {
			System.out.println("The stateName is valid :-" + famousSweet);
			validfamousSweet= true;
		} else {
			System.out.println("The stateName is not valid :-" + famousSweet);
		}
		if (validplaceHesru && validfamousFor && validfamousFor && validbusStands && validfamousSweet) {
			System.out.println("The PlaceServiceImpl is varified and checked:-" + PlaceDto);
			System.err.println("_________________________________________");
			boolean saved = placeRepository.storingData(PlaceDto);
			System.out.println("The PlaceServiceImpl is varified and saved to PlaceRepository:-" + PlaceDto);
			System.err.println("___________________________________________________");
			return true;
		}
		throw new InvalidActivityException("Check the data you have entered:-" + PlaceDto);
	}

	@Override
	public boolean validateData(PlaceDto PlaceDto) throws InvalidActivityException {
		// TODO Auto-generated method stub
		return false;
	}

}
