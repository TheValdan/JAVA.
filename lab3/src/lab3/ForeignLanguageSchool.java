package lab3;

import java.util.ArrayList;
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

    public List<Teacher> sortByNameSurname() {
        teachers.sort(new TeacherComparator());
        return teachers;
    }

    public List<Teacher> sortByNameSurnameStream() {
        return teachers.stream().sorted(new TeacherComparator()).toList();
    }

    public List<Teacher> filterExperienceMoreThan(double min_exp) {
        List<Teacher> res = new ArrayList<Teacher>();
        for (var anm : teachers) {
            if (anm.getExperience() >= min_exp) {
                res.add(anm);
            }
        }
        return res;
    }

    public List<Teacher> filterExperienceMoreThanStream(double min_exp) {
        return teachers.stream().filter(a -> a.getExperience() >= min_exp).toList();
    }

    public List<Teacher> getTeachersOfAge(int age) {
        List<Teacher> res = new ArrayList<Teacher>();
        for (var anm : teachers) {
            if (anm.getAge() == age) {
                res.add(anm);
            }
        }
        return res;
    }

    public List<Teacher> getTeachersOfAgeStream(int age) {
        return teachers.stream().filter(a->a.age == age).toList();
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
