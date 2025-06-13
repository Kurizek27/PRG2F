package Ukol2;

public class Student extends Person {
    String school;
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("School: " + school);
    }
}
