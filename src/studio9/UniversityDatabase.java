package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
private final Map<String,Student> database;


public UniversityDatabase() {
	database = new HashMap<>();
}
public void addStudent(String accountName, Student student) {
	database.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		return database.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
			
		if ( database.get(accountName)== null)
			return null;
		else
			return  database.get(accountName).getFullName();
		
	}

	public double getTotalBearBucks() {
		// TODO
		double total = 0;
		for (String a: database.keySet()){
			total = total + database.get(a).getBearBucksBalance();
		}
		return total;
	}
}
