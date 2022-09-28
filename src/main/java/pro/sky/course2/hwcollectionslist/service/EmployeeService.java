package pro.sky.course2.hwcollectionslist.service;

import pro.sky.course2.hwcollectionslist.employeemodel.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add (String firstName, String lastName);
    Employee remove (String firstName, String lastName);
    Employee find (String firstName, String lastName);

    Collection<Employee> findAll();
}
