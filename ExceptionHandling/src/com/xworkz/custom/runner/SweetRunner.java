package com.xworkz.custom.runner;

import com.xworkz.custom.repository.SweetNameRepository;
import com.xworkz.custom.repository.SweetNameRepositoryImpli;

public class SweetRunner {
	
		public static void main(String[] args) {
			SweetNameRepository nameRepository = new SweetNameRepositoryImpli();
			nameRepository.prepare("mysore pak");
			nameRepository.prepare("jaamuun");
			nameRepository.prepare("rasagulla");
			nameRepository.prepare("rasmalai");
			nameRepository.prepare("laddus");
			nameRepository.prepare("obbattu");
			nameRepository.prepare("kesaribath");
			nameRepository.prepare("Champakali");
			nameRepository.prepare("barfi");
			nameRepository.prepare("jalebi");
			System.out.println(nameRepository.totalSweets());

		}

}
