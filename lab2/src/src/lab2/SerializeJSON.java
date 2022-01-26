package lab2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerializeJSON {
    ObjectMapper mapper;

    public SerializeJSON() {
        mapper = new ObjectMapper();
    }

    public void serialize(Teacher obj, File file) throws IOException {
        try {
            mapper.writeValue(file, obj);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Teacher deserialize(File file) {
        try {
            return mapper.readValue(file, Teacher.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
