package com.xworkz.custom.runner;

import com.xworkz.custom.repository.GmailRepository;
import com.xworkz.custom.repository.GmailRepositoryImpli;

public class GmailRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
				GmailRepository gmailRepository=new GmailRepositoryImpli();
				gmailRepository.create("nayana.xworkz@gmail.com");
				gmailRepository.create("anusha.xworkz@gmail.com");
				gmailRepository.create("smruthi.xworkz@gmail.com");
				gmailRepository.create("spoorthi.xworkz@gmail.com");
				gmailRepository.create("abhi.xworkz@gmail.com");
				gmailRepository.create("puneeth.xworkz@gmail.com");
				gmailRepository.create("yash.xworkz@gmail.com");
				gmailRepository.create("naveen.xworkz@gmail.com");
				gmailRepository.create("shwetha.xworkz@gmail.com");
				gmailRepository.create("sahana.xworkz@gmail.com");
				System.out.println(gmailRepository.totalGmails());

			}

}
