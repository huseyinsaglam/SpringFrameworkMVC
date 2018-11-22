package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PersonDAOImpl;
import domain.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAOImpl personDAOImpl;

	public void insertPerson(Person person) {
		personDAOImpl.insertPerson(person);
	}

	public Person getPersonById(int id) {
		return personDAOImpl.getPersonById(id);
	}

	public List<Person> getAllPersons() {
		return personDAOImpl.getAllPersons();
	}

	public void updatePerson(Person person) {
		personDAOImpl.updatePerson(person);
	}

	public void deletePerson(int id) {
		personDAOImpl.deletePerson(id);
	}
}
