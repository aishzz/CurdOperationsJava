package com.xworkz.arunaishu.boot;

import com.xworkz.arunaishu.dto.SoldierDTO;
import com.xworkz.arunaishu.repository.SoilderRepo;
import com.xworkz.arunaishu.repository.SoilderRepo.SoldiersRepo;
import com.xworkz.arunaishu.repository.SoilderRepoImpli;
import com.xworkz.arunaishu.repository.SoldierRepo;
import com.xworkz.arunaishu.repository.SoldiersRepoImpl;
import com.xworkz.arunaishu.serviceImpli.SoldierServiceImpl;

public class SoldiersRunner 
{
		public static void main(String[] args) 
		{
			SoldierDTO dto = new SoldierDTO("anu", 7, 5, "India", "PDIT") ;
			SoldierServiceImpl service = new SoldierServiceImpl();
			SoldierRepo repo = new SoldiersRepoImpl();
			service.setSoldiersRepo(repo);
			service.validateAndSave(dto);
			
		}
}



