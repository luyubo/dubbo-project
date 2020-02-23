/**  
* @Title: Students.java  
* @Package com.luyubo.pojo  
* @Description: TODO(用一句话描述该文件做什么)  
* @author 77028  
* @date 2020年2月23日  
* @version V1.0  
*/  
package com.luyubo.pojo;

import java.io.Serializable;

/**  
* @ClassName: Students  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author luyubo
* @date 2020年2月23日    
*/
public class Student implements Serializable{
	
	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = 1974996327794813771L;
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
