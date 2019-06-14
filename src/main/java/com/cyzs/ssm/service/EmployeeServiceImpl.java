package com.cyzs.ssm.service;

import com.cyzs.ssm.beans.Employee;
import com.cyzs.ssm.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaoH
 * @create 2019-06-13-2:21
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    
    @Override
    public List<Employee> getEmps() {
        return employeeMapper.getEmps();
    }
}
