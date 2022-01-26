package lab2;

import java.util.Objects;

public class Teacher extends Employee {
    private String Languages;
    private int experience;

    public int getExperience() {
        return experience;
    }

    public String getLanguages() {
        return Languages;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLanguages(String languages) {
        Languages = languages;
    }

    public static class Builder {
        private Teacher teacher;

        public Builder() {
            teacher = new Teacher();
        }

        public Builder setName(String name) {
            teacher.Name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            teacher.Surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            teacher.age = age;
            return this;
        }

        public Builder setLanguages(String lang) {
            teacher.Languages = lang;
            return this;
        }

        public Builder setExperience(int exp) {
            teacher.experience = exp;
            return this;
        }

        public Teacher build() {
            return teacher;
        }
    }

    @Override
    public String toString() {
        return "Teacher: Name = " + Name + "; Surname = " + Surname + "; Age = " + age + "; Languages = " + Languages + "; Experience = " + experience + ";";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Teacher a = (Teacher) obj;
        return Name.equals(a.Name) && Surname.equals(a.Surname) && age == a.age && Languages.equals(a.Languages) && experience == a.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Surname, age, Languages, experience);
    }
}
