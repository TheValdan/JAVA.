package lab2;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher.Builder().setName("Khrystyna").setSurname("Dmytrenko").setAge(28).setExperience(5).setLanguages("Spanish").build();
        SerializeTXT serializeTxt = new SerializeTXT();
        SerializeJSON serializeJson = new SerializeJSON();
        SerializeXML serializeXml = new SerializeXML();
        File fTxt = new File("teacher.txt");
        File fJson = new File("teacher.json");
        File fXml = new File("teacher.xml");
        try {
            serializeTxt.serialize(t1, fTxt);
            serializeJson.serialize(t1, fJson);
            serializeXml.serialize(t1, fXml);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

        Teacher teacherTxt = new Teacher();
        Teacher teacherJson = new Teacher();
        Teacher teacherXml = new Teacher();

        try {
            teacherTxt = serializeTxt.deserialize(fTxt);
            teacherJson = serializeJson.deserialize(fJson);
            teacherXml = serializeXml.deserialize(fXml);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

        System.out.println(teacherTxt);
        System.out.println(teacherJson);
        System.out.println(teacherXml);
    }
}
