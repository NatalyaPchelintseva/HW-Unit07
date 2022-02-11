public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.learn();
        Student s2 = new Student("Ivan", 18, "Kaluga", 1, new String[]{"informatics"});
        System.out.println(s2);
        s2.learn();
        SchoolTeacher stch1 = new SchoolTeacher();
        System.out.println(stch1);
        stch1.teach();
        SchoolTeacher stch2 = new SchoolTeacher("Ivan Ivanovich",
                35, "Kaluga", new String[]{"math", "alg", "geom"}, "liceum 9");
        System.out.println(stch2);
        stch2.teach();
        UniversityTeacher utch1 = new UniversityTeacher();
        System.out.println(utch1);
        utch1.teach();
        UniversityTeacher utch2 = new UniversityTeacher("Petr Petrovich", 40, "Kaluga",
                new String[]{"programming", "data structure"}, "KGU");
        System.out.println(utch2);
        utch2.teach();
    }
}
