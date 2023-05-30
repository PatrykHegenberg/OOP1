public class Fach {
    // Attribute
    private String name;
    private Student[] studenten = new Student[50];


    // Konstruktoren
    Fach(String n){
        setName(n);
    }

    // Getter und Setter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Methoden
    public void addStudent(Student s){
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
