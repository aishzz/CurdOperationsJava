package com.xworkz.arunaishu.serviceImpli;


import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.arunaishu.dto.SoldierDTO;
import com.xworkz.arunaishu.repository.SoldierRepo;
import com.xworkz.arunaishu.service.SoldierService;

import lombok.Setter;

public class SoldierServiceImpl implements SoldierService {
	private SoldierRepo soldierRepo;

	public SoldierServiceImpl() {
		System.out.println("Created SoldierServiceImpl using no arg const..........");
	}
	public void setSoldiersRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}
	
	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Running validateAndSave");
		System.out.println("DTO passed" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validates = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation = validates.validate(dto);

		if (!violation.isEmpty()) {
			System.err.println("Error is there");
			violation.forEach(c -> {
				System.out.println("violating Message" + c.getMessage());
			});
			return true;

		} else {
			System.out.println("Data is valid");
			boolean saved = soldierRepo.save(dto);
			System.out.println("Dto saved using repo " + saved);
			return saved;
		}
}

	

	
}
