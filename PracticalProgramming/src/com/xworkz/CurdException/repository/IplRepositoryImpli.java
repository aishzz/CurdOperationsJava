package com.xworkz.CurdException.repository;

import com.xworkz.CurdException.customException.IplTeamSizeExceedException;
import com.xworkz.CurdException.dto.IplDTO;

public class IplRepositoryImpli implements IplRepository {
		private IplDTO[] iplDto = new IplDTO[10];
		private int currentIplIndex = 0;

		@Override
		public boolean makeTeam(IplDTO dto) {
			System.out.println("running the makeTeam");
			if(this.currentIplIndex>=iplDto.length) {
				throw new IplTeamSizeExceedException();
			}
			this.iplDto[this.currentIplIndex] = dto;
			currentIplIndex++;
			System.out.println("saved "+dto+"in index"+total());
			
			return true;
		}
	    @Override
		public int total() {
			System.out.println("running the total");
			return this.currentIplIndex;

		}
	
}
