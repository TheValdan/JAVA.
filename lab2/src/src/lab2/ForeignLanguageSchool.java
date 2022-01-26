package lab2;

import java.util.List;
import java.util.Objects;

public class ForeignLanguageSchool {
    private String Address;
    private int capacity;
    private List<Teacher> teachers;

    public String getAddress() {
        return Address;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public static class Builder {
        private ForeignLanguageSchool school;

        public Builder() {
            school = new ForeignLanguageSchool();
        }

        public Builder setAddress(String address) {
            school.Address = address;
            return this;
        }

        public Builder setCapacity(int cp) {
            school.capacity = cp;
            return this;
        }

        public Builder setTeacherList(List<Teacher> teachers) {
            school.teachers = teachers;
            return this;
        }

        public ForeignLanguageSchool build() {
            return school;
        }
    }

    @Override
    public String toString() {
        return "Foreign language school: Address = " + Address + "; Capacity = " + capacity + "; Teachers = " + teachers + ";";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        ForeignLanguageSchool a = (ForeignLanguageSchool) obj;
        return Objects.equals(Address, a.Address) && capacity == a.capacity && teachers.equals(a.teachers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Address, capacity, teachers);
    }
}
