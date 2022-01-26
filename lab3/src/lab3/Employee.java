package lab3;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    protected String Name;
    protected String Surname;
    protected int age;

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee t) {
        if (Surname.compareTo(t.Surname) == 0) {
            return Name.compareTo(t.Name);
        }
        return Surname.compareTo(t.Surname);
    }

    public static class Builder {
        private Employee employee;

        public Builder() {
            employee = new Employee();
        }

        public Builder setName(String name) {
            employee.Name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            employee.Surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            employee.age = age;
            return this;
        }

        public Employee build() {
            return employee;
        }
    }

    @Override
    public String toString() {
        return "Employee: Name = " + Name + "; Surname = " + Surname + "; Age = " + age + ";";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Employee a = (Employee) obj;
        return Name.equals(a.Name) && Surname.equals(a.Surname) && age == a.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Surname, age);
    }
}
