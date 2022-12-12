package com.xworkz.CurdException.boot;

import java.time.LocalDateTime;

import com.xworkz.CurdException.dto.IplDTO;
import com.xworkz.CurdException.repository.IplRepository;
import com.xworkz.CurdException.repository.IplRepositoryImpli;

public class IplRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic class IplRunner 
			IplRepository iplRepository = new IplRepositoryImpli();

			IplDTO team1 = new IplDTO();
			team1.setTeamName("RCB");
			team1.setCaptainName("Faf Duplessis");
			team1.setOwnerName("NA");
			team1.setNoOfDefeats(113);
			team1.setNoOfTrophies(0);
			team1.setNoOfWins(107);
			team1.setPurse(100);
			team1.setCreatedBy("SYSTEM");
			team1.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 0));
			team1.setUpdatedBy("SYSTEM");
			team1.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 15));
			iplRepository.makeTeam(team1);
			System.out.println(iplRepository.total());

			
			
			IplDTO team2 = new IplDTO();
			team2.setTeamName("SunRisersHydrabath");
			team2.setCaptainName("vindo");
			team2.setOwnerName("SUN");
			team2.setNoOfDefeats(89);
			team2.setNoOfTrophies(2);
			team2.setNoOfWins(56);
			team2.setPurse(100);
			team2.setCreatedBy("SYSTEM");
			team2.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 22));
			team2.setUpdatedBy("SYSTEM");
			team2.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 27));
			iplRepository.makeTeam(team2);
			System.out.println(iplRepository.total());
			
			IplDTO team3 = new IplDTO();
			team3.setTeamName("ChennaiSuperKings");
			team3.setCaptainName("M S DHONI");
			team3.setOwnerName("krishna");
			team3.setNoOfDefeats(90);
			team3.setNoOfTrophies(4);
			team3.setNoOfWins(128);
			team3.setPurse(100);
			team3.setCreatedBy("SYSTEM");
			team3.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 20));
			team3.setUpdatedBy("SYSTEM");
			team3.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 25));
			iplRepository.makeTeam(team3);
			System.out.println(iplRepository.total());
   
			IplDTO team4 = new IplDTO();
			team4.setTeamName("MumbaiIndians");
			team4.setCaptainName("Rohit Sharma");
			team4.setOwnerName("Ram");
			team4.setNoOfDefeats(56);
			team4.setNoOfTrophies(5);
			team4.setNoOfWins(156);
			team4.setPurse(100);
			team4.setCreatedBy("SYSTEM");
			team4.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 26));
			team4.setUpdatedBy("SYSTEM");
			team4.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 30));
			iplRepository.makeTeam(team4);
			System.out.println(iplRepository.total());
			
			
			IplDTO team5 = new IplDTO();
			team5.setTeamName("LuclnowSuperGaints");
			team5.setCaptainName("lucky");
			team5.setOwnerName("Rambo");
			team5.setNoOfDefeats(60);
			team5.setNoOfTrophies(0);
			team5.setNoOfWins(98);
			team5.setPurse(100);
			team5.setCreatedBy("SYSTEM");
			team5.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 29));
			team5.setUpdatedBy("SYSTEM");
			team5.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 33));
			iplRepository.makeTeam(team5);
			System.out.println(iplRepository.total());
			
			
			IplDTO team6 = new IplDTO();
			team6.setTeamName("GujaratTitans");
			team6.setCaptainName("Poky");
			team6.setOwnerName("Nandan");
			team6.setNoOfDefeats(48);
			team6.setNoOfWins(72);
			team6.setPurse(100);
			team6.setCreatedBy("SYSTEM");
			team6.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 38));
			team6.setUpdatedBy("SYSTEM");
			team6.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 40));
			iplRepository.makeTeam(team6);
			System.out.println(iplRepository.total());

			IplDTO team7 = new IplDTO();
			team7.setTeamName("DelhiCapitals");
			team7.setCaptainName("rishab");
			team7.setOwnerName("NA");
			team7.setNoOfDefeats(10);
			team7.setNoOfTrophies(0);
			team7.setNoOfWins(189);
			team7.setPurse(100);
			team7.setCreatedBy("SYSTEM");
			team7.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 40));
			team7.setUpdatedBy("SYSTEM");
			team7.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 42));
			iplRepository.makeTeam(team7);
			System.out.println(iplRepository.total());

			IplDTO team8 = new IplDTO();
			team8.setTeamName("KolkataKnightRiders");
			team8.setCaptainName("Iyer");
			team8.setOwnerName("koju");
			team8.setNoOfDefeats(106);
			team8.setNoOfTrophies(3);
			team8.setNoOfWins(103);
			team8.setPurse(100);
			team8.setCreatedBy("SYSTEM");
			team8.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 41));
			team8.setUpdatedBy("SYSTEM");
			team8.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 43));
			iplRepository.makeTeam(team8);
			System.out.println(iplRepository.total());

			
		
			IplDTO team9 = new IplDTO();
			team9.setTeamName("PunjabKings");
			team9.setCaptainName("shikar");
			team9.setOwnerName("DEad");
			team9.setNoOfDefeats(98);
			team9.setNoOfTrophies(0);
			team9.setNoOfWins(116);
			team9.setPurse(100);
			team9.setCreatedBy("SYSTEM");
			team9.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 45));
			team9.setUpdatedBy("SYSTEM");
			team9.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 46));
			iplRepository.makeTeam(team9);
			System.out.println(iplRepository.total());
			
			IplDTO team10 = new IplDTO();
			team10.setTeamName("RajasthanRoyals");
			team10.setCaptainName("sanjuu");
			team10.setOwnerName("ruby");
			team10.setNoOfDefeats(89);
			team10.setNoOfTrophies(2);
			team10.setNoOfWins(94);
			team10.setPurse(108);
			team10.setCreatedBy("SYSTEM");
			team10.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 45));
			team10.setUpdatedBy("SYSTEM");
			team10.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 46));
			iplRepository.makeTeam(team10);
			System.out.println(iplRepository.total());
			
	}

}
