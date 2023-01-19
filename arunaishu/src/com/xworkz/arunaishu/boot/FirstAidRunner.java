package com.xworkz.arunaishu.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.arunaishu.configuration.FirstAidConfiguration;
import com.xworkz.arunaishu.dto.FirstAidDto;
import com.xworkz.arunaishu.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(FirstAidConfiguration.class);
		FirstAidService service = container.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDto());
		System.out.println("saved" + saved);

	}

}
