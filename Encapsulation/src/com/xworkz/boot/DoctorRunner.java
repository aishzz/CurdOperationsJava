package com.xworkz.boot;

import com.xworkz.Encapsulation.thing.Doctor;
import com.xworkz.boot.child.Cardiologist;
import com.xworkz.boot.child.Dentist;
import com.xworkz.boot.child.Ent;
import com.xworkz.boot.constant.Gender;

public class DoctorRunner {


			public static void main(String[] args) {

	// DataTypes - Doctor, Object - Doctor./Dentist, Doctor, Object - Dentis
				
				Dentist dentist = new Dentist();
				System.out.println(dentist.name);
				System.out.println(dentist.specialist);
				System.out.println(dentist.income);
				System.out.println(dentist.gender);
				System.out.println(dentist.fee);

				System.out.println(System.lineSeparator());

				Doctor doctor = new Dentist();
				System.out.println(doctor.name);
				System.out.println(doctor.specialist);
				System.out.println(doctor.income);
				System.out.println(doctor.gender);
				// System.out.println(doctor.fee); - fee cannot be resolved or is not a field

				System.out.println(System.lineSeparator());

				Dentist dentist2 = (Dentist) doctor; // casting

				dentist2.setName("Dr. LOKI");
				dentist2.setSpecialist("Dentist");
				dentist2.setIncome(900000);
				dentist2.setGender(Gender.MALE);
				System.out.println(dentist2.name);
				System.out.println(dentist2.specialist);
				System.out.println(dentist2.income);
				System.out.println(dentist2.gender);
				System.out.println("Dentist fee : " + dentist2.fee); // can access after casting
				System.out.println("Dentist experiance : " + dentist2.experiance);

				System.out.println(System.lineSeparator());

				Doctor doctor2 = new Ent();
				Ent ent = (Ent) doctor2;
				ent.setName("Dr. Pallavi");
				ent.setSpecialist("ENT");
				ent.setIncome(750000);
				ent.setGender(Gender.FEMALE);
				System.out.println(ent.name);
				System.out.println(ent.specialist);
				System.out.println(ent.income);
				System.out.println(ent.gender);
				System.out.println("ENT fee : " + ent.fee);
				System.out.println("ENT experiance : " + ent.experiance);

				System.out.println(System.lineSeparator());

				Doctor doctor3 = new Cardiologist();
				Cardiologist cardiologist = (Cardiologist) doctor3;
				cardiologist.setName("Dr. Krishna");
				cardiologist.setSpecialist("Cardiologist");
				cardiologist.setIncome(850000);
				cardiologist.setGender(Gender.MALE);
				System.out.println(cardiologist.name);
				System.out.println(cardiologist.specialist);
				System.out.println(cardiologist.income);
				System.out.println(cardiologist.gender);
				System.out.println("Cardiologist fee : " + cardiologist.fee);
				System.out.println("Cardiologist experiance : " + cardiologist.experiance);

				
// * Patient patient = new Patient(); patient.consultDoctor(doctor);
// * patient.consultDoctor(dentist);
				
			}

}
