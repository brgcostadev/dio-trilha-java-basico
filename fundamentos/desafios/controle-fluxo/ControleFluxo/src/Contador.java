import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm,parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Gentileza informar o segundo parâmetro maior que o primeiro");
		}
		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		int contador = 0;
		while(contagem > contador){
			contador++;
			parametroUm++;
			System.out.println("Imprimindo o número: " + parametroUm);
		}
	}
}

