package ead.senac.tds.Projeto;

import ead.senac.tds.Projeto.model.Data;
import ead.senac.tds.Projeto.model.Registro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Projeto {

	public static void main(String[] args) {
            
            SpringApplication.run(Projeto.class, args);
            
            System.out.println();
            System.out.println(new Data().DataCompleta());
            
            System.out.println(Registro.Day("Realização:\t[", "] (", ")"));
            
            System.out.print("Link:");
            System.out.print("\t\t(");
            System.out.print(Registro.Host("index"));
            System.out.println(")");
            
            System.out.println();
            System.out.println("Acesso pelo:");
            System.out.println(Registro.host);
                
	}

}