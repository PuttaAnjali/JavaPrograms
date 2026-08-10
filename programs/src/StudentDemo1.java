class Student{
	int rollNum, mark1, mark2, mark3, totalMarks;
	String studName;
    Student(int rollNum, String studName, int mark1, int mark2, int mark3) {
	        this.rollNum = rollNum;
	        this.studName = studName;
	        this.mark1 = mark1;
	        this.mark2 = mark2;
	        this.mark3 = mark3;
	        totalMarks = mark1 + mark2 + mark3;
    }
	void calculteTotal() {
		totalMarks = mark1+mark2+mark3;
	}
	void displayStudDetails() {
		System.out.println("Roll NO: "+rollNum+" Name: "+studName+" Total Marks: "+totalMarks);
	}
}
public class StudentDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(123, "Alice", 99, 87, 78);
        s1.displayStudDetails();
	}
}