package domain;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> employees;

    public Manager(String name, String phone, String address, String email, String employeeId, String birthdate,
            String gender, String workingHours, String role) {
        super(name, phone, address, email, employeeId, birthdate, gender, workingHours, role);
        
        employees = new ArrayList<Employee>();
    }

    public List<Employee> getEmployeeList() {
        return employees;
    }

    // Method to add a new employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to update an existing employee
    public void updateEmployee(Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee currentEmployee = employees.get(i);
            if (currentEmployee.getEmployeeId().equals(updatedEmployee.getEmployeeId())) {
                updatedEmployee.setManager(this); // Make sure the updated employee has the correct manager
                employees.set(i, updatedEmployee);
                break;
            }
        }
    }

    // Method to delete an employee
    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

}