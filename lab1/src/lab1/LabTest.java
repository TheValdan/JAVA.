package lab1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.ArrayList;

public class LabTest {

    @Test(dataProvider = "TeacherProvider")
    public void TeacherTest(Employee obj1, Employee obj2) {
        assertEquals(obj1, obj2);
    }

    @DataProvider
    public Object[][] TeacherProvider() {
        Teacher t1 = new Teacher.Builder().setName("Khrystyna").setSurname("Dmytrenko").setAge(28).setExperience(5).setLanguages("Spanish").build();
        Teacher t2 = new Teacher.Builder().setName("Hruhorij").setSurname("Vojtenko").setAge(42).setExperience(15).setLanguages("English").build();
        Teacher t3 = new Teacher.Builder().setName("Hruhorij").setSurname("Vojtenko").setAge(42).setExperience(15).setLanguages("English").build();
        Teacher t4 = new Teacher.Builder().setName("Khrystyna").setSurname("Dmytrenko").setAge(28).setExperience(5).setLanguages("Spanish").build();
        Teacher t5 = new Teacher.Builder().setName("Alla").setSurname("Shevchenko").setAge(34).setExperience(8).setLanguages("Polish").build();
        return new Object[][]{{t1, t4}, {t5, t5}, {t3, t3}, {t2, t3}};
    }

    @Test(dataProvider = "TeacherProviderNotEquals")
    public void TeacherTestNotEq(Employee obj1, Employee obj2) {
        assertNotEquals(obj1, obj2);
    }

    @DataProvider
    public Object[][] TeacherProviderNotEquals() {
        Teacher t1 = new Teacher.Builder().setName("Khrystyna").setSurname("Dmytrenko").setAge(28).setExperience(5).setLanguages("Spanish").build();
        Teacher t2 = new Teacher.Builder().setName("Hruhorij").setSurname("Vojtenko").setAge(42).setExperience(15).setLanguages("English").build();
        Teacher t3 = new Teacher.Builder().setName("Anzhela").setSurname("Karpenko").setAge(31).setExperience(6).setLanguages("Italian").build();
        Teacher t4 = new Teacher.Builder().setName("Oleksij").setSurname("Volkov").setAge(25).setExperience(1).setLanguages("Romanian").build();
        Teacher t5 = new Teacher.Builder().setName("Alla").setSurname("Shevchenko").setAge(34).setExperience(8).setLanguages("Polish").build();
        return new Object[][]{{t1, t3}, {t2, t4}, {t2, t5}, {t1, t5}};
    }

    @Test(dataProvider = "FLSchoolProvider")
    public void FLSchoolTest(ForeignLanguageSchool obj1, ForeignLanguageSchool obj2) {
        assertEquals(obj1, obj2);
    }

    @DataProvider
    public Object[][] FLSchoolProvider() {
        Teacher t1 = new Teacher.Builder().setName("Khrystyna").setSurname("Dmytrenko").setAge(28).setExperience(5).setLanguages("Spanish").build();
        Teacher t2 = new Teacher.Builder().setName("Hruhorij").setSurname("Vojtenko").setAge(42).setExperience(15).setLanguages("English").build();
        Teacher t3 = new Teacher.Builder().setName("Anzhela").setSurname("Karpenko").setAge(31).setExperience(6).setLanguages("Italian").build();
        Teacher t4 = new Teacher.Builder().setName("Oleksij").setSurname("Volkov").setAge(25).setExperience(1).setLanguages("Romanian").build();
        Teacher t5 = new Teacher.Builder().setName("Alla").setSurname("Shevchenko").setAge(34).setExperience(8).setLanguages("Polish").build();
        List<Teacher> TList1 = new ArrayList<Teacher>();
        List<Teacher> TList2 = new ArrayList<Teacher>();
        TList1.add(t1);
        TList1.add(t2);
        TList1.add(t3);
        TList1.add(t4);
        TList1.add(t5);
        TList2.add(t3);
        TList2.add(t2);
        TList2.add(t1);
        TList2.add(t5);
        TList2.add(t4);

        ForeignLanguageSchool s1 = new ForeignLanguageSchool.Builder().setTeacherList(TList1).setCapacity(50).setAddress("Melnikova Ul., bld. 47").build();
        ForeignLanguageSchool s2 = new ForeignLanguageSchool.Builder().setTeacherList(TList2).setCapacity(70).setAddress("Goduvantseva Ul., bld. 1/А, appt. 32").build();

        return new Object[][] {{s1, s1}, {s2, s2}, {s2, new ForeignLanguageSchool.Builder().setTeacherList(TList2).setCapacity(70).setAddress("Goduvantseva Ul., bld. 1/А, appt. 32").build()}};
    }

    @Test(dataProvider = "FLSchoolProviderNotEquals")
    public void FLSchoolTestNotEq(ForeignLanguageSchool obj1, ForeignLanguageSchool obj2) {
        assertNotEquals(obj1, obj2);
    }

    @DataProvider
    public Object[][] FLSchoolProviderNotEquals() {
        Teacher t1 = new Teacher.Builder().setName("Khrystyna").setSurname("Dmytrenko").setAge(28).setExperience(5).setLanguages("Spanish").build();
        Teacher t2 = new Teacher.Builder().setName("Hruhorij").setSurname("Vojtenko").setAge(42).setExperience(15).setLanguages("English").build();
        Teacher t3 = new Teacher.Builder().setName("Anzhela").setSurname("Karpenko").setAge(31).setExperience(6).setLanguages("Italian").build();
        Teacher t4 = new Teacher.Builder().setName("Oleksij").setSurname("Volkov").setAge(25).setExperience(1).setLanguages("Romanian").build();
        Teacher t5 = new Teacher.Builder().setName("Alla").setSurname("Shevchenko").setAge(34).setExperience(8).setLanguages("Polish").build();
        List<Teacher> alst1 = new ArrayList<Teacher>();
        List<Teacher> alst2 = new ArrayList<Teacher>();
        alst1.add(t1);
        alst1.add(t2);
        alst1.add(t3);
        alst1.add(t4);
        alst1.add(t5);
        alst2.add(t3);
        alst2.add(t2);
        alst2.add(t1);
        alst2.add(t5);
        alst2.add(t4);

        ForeignLanguageSchool s1 = new ForeignLanguageSchool.Builder().setTeacherList(alst1).setCapacity(50).setAddress("Melnikova Ul., bld. 47").build();
        ForeignLanguageSchool s2 = new ForeignLanguageSchool.Builder().setTeacherList(alst2).setCapacity(70).setAddress("Goduvantseva Ul., bld. 1/А, appt. 32").build();

        return new Object[][] {
                {s1, s2},
                {s2, new ForeignLanguageSchool.Builder().setTeacherList(alst1).setCapacity(60).setAddress("Goduvantseva Ul., bld. 1/А, appt. 32").build()}
        };
    }

}
