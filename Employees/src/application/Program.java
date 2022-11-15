package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee emp = new Employee();
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i =0; i < n; i++){
            System.out.println("Employee #" + (1+ i) + " data:");
            System.out.print("Outsourced (y/n) ? ");
            char response = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (response == 'y') {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();
                emp = new OutsourcedEmployee(name, hours, valuePerHour, additional);
                list.add(emp);
            } else {
                emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println("PAYMENTS");
        for (Employee employee : list){
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
        sc.close();
    }
}