package com.atguigu.service;

import com.atguigu.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author zhangchengwei
 * @create 2022-08-28 22:55
 */
public interface EmployeeService {

    /**
     * 获取所有的员工
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
