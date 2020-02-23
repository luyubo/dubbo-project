/**  
* @Title: BootStart.java  
* @Package com.luyubo  
* @Description: TODO(用一句话描述该文件做什么)  
* @author luyubo
* @date 2020年2月23日  
* @version V1.0  
*/  
package com.luyubo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**  
* @ClassName: BootStart  
* @Description: TODO(启动服务提供者)  
* @author luyubo 
* @date 2020年2月23日    
*/
public class BootStart {
	public static void main(String[] args) {
		//加载配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//加载服务到容器
		context.start();
		try {
			//加一个阻塞
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
