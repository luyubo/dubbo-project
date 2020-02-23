/**  
* @Title: ConsumerStart.java  
* @Package com.luyubo  
* @Description: TODO(用一句话描述该文件做什么)  
* @author luyubo
* @date 2020年2月23日  
* @version V1.0  
*/  
package com.luyubo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luyubo.pojo.Student;
import com.luyubo.service.StudentService;

/**  
* @ClassName: ConsumerStart  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author luyubo 
* @date 2020年2月23日    
*/
public class ConsumerStart {
	private static ClassPathXmlApplicationContext context;
	public static void main(String[] args) {
		 context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		
		StudentService studentService = context.getBean(StudentService.class);
		Student student = studentService.getById(20);
		System.out.println(" student is "+student);
		
		Student addAge = studentService.addAge(student, 3);
		System.out.println("加岁数以后的数据"+addAge);
	
	}
}
