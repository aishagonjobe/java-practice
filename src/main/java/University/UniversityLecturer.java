package University;

//in the lecturer class
//you will have one method which calls the
// super staff method and overrides the
// super method by printing out what a lecturer does specifically
public class UniversityLecturer extends University {
    public void staff() {
        super.university();
        super.staff();
        System.out.println("The lecturer at the University.University teaches the students.");
    }
}
