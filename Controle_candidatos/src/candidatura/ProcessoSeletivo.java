package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		for (String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando)
				tentativasRealizadas ++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
		}while(continuarTentando && tentativasRealizadas > 3);
		
		if(atendeu)
			System.out.println("Contato com: " + candidato + ", número de tentativas: " + tentativasRealizadas);
		    System.out.println("Não conseguimos Contato com: " + candidato + ", número de tentativas: " + tentativasRealizadas);

	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		System.out.println("Lista de candidatos:");
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato número " + indice + " é " + candidatos[indice]);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio",
				"Mirela", "Daniel", "Jorge","Daniel"
		};
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("Candidato selecionado para a vaga: " + candidato);
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
				}
	
	 static void Candidatura(double salarioPretendido) {
		double salarioBase = 2.000;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato.");
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com a contra proposta.");
		}
		else {
			System.out.println("Aguardando demais candidatos.");
		}
	}

}
