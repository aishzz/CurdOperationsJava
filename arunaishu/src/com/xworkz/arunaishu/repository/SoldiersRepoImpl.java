package com.xworkz.arunaishu.repository;

import com.xworkz.arunaishu.dto.SoldierDTO;

public class SoldiersRepoImpl implements SoldierRepo {
	public SoldiersRepoImpl() {
		System.out.println("Created SoldiersRepoImpl using no arg const......");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("creted repositery");
		return false;
	}
}
