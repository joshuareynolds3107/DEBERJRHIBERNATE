package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
			
		Autor autor2 = new Autor(0,"Alan","Brito","Ecuador","Nose alado de nose quien","0935627152","abrito@gmail.com");
		autorDAO.add(autor2);
//		Autor autor3 = new Autor(51,"1783254888","Pamela","Guitierritos","Quito","0972612323", "pguitierritos@gmail.com");
//		autorDAO.up(autor3);
		
//		autorDAO.del(51);
		
		List<Autor> autores = autorDAO.findAll();
		
		Autor autor = autorDAO.findOne(1);
		
		
		for (Autor item : autores) {
			System.out.println(item.toString());
		}
		
//		System.out.println(autor.toString());
		
		context.close();
						
	}

}
