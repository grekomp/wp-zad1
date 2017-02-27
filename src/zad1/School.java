package zad1;

public class School {
	int idSchool;
	String name;
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return idSchool;
	}
	
	public School setId(int id) throws Exception {
		if (id < 0) {
			throw new Exception("Id must not be lower than 0");
		} else {
			this.idSchool = id;
		}
		
		return this;
	}
	
	public School setName(String name) throws Exception {
		if (name.length() == 0) {
			throw new Exception("Name too short");
		} else {
			this.name = name;
		}
		return this;
	}
}
