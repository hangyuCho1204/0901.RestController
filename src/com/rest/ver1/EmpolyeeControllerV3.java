package com.rest.ver1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//@Controller+@ResponseBody
@RequestMapping("employees")
public class EmpolyeeControllerV3 {
	@RequestMapping(value="/ver3/{name}.j", method=RequestMethod.GET, produces="application/json; charset=utf-8")
	public Employee getEmployeeInJSON(@PathVariable String name){//8�� �� {name}���� 9���� name���� �޾Ƽ� 11�� �ٿ� setName���� ����.
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail("employee@naver.com");
		employee.setUrl("rest/employees/ver1/lim.j");
		return employee;
	}
}
