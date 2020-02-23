/**  
* @Title: StudentServiceImpl.java  
* @Package com.luyubo.service.impl  
* @Description: TODO(用一句话描述该文件做什么)  
* @author luyubo
* @date 2020年2月23日  
* @version V1.0  
*/  
package com.luyubo.service.impl;

import com.luyubo.pojo.Student;
import com.luyubo.service.StudentService;

/**  
* @ClassName: StudentServiceImpl  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author luyubo 
* @date 2020年2月23日    
*/
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(20);
		student.setId(1);
		student.setName("张三"+id);
		return student;
	}

	@Override
	public Student addAge(Student stu,int age) {
//		 TODO Auto-generated method stub
		stu.setAge(stu.getAge()+age);
		return stu;
	}

}
