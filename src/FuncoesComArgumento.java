
public class FuncoesComArgumento {

	public static void exibirSaudacao(String nome) { 
		System.out.println("hoje � um belo dia " + nome);
	}
	
	public static void main(String[] args) {
		System.out.println("Mensagem da main antes de chamar a fun��o");
		exibirSaudacao("Rbs");
		System.out.println("Mensagem da main depois de chamar a fun��o");
	}

}
