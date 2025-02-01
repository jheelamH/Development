package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;

class Employee {
    String name;
    int id;
    int salary;

    public Employee() {
    }
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            String json = "{\"name\":\"John Doe\", \"id\":101, \"salary\":50000}";

            Employee emp1 = objectMapper.readValue(json, Employee.class);

            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}