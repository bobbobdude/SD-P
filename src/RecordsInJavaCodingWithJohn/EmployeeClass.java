package RecordsInJavaCodingWithJohn;

import java.util.Objects;

public class EmployeeClass {

    /*
    Before records existed this is how
    the class would have worked
    Go to EmployeeRecord class for less boilerplate
    And more optimisation
    */
    public EmployeeClass(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }
    private final String name;
    private final int employeeNumber;

    public String getName() {
        return name;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString(){
        return "EmployeeClass(name = " + this.getName() + ", employeeNumber = " + this.getEmployeeNumber();
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, employeeNumber);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        EmployeeClass employee = (EmployeeClass) o;
        return Objects.equals(employeeNumber, employee.employeeNumber)
                && Objects.equals(name, employee.name);
    }

}
