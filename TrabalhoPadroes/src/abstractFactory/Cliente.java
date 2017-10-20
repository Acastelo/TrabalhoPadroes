/* Considere os seguintes conceitos do mundo real: pizzaria, pizzaiolo, pizza, consumidor.
 * Considere ainda que em uma determinada pizzaria, dois pizzaiolos se alternam.
 * Um deles trabalha segundas, quartas e sextas e só sabe fazer pizza de calabresa (queijo + calabresa + tomate),
 * o outro trabalha terças, quintas e sábados e só sabe fazer pizza de presunto (queijo + presunto + tomate).
 * A pizzaria fecha aos domingos Tente mapear os conceitos acima para o padrão Abstract Factory
 * (hierarquia de fábricas, hierarquia de produtos, cliente) e implemente um programa que receba uma data como parâmetro (formato dd/mm/yyyy)
 * e imprima os ingredientes da pizza que é feita no dia ou, se a pizzaria estiver fechada, informe isso na tela.
 */
package abstractFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {

		DateFormat df1;
		DateFormat df2;
		Date dt;
		String dataRecebida;
		String dia;

		while (true) {
			df1 = null;
			df2 = null;
			dt = null;
			dataRecebida = "";
			dia = "";

			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Digite uma data no formato dd/MM/yyyy: ");
				dataRecebida = s.nextLine();
				df1 = new SimpleDateFormat("dd/MM/yyyy");
				dt = df1.parse(dataRecebida);
				df2 = new SimpleDateFormat("EEEE");
				dia = df2.format(dt);
				ImprimirIngredientes(dia);
			} catch (Exception ex) {
				System.out.println("Data inválida!");
			}
		}
	}

	private static void ImprimirIngredientes(String dia) {
		FabricaPizza fabrica = DeterminadaPizzaria.getInstancia();
		String msg = "";
		msg = fabrica.informarIngredientesDoDia(dia);
		System.out.println(msg);
	}
}
