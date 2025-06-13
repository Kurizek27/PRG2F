package Ukol2;

public class Teacher extends Person {
    String classroom;
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Teaches classroom: " + classroom);
    }
}
