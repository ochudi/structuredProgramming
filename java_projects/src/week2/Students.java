public class Students implements Person {
    public static void main(String[] args) {
        Students firstStudent = new Students();
        firstStudent.name();
        firstStudent.age();
    }

    @Override
    public void name() {
        System.out.println("My name is Chudi.");
    }

    @Override
    public void age() {
        System.out.println("My age is 21.");
    }
}
