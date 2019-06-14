package com.cyzs.ssm.controller;

import com.cyzs.ssm.beans.Employee;
import com.cyzs.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoH
 * @create 2019-06-13-2:17
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @RequestMapping("/emps")
    public String getEmps(Map<String,Object> map){
        List<Employee> emps = employeeService.getEmps();
        map.put("emps",emps);
        return "list";
    }

    @ResponseBody
    @RequestMapping("/empAll")
    public List<Employee> getEmps01(Map<String,Object> map){
       return employeeService.getEmps();
    }
}
