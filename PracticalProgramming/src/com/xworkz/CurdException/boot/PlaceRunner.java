package com.xworkz.CurdException.boot;

import java.time.LocalDateTime;

import javax.activity.InvalidActivityException;

import com.xworkz.CurdException.dto.PlaceDto;
import com.xworkz.CurdException.repository.PlaceRepository;
import com.xworkz.CurdException.repository.PlaceRepositoryImpli;
import com.xworkz.CurdException.services.PlaceService;
import com.xworkz.CurdException.services.PlaceServiceImpli;

public class PlaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				PlaceDto placeDTO = new PlaceDto();
				PlaceRepository placeRepository = new PlaceRepositoryImpli();
				PlaceServiceImpli placeService = (PlaceServiceImpli) new PlaceServiceImpli(placeRepository);
				try {
					placeService.validateData(placeDTO);
				}catch(InvalidActivityException e){
					e.printStackTrace();
				}
	}
}
