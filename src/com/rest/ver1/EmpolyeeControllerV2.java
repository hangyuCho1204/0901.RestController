package com.rest.ver1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//@Controller+@ResponseBody
@RequestMapping("employees")
public class EmpolyeeControllerV2 {
	@RequestMapping(value="/ver2/{name}.x", method=RequestMethod.GET, produces="application/xml; charset=utf-8")
	//@ResponseBody//�� �������� Ÿ�� �ʰ�, ���� ���� �������� �������� ��
	public EmployeeList getEmployeeInXML(@PathVariable String name){//8�� �� {name}���� 9���� name���� �޾Ƽ� 11�� �ٿ� setName���� ����.
		EmployeeList lists = new EmployeeList();
		
		List<Employee> list = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail("�̸���");
		
		list.add(employee);
		list.add(employee);
		lists.setEmployee(list);
		return lists;
	}
}