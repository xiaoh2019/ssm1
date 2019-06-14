package com.cyzs.ssm.dao;

import com.cyzs.ssm.beans.Employee;

import java.util.List;

/**
 * @author xiaoH
 * @create 2019-06-13-2:22
 */
public interface EmployeeMapper {
    List<Employee> getEmps();
}
