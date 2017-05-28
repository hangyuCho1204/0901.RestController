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
	//@ResponseBody//뷰 리졸버를 타지 않고, 리텅 값이 응답으로 가버리는 것
	public EmployeeList getEmployeeInJSON(@PathVariable String name){//8번 줄 {name}값이 9번줄 name으로 받아서 11번 줄에 setName으로 들어간다.
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
		//list.setDesc("json좋아");
		//list.setEmp(lists);
		return list;
	}
}
