package com.rest.ver1;


//@XmlRootElement(name="emp")
//5���� �̸��� xml���� ���� �ֻ��� �±� �̸��� ���� ���� ����.

//@XmlAccessorType(XmlAccessType.NONE)
//NONE : @XmlAttribute, @XmlElement�� �Ӽ��� �߰�����
public class Employee {
	//@XmlAttribute//�±� �Ӽ�
	String name;
	//@XmlElement//�ڽ� �±�
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
