package org.sid;

import java.util.Date;

import org.sid.dao.PatientRepository;
import org.sid.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner{
	@Autowired
   private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null,"hassan",new Date(),false,8));
		patientRepository.save(new Patient(null,"samira",new Date(),false,9));
		patientRepository.save(new Patient(null,"mohammed",new Date(),false,12));
		patientRepository.findAll().forEach(p->{
			System.out.println(p.getName());
		});
	}

}
