package com.example.demo.service;
import java.util.List;
import java.util.Map;

import com.example.demo.model.CustomEmployee;
import com.example.demo.model.Employee;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public List<Employee> getItEmployees();
    public List<Employee> getSalesEmployees();
    public List<Employee> getAdminEmployees();
    public List<Employee> getMarketingEmployees();
    public List<Employee> getHREmployees();
    public List<Employee> getShippingEmployees();
    public List<Employee> getFinanceEmployees();
    public List <CustomEmployee>  gettest();
}
