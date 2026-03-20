abstract class User {
    abstract void login();
}

interface CourseUploader {
    void uploadCourse(); 
}

class Student extends User {
    @Override
    public void login() {
        System.out.println("Student Can Login");
    }
    // No uploadCourse() here!
}

public class Instructor extends User implements CourseUploader{
    @Override
    public void login() {
        System.out.println("Instructor Can Login");
    }

    @Override
    public void uploadCourse() {
        System.out.println("Instructor Can Upload Course");
    }

    public static void main(String[] args) {
        Student S = new Student();
        Instructor I = new Instructor();
        S.login();
        I.login();
        I.uploadCourse();
    }
}
