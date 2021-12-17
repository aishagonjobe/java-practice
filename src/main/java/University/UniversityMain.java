package University;

//Inheritance.Main class
//calls the lecturer class method that was overridden
public class UniversityMain {
    public static void main(String[] args) {
        UniversityLecturer lecturer = new UniversityLecturer();
        lecturer.staff();
    }
}
