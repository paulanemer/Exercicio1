package br.gov.sp.fatec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		Tela obj = (Tela) context.getBean("tela");
		System.out.println("Informacoes de Cadastro: \n");
		System.out.println(obj.concatenar());
		
	}
}
