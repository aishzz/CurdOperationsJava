package com.xworkz.CurdException.services;

import javax.activity.InvalidActivityException;

import com.xworkz.CurdException.dto.PlaceDto;

public interface PlaceService {
		boolean validateData(PlaceDto PlaceDto) throws InvalidActivityException;

		boolean validateData1(PlaceDto PlaceDto) throws InvalidActivityException;
	}


