import java.util.Arrays;

public class SchoolTeacher extends Teacher {
    private String schoolName;

    public SchoolTeacher(String name, int age, String address, String[] subjectsTaught, String schoolName) {
        super(name, age, address, subjectsTaught);
        this.schoolName = schoolName;
    }

    public SchoolTeacher() {
        super();
        this.schoolName = "no school name";
    }

    @Override
    public String toString() {
        return "SchoolTeacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", subjectsTaught=" + Arrays.toString(subjectsTaught) +
                '}';
    }
}
