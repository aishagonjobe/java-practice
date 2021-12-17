package Teacher;

public class TeacherMain extends Teacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.teach();
        teacher.markTests();
        teacher.discipline();
        teacher.createReports();
    }
}
