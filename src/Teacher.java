import java.util.Arrays;

abstract public class Teacher extends Human implements Learnable {
    protected String[] subjectsTaught;

    public Teacher(String name, int age, String address, String[] subjectsTaught) {
        super(name, age, address);
        this.subjectsTaught = subjectsTaught;
    }

    public Teacher() {
        super();
        subjectsTaught = new String[] {"no subjects teach"};
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", subjectsTaught=" + Arrays.toString(subjectsTaught) +
                '}';
    }

    @Override
    public void teach() {
        System.out.println("I teach " + Arrays.toString(subjectsTaught) + "\n");
    }
}
