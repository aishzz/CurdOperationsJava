package com.xworkz.arunaishu.boot;

import com.xworkz.arunaishu.dto.SoldierDTO;
import com.xworkz.arunaishu.repository.SoilderRepo;
import com.xworkz.arunaishu.repository.SoilderRepo.SoldiersRepo;
import com.xworkz.arunaishu.repository.SoilderRepoImpli;
import com.xworkz.arunaishu.serviceImpli.SoldierServiceImpl;

public class SoldiersRunner {


		public static void main(String[] args) {
			SoldierDTO dto = new SoldierDTO("chiru", 7, 5, "India", "PDIT") {
			};
			SoldierServiceImpl service = new SoldierServiceImpl();
			SoilderRepoImpli repo = new SoilderRepoImpli();
			service.validateAndSave(dto);

}
