package lab5;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[]{
                new Teacher.Builder().setName("Khrystyna").setSurname("Dmytrenko").setAge(28).setExperience(10).setLanguages("Spanish").build(),
                new Teacher.Builder().setName("Hruhorij").setSurname("Vojtenko").setAge(42).setExperience(15).setLanguages("English").build(),
                new Teacher.Builder().setName("Anzhela").setSurname("Karpenko").setAge(32).setExperience(6).setLanguages("Italian").build(),
                new Teacher.Builder().setName("Oleksij").setSurname("Volkov").setAge(28).setExperience(1).setLanguages("Romanian").build(),
                new Teacher.Builder().setName("Alla").setSurname("Shevchenko").setAge(32).setExperience(8).setLanguages("Polish").build()};

        DataBaseConnector connector = new DataBaseConnector();

        connector.executeSQL("CREATE TABLE Teachers (Id INT PRIMARY KEY, Name NVARCHAR(20), Surname NVARCHAR(20), Age INT, Languages NVARCHAR(60), Experience INT);");
        int i = 1;
        for (var teacher : teachers) {
            connector.executeSQL("INSERT INTO Teachers (Id, Name, Surname, Age, Languages, Experience) VALUES "
                    + String.format("(%d, '%s', '%s', %d, '%s', %d);", i, teacher.getName(), teacher.getSurname(), teacher.getAge(), teacher.getLanguages(), teacher.getExperience()));
            ++i;
        }

        try {
            ResultSet res = connector.executeSQLWithResult("SELECT * FROM Teachers");
            System.out.println("Teachers : ");
            while (res.next()) {
                System.out.println("Name: " + res.getString("Name") + " "
                        + res.getString("Surname") + ", "
                        + "Age: " + res.getString("Age") + ", "
                        + "Languages: " + res.getString("Languages") + ", "
                        + "Experience: " + res.getString("Experience") + ";");
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }


}
