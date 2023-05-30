public class Main {
    public static void main(String[] args) {
        Fach f1 = new Fach("Informatik");
        Student s1 = new Student(1, "Jan", new Datum(1, 1, 2000));
        Student s2 = new Student(2, "Niklas", new Datum(1, 1, 2000));
        s1.setFach(f1);
        s2.setFach(f1);
        f1.addStudent(s1);
        f1.addStudent(s2);
        f1.printStudents();
    }
}
