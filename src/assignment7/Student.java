package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int idNumber;
	private int attemptedCredits;
	private int passingCredits;
	private double bearBucks;
	private double qualityPoints;
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		idNumber = id;
		passingCredits = 0;
		attemptedCredits = 0;
		qualityPoints = 0;
	}
	/**
	 * This method returns a copy of the full name of a student
	 * @return first and last name of student
	 */
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	/**
	 * This method returns a copy of the student's id number
	 * @return student id number
	 */
	public int getId() {
		return this.idNumber;
	}

	/**
	 * This method adds bear bucks to the student's account
	 * @param amount amount of bear bucks to add to student's account
	 */
	public void depositBearBucks(double amount) {
		this.bearBucks = this.bearBucks + amount;
	}
	/**
	 * This method deducts bear bucks from the student's account
	 * @param amount amount of bear bucks that will be deducted from student account
	 */
	public void deductBearBucks(double amount) {
		this.bearBucks = this.bearBucks - amount;
	}
	/**
	 * This method returns a copy of the amount of bear bucks in a student's account
	 * @return student bear bucks balance 
	 */
	public double getBearBucksBalance() {
		return this.bearBucks;
	}
}
