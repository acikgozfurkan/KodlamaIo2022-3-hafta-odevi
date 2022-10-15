package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi " + instructor.getName() +" " + instructor.getLastName());		
	}

}
