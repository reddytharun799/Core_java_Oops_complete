package streamsinjava;

public class Student {
    private String subjects;
    private String marks;

    public Student( String subjects,String marks){
        this.subjects=subjects;
        this.marks=marks;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getMarks() {
        return marks;
    }
}
