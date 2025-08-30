public class Main {
    public static void main(String[] args) {
        CourseSec course_sec = new CourseSec("DIT", "Year 2");
        Contact contact = new Contact(123456789, "parent@gmail.com");

        BasicStudentInfo student = new BasicStudentInfo("Lucmayan, Joshan", "2024-123", course_sec, contact);

        student.displayInfo();

    }
}