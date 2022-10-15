package business;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;


public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] logger) {
		
		this.instructorDao = instructorDao;
		this.loggers = logger;
	}
	
	
	
	public void add(Instructor instructor){ // response request
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getName() + " " + instructor.getLastName());
		}
	 //THROW FIRLATMA DEMEK.	
	}	

}
