package domain;

public class Employee {
    private String name;
    private String phone;
    private String address;
    private String email;
    private String employeeId;
    private String birthdate;
    private String gender;
    private String workingHours;
    private String role;
    private Manager manager; // Manager referansı

    public Employee(String name, String phone, String address, String email, String employeeId, String birthdate,
                    String gender, String workingHours, String role) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.employeeId = employeeId;
        this.birthdate = birthdate;
        this.gender = gender;
        this.workingHours = workingHours;
        this.role = role;
    }

    public boolean isManager() {
        return getRole().equals("Manager"); // Assuming "Manager" indicates a manager role
    }

    // Getter ve Setter metodları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void updateEmployee(String name, String phone, String address, String email, String birthdate, String gender, String workingHours, String role, Manager manager) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.birthdate = birthdate;
        this.gender = gender;
        this.workingHours = workingHours;
        this.role = role;
        this.manager = manager;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender='" + gender + '\'' +
                ", workingHours='" + workingHours + '\'' +
                ", role='" + role + '\'' +
                ", manager='" + (manager != null ? manager.getName() : "None") + '\'' +
                '}';
    }
}
