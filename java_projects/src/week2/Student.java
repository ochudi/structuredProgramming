
/**
 * Constructors
 */
public class Student {
    String name, matNo;

    public Student(String studentName, String studentMatNo) {
        this.name = studentName;
        this.matNo = studentMatNo;
    }

    void print() {
        System.out.println("Name: " + this.name + " MatNo: " + this.matNo);
    }

    public static void main(String[] args) {
        Student firstStudent = new Student("Chudi", "20120612023");
        firstStudent.print();
    }
}