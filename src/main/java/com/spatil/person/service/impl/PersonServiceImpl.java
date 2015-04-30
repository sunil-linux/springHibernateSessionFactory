package com.spatil.person.service.impl;

import java.util.List;

import com.spatil.person.dao.PersonDao;
import com.spatil.person.model.Person;
import com.spatil.person.service.PersonService;

public class PersonServiceImpl implements PersonService{

	private PersonDao personDao;
	
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson(Person person) {
		getPersonDao().savePerson(person);
		
	}

	@Override
	public void updatePerson(Person person) {
		getPersonDao().updatePerson(person);		
	}

	@Override
	public void deletePerson(Integer personId) {
		getPersonDao().deletePerson(personId);	
		
	}

	@Override
	public Person findPersonById(Integer personId) {
		return getPersonDao().findPersonById(personId);
	}

	@Override
	public Person findPersonByName(String personName) {
		return getPersonDao().findPersonByName(personName);
	}

	@Override
	public List<Person> getAllPersons() {		
		return getPersonDao().getAllPersons();
	}

}
