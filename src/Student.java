import java.util.Arrays;

public class Student extends Human implements Learnable {
    private final int courseNumber;
    private final String[] learningCourses;

    public Student(String name, int age, String address, int courseNumber, String[] learningCourses) {
        super(name, age, address);
        this.courseNumber = courseNumber;
        this.learningCourses = learningCourses;
    }

    public Student() {
        super();
        courseNumber = 0;
        learningCourses = new String[] {"no courses"};
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", courseNumber=" + courseNumber +
                ", learningCourses=" + Arrays.toString(learningCourses) +
                '}';
    }

    @Override
    public void learn() {
        System.out.println("I learn " + Arrays.toString(learningCourses) + "\n");
    }
}
