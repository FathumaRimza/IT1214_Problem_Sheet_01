 class Student {
    private int studentId;
    private String name;
    private int daysAttended;

   
    public Student(int studentId, String name, int daysAttended) {
        this.studentId = studentId;
        this.name = name;
        this.daysAttended = daysAttended;
    }

    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }
	 @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Days Attended: " + daysAttended;
    }

   
    
}
 class Classroom {
    private Student[] students = new Student[10];
    private int studentCount = 0;

    
    public void add(Student student) {
        if (studentCount < 10) {
            students[studentCount++] = student;
        } else {
            System.out.println("Cannot add student: classroom is full.");
        }
    }

    
    public void update (int studentId, int newDaysAttended) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                students[i].setDaysAttended(newDaysAttended);
                System.out.println("Updated attendance for student ID " + studentId);
                return;
            }
        }
        System.out.println("Student ID " + studentId + " is not found.");
    }

    
    public void display() {
        System.out.println("Student List:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }
}
 class Main {
    public static void main(String[] args) {
        
        Classroom classroom = new Classroom();
        classroom.add (new Student(101, "Alice Smith", 12));
        classroom.add  (new Student(102, "Bob Jones", 15));
        classroom.add (new Student(103, "Carol Lee", 10));

       
        classroom.update(102, 16); 
        classroom.update(104, 14); 

       
        classroom.display();
    }
}




