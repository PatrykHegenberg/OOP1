public class Vorlesung{
    // Attribute
    private String name;
    private Student[] studenten = new Student[25];

    // Konstruktoren
    Vorlesung(String s) {
        setName(s);
    }
    
    // Getter und Setter
    public String getName(){
        return this.name;
    }

    public Student[] getStudenten() {
        return this.studenten;
    }

    private void setName(String s) {
        this.name = s;
    }

    // Methoden
    public void addStudent(Student s) {
        for (int i= 0; i < studenten.length; i++){
            if (studenten[i] == null){
                studenten[i] = s;
                return;
            }
        }
    }    

    public void printStudents(){
        for(int i=0; i<studenten.length; i++){
            if(studenten[i] != null){
                System.out.println(studenten[i].getName());
            }
        }
    }
}