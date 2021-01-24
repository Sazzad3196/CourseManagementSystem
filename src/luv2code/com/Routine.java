package luv2code.com;

public class Routine {
	private int id;
	private int day;
	private int hour;
	private String courseName;
	
	public Routine(int id, int day, int hour, String courseName) {
		super();
		this.id = id;
		this.day = day;
		this.hour = hour;
		this.courseName = courseName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
