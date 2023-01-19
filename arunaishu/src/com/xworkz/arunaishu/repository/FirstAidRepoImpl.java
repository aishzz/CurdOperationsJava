package com.xworkz.arunaishu.repository;

import org.springframework.stereotype.Component;

import com.xworkz.arunaishu.dto.FirstAidDto;
@Component
public class FirstAidRepoImpl implements FirstAidRepo  {

	@Override
	public boolean save(FirstAidDto aidDTO) {
		System.out.println("running save in repo");
		return false;
	}
}
