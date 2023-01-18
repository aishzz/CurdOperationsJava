package com.xworkz.arunaishu.boot;

import com.xworkz.arunaishu.dto.TerroristDTO;
import com.xworkz.arunaishu.service.TerroristService;
import com.xworkz.arunaishu.serviceImpli.TerroristServiceImpli;

public class TerroristRunner {
	

		public static void main(String[] args) {
			TerroristDTO terroristDTO = new TerroristDTO();
			terroristDTO.setName("ARUNICecream!!");
			terroristDTO.setAge(23);
			terroristDTO.setCountry("Mysore");
			terroristDTO.setOrganization("xworkzz");
			System.out.println(terroristDTO);

			TerroristService service = new TerroristServiceImpli();
			service.validateAndSave(terroristDTO);
		
	}
}
