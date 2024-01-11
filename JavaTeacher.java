package www.kodnest.springframework.SpringPrject01;

public class JavaTeacher {
	
	int teacher_Id;
	String teacher_Name;
	public JavaTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JavaTeacher(int teacher_Id, String teacher_Name) {
		super();
		this.teacher_Id = teacher_Id;
		this.teacher_Name = teacher_Name;
	}
	public int getTeacher_Id() {
		return teacher_Id;
	}
	public void setTeacher_Id(int teacher_Id) {
		this.teacher_Id = teacher_Id;
	}
	public String getTeacher_Name() {
		return teacher_Name;
	}
	public void setTeacher_Name(String teacher_Name) {
		this.teacher_Name = teacher_Name;
	}
	@Override
	public String toString() {
		return "JavaTeacher [teacher_Id=" + teacher_Id + ", teacher_Name=" + teacher_Name + "]";
	}
	
	

}
