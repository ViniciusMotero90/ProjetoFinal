package agendamento;

public class FuncoesAgendamento {

	//Aqui devem ser criadas as funções utilizadas no arquivo SistemaAgendamento
	public static void exibirmenu() {
		System.out.println("1 - Inserir horarios");
		System.out.println("2 - Agendar horarios");
		System.out.println("3 - Exibir agenda");
		System.out.println("4 - Sair");
		return;
	}
	
	public static void inserirHorario(String [] agendamentos, String horarioDigitado, int i) {
		agendamentos[i] = horarioDigitado;
		return;
	}
}
