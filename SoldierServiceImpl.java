package com.xworkz.arunaishu.serviceImpli;


import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.arunaishu.dto.SoldierDTO;
import com.xworkz.arunaishu.repository.SoilderRepo.SoldiersRepo;
import com.xworkz.arunaishu.service.SoldierService;

import lombok.Setter;
@Setter
public class SoldierServiceImpl implements SoldierService {
	private SoldiersRepo soldiersRepo;

	public SoldierServiceImpl() {
		System.out.println("Created SoldierServiceImpl using no arg const..........");
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
			boolean saved = soldiersRepo.save(dto);
			System.out.println("Dto saved using repo " + saved);
			return saved;
		}
}

	@Override
	public boolean validateAndSave1(SoldierDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
}
