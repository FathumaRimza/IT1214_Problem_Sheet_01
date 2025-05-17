class Student{
 private String name;
private int exam1;
private int exam2;
private int exam3;



boolean validMarks(int marks){
if(marks<=100 && marks>=0){
	return true;
}
else
{
return false;	
}


}

Student(String name,int e1,int e2,int e3) throws Exception{

this.name=name;
if(validMarks(e1)&&validMarks(e2)&&validMarks(e3)){
	exam1=e1;
	exam2=e2;
	exam3=e3;	
}

else{
	System.out.println("error:not in a range");
	throw new Exception("NOT SUITABLE");
}
	
}
 Student(){}

String getName(){
		return name;
	}
int getExam1(){
		return exam1;
	}
int getExam2(){
		return exam2;
	}
int getExam3(){
		return exam3;
	}
	
	public double calculateAverage(){
		double avg=(exam1+exam2+exam3)/3.0;
		return avg;
		
		
	}
	
	
	public static void main(String[] args){
		try{
		Student s1=new Student("Atheeka",75,100,90);
	    System.out.println("Student Name is: "+s1.getName()+"  exam score  is " +s1.getExam1());
			    System.out.println("Student Name is: "+s1.getName()+"  exam score  is " +s1.getExam2());
	    System.out.println("Student Name is: "+s1.getName()+"  exam score  is " +s1.getExam3());

		}
		catch(Exception e){
		System.out.println("error "+e.getMessage())	;
		}
	}
}		
	
