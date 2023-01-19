package com.xworkz.arunaishu.repository;

import com.xworkz.arunaishu.dto.SoldierDTO;
import com.xworkz.arunaishu.repository.SoilderRepo.SoldiersRepo;

public class SoilderRepoImpli {


public class SoldiersRepoImpl implements SoldiersRepo {
	public SoldiersRepoImpl() {
		System.out.println("Created SoldiersRepoImpl using no arg const......");
	}

	public boolean save1(SoldierDTO dto) {
		System.out.println("Running save");
		System.out.println("DTO" + dto);
		return true;
	}

	@Override
	public boolean save(SoldierDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
}
}
