package application;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;
public class Program {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		//solução com expressão lambda 
			 Comparator <Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());	
	
			 for (Product p : list) {
				 System.out.println(p);
		        }
	}
}
		
	  /*classe anonima criei o token
			Comparator <Product> comp = new Comparator <Product>() {

			 * 	@Override
				public int compare(Product p1, Product p2) {
					return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
				}
			  };
			  usando expressôes lambdas
			  classe anonima
					Comparator <Product> comp = (p1, p2) ->{
					return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());	
		     		};
		    /*limpando a implentação
		     * 
		     */
		/*
		 *limpando mais a implementação
			*list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
			*}
			*1 forma de implementar uma comparação classe separada
		     
		     *list.sort(new Mycomparator());
			
				*for (Product p : list) {
					System.out.println(p);
				}
		} 	
		 */
		
		/*
		Resumo da aula
			• Comparator objeto de classe separada
			• Comparator objeto de classe anônima
			• Comparator objeto de expressão lambda com chaves
			• Comparator objeto de expressão lambda sem chaves
			• Comparator expressão lambda "direto no argumento"
		https://github.com/acenelio/lambda1-jav
		*/	

