package com.rest.ver1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//@Controller+@ResponseBody
@RequestMapping("employees")
public class EmpolyeeControllerV1 {
	@RequestMapping(value="/ver1/{name}.j", method=RequestMethod.GET, produces="application/json; charset=utf-8")
	//@ResponseBody//�� �������� Ÿ�� �ʰ�, ���� ���� �������� �������� ��
	public EmployeeList getEmployeeInJSON(@PathVariable String name){//8�� �� {name}���� 9���� name���� �޾Ƽ� 11�� �ٿ� setName���� ����.
	/*	List<Employee> list = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail("employee@naver.com");
		
		list.add(employee);
		list.add(employee);
		list.add(employee);*/
		List<Employee> lists = new ArrayList<Employee>();
		EmployeeList list = new EmployeeList();
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail("employee@naver.com");
		lists.add(employee);
		//list.setDesc("json����");
		//list.setEmp(lists);
		return list;
	}
}
