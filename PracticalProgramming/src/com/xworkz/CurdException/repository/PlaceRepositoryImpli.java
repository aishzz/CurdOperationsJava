package com.xworkz.CurdException.repository;

import com.xworkz.CurdException.customException.StorageFullExceptions;
import com.xworkz.CurdException.dto.PlaceDto;

public class PlaceRepositoryImpli implements PlaceRepository {
	public class PlaceRepositoryImpl implements PlaceRepository {
		public PlaceRepositoryImpl() {
			System.out.println("Running the no arguments PlaceRepositoryImpl");
			System.err.println("-----------------");
		}
		private PlaceDto [] place = new PlaceDto[5];
		private int liveIndex=0;
		public boolean storingData1(PlaceDto placeDTO) throws StorageFullExceptions {
			System.out.println("Running the PlaceRepository to storing data :-"+placeDTO);
			if(this.liveIndex>=this.place.length) {
				System.out.println("PlaceRepo is exceeding the Size:-"+place);
				throw new StorageFullExceptions("Storage is full maz size is needed:-"+placeDTO);
			}
			this.place[liveIndex]=placeDTO;
			System.out.println("Saved to"+placeDTO+"at index"+liveIndex);
			this.liveIndex++;
			return false;

}
		@Override
		public boolean storingData(PlaceDto placeDTO) {
			// TODO Auto-generated method stub
			return false;
		}
}

	@Override
	public boolean storingData(PlaceDto placeDTO) {
		// TODO Auto-generated method stub
		return false;
	}
}