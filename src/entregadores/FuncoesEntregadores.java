package entregadores;

import java.util.Scanner;

public class FuncoesEntregadores {
	public static boolean login(String usuario, String senha) {
		if(usuario.equalsIgnoreCase(usuario) && senha.equals(senha)) {
			return true;
		}
		return false;
	}
	
	public static void exibirMenu() {
		System.out.println("------ Menu ------");
		System.out.println("1 - cadastrar Entregador");
		System.out.println("2 - alterar Avaliacao");
		System.out.println("3 - melhor Avaliado");
		System.out.println("4 - sair");
	}
	
	public static String cadastrarEntregador(String[] nomesEntregadores,String[] telefonesEntregadores,double[] avaliacoesEntregadores,String novoNome,String novoTelefone,String novaAvaliacao) {
		nomesEntregadores = new String[novoNome.length()];
		telefonesEntregadores = new String[novoTelefone.length()];
		avaliacoesEntregadores = new double[novaAvaliacao.length()];
		Scanner leitor = new Scanner(System.in);
		for(int i =0;i <nomesEntregadores.length-1;i++) {
			System.out.println("Digite o seu nome?");
			novoNome = leitor.next();
			System.out.println("Digite o seu novo Telefone?");
			novoTelefone = leitor.next();
			System.out.println("Digite o seu nova Avaliacao?");
			novaAvaliacao = leitor.next();
		}
		return novaAvaliacao;
	}
	
	public static String alterarAvaliacao(String[] nomesEntregadores,double[] avaliacoesEntregadores,String novaAvaliacao) {
		return novaAvaliacao;
		
	}
	
	public static String melhorAvaliado(String[] nomesEntregadores,String[] telefonesEntregadores,double[] avaliacoesEntregadores) {
		return null;
		
	}
}
