package com.crud.mappings;

import com.crud.mappings.doa.AppDao;
import com.crud.mappings.entity.Instructor;
import com.crud.mappings.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudMappingsApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudMappingsApplication.class, args);

	}
	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao){
		return  runner -> {
			// createInsturctor(appDao);
			
			// findInstructor(appDao);

			   deleteInstructorById(appDao);
			

		};
	}

	private void deleteInstructorById(AppDao appDao) {

		int id=1;

		appDao.deleteInstructorById(id);

		System.out.println("Done");
	}

	private void findInstructor(AppDao appDao) {

		int id=1;

		Instructor teInstructor=appDao.findInstructorById(id);

		System.out.println("Instructor Data --------"+teInstructor);
	}

	private void createInsturctor(AppDao appDao) {

		//create the instructor
		Instructor instructor= new Instructor("Chad","Derby","chad@gmail.com");
		InstructorDetail instructorDetail=new InstructorDetail("https://www.youtube.com/","cricket");
		instructor.setInstructorDetail(instructorDetail);
		appDao.save(instructor);
	}

}
