import java.util.Arrays;

public class UniversityTeacher extends Teacher{
    private String universityName;

    public UniversityTeacher(String name, int age, String address, String[] subjectsTaught, String universityName) {
        super(name, age, address, subjectsTaught);
        this.universityName = universityName;
    }

    public UniversityTeacher() {
        super();
        this.universityName = "no university name";
    }

    @Override
    public String toString() {
        return "UniversityTeacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", subjectsTaught=" + Arrays.toString(subjectsTaught) +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
