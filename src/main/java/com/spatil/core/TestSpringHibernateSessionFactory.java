package com.spatil.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spatil.person.model.Person;
import com.spatil.person.service.PersonService;

/**
 * Test class to test the SpringHibernateSessionFactory Application
 * 
 */
public class TestSpringHibernateSessionFactory {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/config/spring-config.xml");
		PersonService personService = appContext.getBean("personService",
				PersonService.class);

//		Person person = new Person();
//		person.setName("sunil12");
//		person.setEmail("sunilpatil@gmail.com");
//
//		personService.savePerson(person);
//		System.out.println("Person Saved Successfully...");
//		
//
//		person.setEmail("sunilpatilnew@gmail.com");
//		personService.updatePerson(person);
//
//		System.out.println("Updated Person With New Email : "
//				+ personService.findPersonByName(person.getName()));
//
//		System.out.println("************* All Persons List*************");
//		List<Person> persons = personService.getAllPersons();
//		System.out.println(persons);
//
//		
//		System.out.println("persons.get(0).getId()"+persons.get(0).getId());
		//if (persons != null && persons.size() > 0)
			personService.deletePerson(1);
		
		System.out.println("User is deleted");

	}
}
