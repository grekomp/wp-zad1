package zad1;


import java.util.Date;

public class Student {
	int idStudent;
	String firstName;
	String lastName;
	int schoolId;
	
	Date createdAt;
	Date modifiedAt;
	int	createdById;
	int modifiedById;
	
	School school;
	
	public int getId() {
		return idStudent;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;	
	}
	
	public int getSchoolId() {
		return schoolId;
	}
	
	public School getSchool() {
		return school;
	}
	
	public String getSchoolName() {
		return school.getName();
	}
	
	
	public Student setFirstName(String name) throws Exception {
		if (name.length() == 0) {
			throw new Exception("Name too short");
		}else {
			firstName = name;
		}
		
		return this;
	}
	
	public Student setLastName(String name) throws Exception {
		if (name.length() == 0) {
			throw new Exception("Name too short");
		}else {
			lastName = name;
		}
		
		return this;
	}
	
	public Student setSchoolId(int schoolId) throws Exception {
		if (schoolId < 0) {
			throw new Exception("Id must not be lower than 0");
		} else {
			this.schoolId = schoolId;
		}
		
		return this;
	}
}
