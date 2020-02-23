/**  
* @Title: StudentService.java  
* @Package com.luyubo.service  
* @Description: TODO(用一句话描述该文件做什么)  
* @author luyubo
* @date 2020年2月23日  
* @version V1.0  
*/  
package com.luyubo.service;

import com.luyubo.pojo.Student;

/**  
* @ClassName: StudentService  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author luyubo
* @date 2020年2月23日    
*/
public interface StudentService {
	/**
	 * 
	* @Title: getById  
	* @Description: TODO(根据id获取一个学生)  
	* @param @param id
	* @param @return    参数  
	* @return Student    返回类型  
	* @throws
	 */
	Student getById(int id);
	
	/**
	 * 
	* @Title: addAge  
	* @Description: TODO(增加年龄)  
	* @param @param id
	* @param @return    参数  
	* @return Student    返回类型  
	* @throws
	 */
	Student addAge(Student stu,int age);
}
