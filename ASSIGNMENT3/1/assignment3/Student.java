package assignment3;

class Student{
	public String name;
	public int id;
	
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
 
	 public static void main(String[] args) {
		 Student zi=new Student("zi",1);
		 Student yang=new Student("yang",2);
		 Student liu=new Student("liu",3);
		 Student shan=new Student("shan",4);
		 Student zhao=new Student("zhao",5);
		 Course java=new Course("java");
		 System.out.println(java.getNumberOfStudent());
		 java.registerStudent(zi);
		 java.registerStudent(yang);
		 java.registerStudent(liu);
		 java.registerStudent(shan);
		 java.registerStudent(zhao);
		 System.out.println(java.getNumberOfStudent());
		 for(Student x:java.getStudents()) {
			 if(x!= null)
				 System.out.println("name: "+x.getName()+" ID:"+x.getId());
		 }
	 }
 }