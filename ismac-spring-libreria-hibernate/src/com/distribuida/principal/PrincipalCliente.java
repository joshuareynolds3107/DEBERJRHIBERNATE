package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
			
		Cliente cliente2 = new Cliente(0,"1783254673","Jefferson","Guitierritos","Quito","0972615423", "jguitierritos@gmail.com");
		clienteDAO.add(cliente2);
//		Cliente cliente3 = new Cliente(39,"1783254888","Pamela","Guitierritos","Quito","0972612323", "pguitierritos@gmail.com");
//		clienteDAO.up(cliente3);
		
//		clienteDAO.del(39);
		
		List<Cliente> clientes = clienteDAO.findAll();
		
		Cliente cliente = clienteDAO.findOne(1);
		
		
		for (Cliente item : clientes) {
			System.out.println(item.toString());
		}
		
//		System.out.println(cliente.toString());
		
		context.close();
				
		
	}

}
