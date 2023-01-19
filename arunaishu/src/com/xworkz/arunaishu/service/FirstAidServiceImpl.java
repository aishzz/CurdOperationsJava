package com.xworkz.arunaishu.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.arunaishu.dto.FirstAidDto;
import com.xworkz.arunaishu.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	public FirstAidRepo firstAidRepo;
	public Validator validator;

	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		super();
		this.firstAidRepo = firstAidRepo;
	}

	@Autowired
	public void setFirstAidRepo(Validator validator) {
		this.validator=validator;
	}

	@Override
	public boolean validateAndSave(FirstAidDto firstAidDto) {
		System.out.println("running validate and save in repo");
		System.out.println("firstAidDto" + firstAidDto);
		Set<ConstraintViolation<FirstAidDto>> villan = validator.validate(firstAidDto);
		if (!villan.isEmpty()) {
			System.err.println(" error found ..");
			villan.forEach(aa -> System.err.println(aa.getMessage()));
			return false;
		} else {

			System.out.println("data is valid  can save");
			boolean saved = firstAidRepo.save(firstAidDto);
			System.out.println(" save" + saved);
			return true;
		}

	}

}
