import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DBLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception  {
		
		Logger[] loggers = {new FileLogger(),new DBLogger()};
		
		Course course1 = new Course(1, "angular1", "3 haftada react", 0);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
		
		Category category1 = new Category(1, "Fronted2"); // kategori ismi tekrar edemez !
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		
		Instructor instructor1 = new Instructor(1, "engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
	}

}
