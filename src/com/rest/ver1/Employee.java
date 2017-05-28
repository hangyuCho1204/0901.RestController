package com.rest.ver1;


//@XmlRootElement(name="emp")
//5번에 이름은 xml에서 보일 최상위 태그 이름을 설정 해준 것임.

//@XmlAccessorType(XmlAccessType.NONE)
//NONE : @XmlAttribute, @XmlElement의 속성만 추가가능
public class Employee {
	//@XmlAttribute//태그 속성
	String name;
	//@XmlElement//자식 태그
	String email;
	String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + "]";
	}
}
