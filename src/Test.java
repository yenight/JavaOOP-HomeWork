import model.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("a", 10, "male", "1000000");
        System.out.println("name: " + student.getName() + "age: " + student.getAge() +"sex: " + student.getSex() +"id: " + student.getNumber());

    }
}
