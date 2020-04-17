package assignment4;

public class CourseRegistration {
	
	private String studentName;
	private int registrationID;
	private float qualifyingMarks;
	private double courseFee;
	private int courseID;
	private boolean hostelRequired;
	
	public CourseRegistration(
			String studentName,
			int registrationID,
			float qualifyingMarks,
			double courseFee,
			int courseID,
			boolean hostelRequired
			)
	{
		this.studentName = studentName;
		this.registrationID = registrationID;
		this.qualifyingMarks = qualifyingMarks;
		this.courseFee = courseFee;
		this.courseID = courseID;
		this.hostelRequired = hostelRequired;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void setRegistrationID(int registrationID)
	{
		this.registrationID = registrationID;
	}
	
	public void setQualifyingMarks(float qualifyingMarks)
	{
		this.qualifyingMarks = qualifyingMarks;
	}
	
	public void setCourseID(int courseID)
	{
		this.courseID = courseID;
	}
	
	public void setHostelRequired(boolean hostelRequired)
	{
		this.hostelRequired = hostelRequired;
	}
	
	public String getStudentName()
	{
		return this.studentName;
	}
	
	public int getRegistrationID()
	{
		return this.registrationID;
	}
	
	public float getQualifyingMarks()
	{
		return this.qualifyingMarks;
	}
	
	public double getCourseFee()
	{
		return this.courseFee;
	}
	
	public int getCourseID()
	{
		return this.courseID;
	}
	
	public boolean isHostelRequired()
	{
		return this.hostelRequired;
	}
	
	public boolean validateMarks()
	{
		return this.qualifyingMarks < 65f;
	}
	
	public boolean validateCourseID()
	{
		return (this.courseID > 1000 && this.courseID < 1006);
	}
	
	public void calculateCourseFee()
	{
		float discount = 0f;
		if (this.qualifyingMarks >= 85)
		{
			discount = 0.015f;
		}
		else if (this.qualifyingMarks >= 70)
		{
			discount = 0.010f;
		}
		else if (this.qualifyingMarks >= 65)
		{
			discount = 0.005f;
		}
		this.courseFee *= (1 - discount);
	}
	
	public void PrintDetails()
	{
		if (!validateCourseID())
		{
			System.out.println("Invalid Course ID m8");
		}
		else if (validateMarks())
		{
			System.out.println("Marks are too low m8");
		}
		else
		{
			calculateCourseFee();
			System.out.println("=============== Reg Deets ===================");
			System.out.println("Student Name: " + this.studentName);
			System.out.println("Course ID: " + this.courseID);
			System.out.println("Qualifying Marks: " + this.qualifyingMarks);
			System.out.println("Reg ID: " + this.registrationID);
			System.out.println("Total fee: " + this.courseFee);
			System.out.println("Hostel Reuqired: " + (this.hostelRequired ? "Yes" : "No"));
		}
	}
}
