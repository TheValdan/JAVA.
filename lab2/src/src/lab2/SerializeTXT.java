package lab2;

import java.io.*;

public class SerializeTXT {
    public void serialize(Teacher obj, File file) throws IOException {
        try(FileWriter fw = new FileWriter(file)){
            String str = "Name = " + obj.getName() + ", Surname = " + obj.getSurname() + ", Age = " + obj.getAge() + ", Languages = " + obj.getLanguages() + ", Experience = " + obj.getExperience();
            fw.write(str);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Teacher deserialize(File file) throws IOException {
        try (BufferedReader fr = new BufferedReader(new FileReader(file))) {
            String[] fields = fr.readLine().split(", ");
            Teacher.Builder a = new Teacher.Builder();
            a.setName(fields[0].split(" ")[2]);
            a.setSurname(fields[1].split(" ")[2]);
            a.setAge(Integer.parseInt(fields[2].split(" ")[2]));
            a.setLanguages(fields[3].split(" ")[2]);
            a.setExperience(Integer.parseInt(fields[4].split(" ")[2]));
            return a.build();
        }
        catch (IOException e) {
            throw new RuntimeException("File is empty");
        }
    }
}
