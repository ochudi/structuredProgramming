public class Student1 {
    String name, matNo, gender;

    public Student1(String studentName, String studentMatNo) {
        this.name = studentName;
        this.matNo = studentMatNo;
        System.out.println("Name: " + this.name + " MatNo: " + this.matNo);
    }

    public Student1(String studentName, String studentMatNo, String studentGender) {
        this.name = studentName;
        this.matNo = studentMatNo;
        this.gender = studentGender;
        System.out.println("Name: " + this.name + " MatNo: " + this.matNo+ " Gender: " + this.gender);
    }

    public static void main(String[] args) {
        Student1 firstStudent = new Student1("Chudi", "20120612023");
        Student1 secondStudent = new Student1("Sarah", "20120612023", "Female");
    }
}
