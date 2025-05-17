package com.example.demo;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    private int salary;
    private String gender;
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Person(String name, Integer age, int salary, String gender, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
    @Override
    public int compareTo(Person other) {
        // First compare by age
        int ageCompare = Integer.compare(this.age, other.age);
        if (ageCompare != 0) return ageCompare;

        // Then compare by name (case-insensitive)
        int nameCompare = this.name.compareToIgnoreCase(other.name);
        if (nameCompare != 0) return nameCompare;

        // Finally compare by ID
        return Integer.compare(this.age, other.age);
    }
}
