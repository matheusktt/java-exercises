package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String path = "/home/matheus/Documentos/StreamEmployee.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> employeeList = new ArrayList<>();
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                line = br.readLine();
                employeeList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
            }

            System.out.print("Enter salary: $ ");
            double salary = sc.nextDouble();

            List<String> emails = employeeList.stream()
                    .filter(employeeSalary -> employeeSalary.getSalary() > salary)
                    .map(employeeEmail -> employeeEmail.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than $" + salary + ": ");
            emails.forEach(System.out::println);

            double sum = employeeList.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(employee -> employee.getSalary())
                    .reduce(0.0, (value1, value2) -> value1 + value2);

            System.out.println("Sum of salary of people whose name starts with 'M': $" + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}