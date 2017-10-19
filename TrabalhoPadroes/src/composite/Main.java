package composite;

public class Main {

	public static void main(String[] args) {
		Congresso congresso = new Congresso("CBSoft", 10);
		
		System.out.println("===================================================================================");
		System.out.println(congresso.toString());
		System.out.println("===================================================================================");

		Participante participante1 = new Individuo("Carlos", 1);
		Participante participante2 = new Individuo("Alexandre", 2);
		Participante participante3 = new Individuo("Emerson", 3);
		Participante participante4 = new Individuo("Patricia", 4);
		Participante participante5 = new Individuo("Wanessa", 5);
		Participante participante6 = new Individuo("Bruno", 6);
		Participante participante7 = new Individuo("Paulo", 7);
		Participante participante8 = new Individuo("Romulo", 8);
		Participante participante9 = new Individuo("Thayse", 9);
		Participante participante10 = new Individuo("Rapahael", 10);
		Participante participante11 = new Individuo("Duarte", 11);

		Participante participanteInstUECE = new Instituicao("UECE");
		
		participanteInstUECE.adicionar(participante2);
		participanteInstUECE.adicionar(participante3);
		participanteInstUECE.adicionar(participante4);
		participanteInstUECE.adicionar(participante5);
		
		System.out.println("===================================================================================");
		System.out.println("PARTICIPANTES");
		((Instituicao)participanteInstUECE).imprimirMembros();
		System.out.println("===================================================================================");
		
		
		Participante participanteInstUFC = new Instituicao("UFC");
		
		participanteInstUFC.adicionar(participante6);
		participanteInstUFC.adicionar(participante7);
		participanteInstUFC.adicionar(participante8);
		participanteInstUFC.adicionar(participante9);
		participanteInstUFC.adicionar(participante10);
		
		System.out.println("===================================================================================");
		System.out.println("PARTICIPANTES");
		((Instituicao)participanteInstUFC).imprimirMembros();
		System.out.println("===================================================================================");
		
		
		participanteInstUFC.adicionar(participante11);
		
		congresso.adicionarParticipante(participante1);
		congresso.adicionarParticipante(participanteInstUECE);
		congresso.adicionarParticipante(participanteInstUFC);

		System.out.println("===================================================================================");
		System.out.println(congresso.toString());
		System.out.println("===================================================================================");

		System.out.println("PARTICIPANTES INSCRITOS NO CONGRESSO");
		congresso.imprimeParticipantes();
		
	}
}
