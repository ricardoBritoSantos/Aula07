
public class FuncoesComArgumento {

	public static void exibirMensagem() { 
		System.out.println("hoje é um belo dia");
	}
	
	public static void main(String[] args) {
		System.out.println("Mensagem da main antes de chamar a função");
		exibirMensagem();
		System.out.println("Mensagem da main depois de chamar a função");
	}

}
