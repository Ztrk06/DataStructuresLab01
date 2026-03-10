package Q3;

public abstract class Course {
    public String code;

    public Course(String courseCode) {
        code = courseCode;
        System.out.println("Opening the course " + courseCode);
    }

    public abstract void Syllabus();

    public void Learn(){
        System.out.println("Preparing the content of " + this.code);
    }

}
