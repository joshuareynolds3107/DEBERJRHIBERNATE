package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;


public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
			
		Categoria categoria2 = new Categoria(0,"Novela","Drama");
		categoriaDAO.add(categoria2);
//		Categoria categoriae3 = new Categoria(39,"Novela","Drama");
//		categoriaDAO.up(categoria3);
		
//		categoriaDAO.del(39);
		
		List<Categoria> categorias = categoriaDAO.findAll();
		
		Categoria categoria = categoriaDAO.findOne(1);
		
		
		for (Categoria item : categorias) {
			System.out.println(item.toString());
		}
		
//		System.out.println(categoria.toString());
		
		context.close();
				
			
	}

}
