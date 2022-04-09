package mapTraining;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Book {
    final Map<Integer, String> employee;

    public static void main(String[] args) {
        final Map<Integer, String> employeeEx = new HashMap<>();
        final Book book = new Book(employeeEx);

        book.add(911111111, "Ivanov");
        book.add(944444444, "Sidorov");
        book.add(922222222, "Ivanov");
        book.add(955555555, "Petrov");
        book.add(977777777, "Ivanov");
        book.add(933333333, "Smirnov");
        book.add(966666666, "Petrov");
        book.add(988888888, "Ivanov");
        book.add(989898989, "Ivanov");

        book.set("Ivanov");
        book.set("Petrov");
        book.set("Smirnov");
    }

    private void add(Integer number, String surname) {
        employee.put(number, surname);
    }

    private void set(String surname) {
        final Map<Integer, String> resultMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> employees : employee.entrySet()) {
            if (employees.getValue().equals(surname)) {
                resultMap.put(employees.getKey(), employees.getValue());
            }
        }
        System.out.println("Result: " + resultMap);
    }

    public Book(Map<Integer, String> employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(employee, book.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee);
    }

    @Override
    public String toString() {
        return "Book{" +
                "employee=" + employee +
                '}';
    }
}
