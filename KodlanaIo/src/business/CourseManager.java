package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	public void add(Course course) throws Exception {
		
		Course[] courses = {new Course(1, "java","6 derste java",10), new Course(2, "asp .net mvc","5 derste mvc",20), new Course(3, "angular", "10 derste angular", 0)};
		for (Course course2 : courses) {
			 if (course.getCourseName() == course2.getCourseName()) {
	                throw new Exception("Kurs ismi tekrar edemez.");
	            } else if (course.getPrice() < 0) {
	                throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz.");
	            }
		}
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
	

}
