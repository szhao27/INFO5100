package assignment3;

public class Course{
	public String name;
	public int numberOfStudent;
	public Student[] regstu=new Student[10];
    public Course(String name) {
    	this.name=name;
    }
    public String getName() {
    	return this.name;
    }
    public void setName(String title) {
    	this.name = title;
    }
    
    public Student[] getStudents() {
    	return regstu;
    }
    public int getNumberOfStudent() {
    	return numberOfStudent;
    }
    public boolean isFull() {
    	if(numberOfStudent==10) {
    	   return true;
         }
    	else {return false;}
    }
    public void registerStudent(Student student) {
    	if(numberOfStudent==10) {
    		System.out.println("this course is full");
    		
    	}
    	else {regstu[numberOfStudent]=student;
    	      numberOfStudent++;
    	}
    }
    	
}
