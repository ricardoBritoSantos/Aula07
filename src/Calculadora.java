import java.util.Scanner;

public class Calculadora {
	
	public static void soma(double valor1, double valor2) {
		System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
		var soma = valor1 + valor2;
		exibirResultado(soma);
	}
	
	public static void subtracao(double valor1, double valor2) {
		System.out.println("\n\nRealizando a subtra��o entre " + valor1 + " e " + valor2);
		var subtracao = valor1 - valor2;
		exibirResultado(subtracao);
	}
	
	public static void divisao(double valor1, double valor2) {
		System.out.println("\n\nRealizando a divis�o entre " + valor1 + " e " + valor2);
		var divisao = valor1 / valor2;
		exibirResultado(divisao);
	}
	
	public static void multiplicacao(double valor1, double valor2) {
		System.out.println("\n\nRealizando a multiplica��o entre " + valor1 + " e " + valor2);
		var multiplicacao = valor1 * valor2;
		exibirResultado(multiplicacao);
	}
	
	public static void exibirResultado(double resultado) {
		System.out.println("O resultado foi " + resultado + "!\n\n");
	}


	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		int opcao = 0;
		
		while (opcao!=6) {
			System.out.println("PROGRAMA CALCULADORA");
			System.out.println("Escolha sua op��o!");
			System.out.println("1 - Digitar valores");
			System.out.println("2 - Realizar soma");
			System.out.println("3 - Realizar subtra��o");
			System.out.println("4 - Realizar divis�o");
			System.out.println("5 - Realizar multiplica��o");
			System.out.println("6 - Sair");
			opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("\n\nDigite o 1� valor:");
					valor1 = leitor.nextDouble();
					System.out.println("\n\nDigite o 2� valor:");
					valor2 = leitor.nextDouble();
					
					System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
					
					break; 
				case 2: soma(valor1, valor2); break;
				case 3: subtracao(valor1, valor2);break;
				case 4: divisao(valor1, valor2); break;
				case 5: multiplicacao(valor1, valor2); break;
				case 6:	System.out.println("Saindo do sistema"); break;
			}
			
		}
		leitor.close();
		

	}

}
