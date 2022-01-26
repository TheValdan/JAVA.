package lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher.Builder().setName("Khrystyna").setSurname("Dmytrenko").setAge(28).setExperience(10).setLanguages("Spanish").build();
        Teacher t2 = new Teacher.Builder().setName("Hruhorij").setSurname("Vojtenko").setAge(42).setExperience(15).setLanguages("English").build();
        Teacher t3 = new Teacher.Builder().setName("Anzhela").setSurname("Karpenko").setAge(32).setExperience(6).setLanguages("Italian").build();
        Teacher t4 = new Teacher.Builder().setName("Oleksij").setSurname("Volkov").setAge(28).setExperience(1).setLanguages("Romanian").build();
        Teacher t5 = new Teacher.Builder().setName("Alla").setSurname("Shevchenko").setAge(32).setExperience(8).setLanguages("Polish").build();

        List<Teacher> TList1 = new ArrayList<Teacher>();
        TList1.add(t1);
        TList1.add(t2);
        TList1.add(t3);
        TList1.add(t4);
        TList1.add(t5);

        ForeignLanguageSchool s1 = new ForeignLanguageSchool.Builder().setTeacherList(TList1).setCapacity(50).setAddress("Melnikova Ul., bld. 47").build();

        System.out.println("Teachers sorted by surname and name");
        String sorted = new String();
        sorted = "";
        for (var teacher : s1.sortByNameSurname()) {
            sorted += teacher.toString() + "\n";
        }
        System.out.println(sorted + "\n");

        System.out.println("Teachers sorted by surname and name (Stream)");
        String sortedStream = new String();
        sortedStream = "";
        for (var teacher : s1.sortByNameSurnameStream()) {
            sortedStream += teacher.toString() + "\n";
        }
        System.out.println(sortedStream + "\n");

        System.out.println("Teachers that have more than 7 years of experience");
        String filtered = new String();
        filtered = "";
        for (var teacher : s1.filterExperienceMoreThan(7)) {
            filtered += teacher.toString() + "\n";
        }
        System.out.println(filtered + "\n");

        System.out.println("Teachers that have more than 10 years of experience (Stream)");
        String filteredStream = new String();
        filteredStream = "";
        for (var teacher : s1.filterExperienceMoreThanStream(10)) {
            filteredStream += teacher.toString() + "\n";
        }
        System.out.println(filteredStream + "\n");

        System.out.println("Teachers of age 28");
        String find = new String();
        find = "";
        for (var teacher : s1.getTeachersOfAge(28)) {
            find += teacher.toString() + "\n";
        }
        System.out.println(find + "\n");

        System.out.println("Teachers of age 32 (Stream)");
        String findStream = new String();
        findStream = "";
        for (var an : s1.getTeachersOfAgeStream(32)) {
            findStream += an.toString() + "\n";
        }
        System.out.println(findStream + "\n");
    }
}
