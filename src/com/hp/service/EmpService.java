package com.hp.service;

import com.hp.entity.Emp;

import java.util.List;
public interface EmpService {

    public List<Emp> selectEmps()throws Exception;

    public boolean insertEmp(int deptno,Emp emp) throws Exception;

}
