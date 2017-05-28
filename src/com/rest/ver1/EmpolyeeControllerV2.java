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
	//@ResponseBody//뷰 리졸버를 타지 않고, 리텅 값이 응답으로 가버리는 것
	public EmployeeList getEmployeeInXML(@PathVariable String name){//8번 줄 {name}값이 9번줄 name으로 받아서 11번 줄에 setName으로 들어간다.
		EmployeeList lists = new EmployeeList();
		
		List<Employee> list = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail("이메일");
		
		list.add(employee);
		list.add(employee);
		lists.setEmployee(list);
		return lists;
	}
}