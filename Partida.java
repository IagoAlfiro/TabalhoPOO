package br.lasalle.opp.trab1;

import java.util.Random;
import java.util.Scanner;


public class Partida {
	
	private Time timeVisitante = new Time();
	private Time timeLocal = new Time();
	private int scoreVisitante;
	private int scoreLocal;
	private String dataPartida;
	
	public void iniciarPartida(String timeLocal,String timeVisitante) {
		
		Random random = new Random();
		
		this.timeVisitante.setNome(timeVisitante);
		this.timeLocal.setNome(timeLocal);
		
		scoreVisitante=random.nextInt(10);
		scoreLocal=random.nextInt(10);

		
	}
	
	public void mostrarResultado() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Pronto para iniciar partida? *** <Pressione uma tecla>");
		scanner.nextLine();
		
		System.out.println("");
		
		System.out.println("Inicio do Jogo. Partida Iniciada !!");
		
        System.out.println(timeLocal.getNome()+" "+scoreLocal+" X "+scoreVisitante+" "+timeVisitante.getNome());
        
    	System.out.println("");
        this.timeLocal.listar();
		this.timeVisitante.listar();
		
		this.timeLocal.setQtdVitorias(0);
		this.timeLocal.setQtdPontos(0);
		this.timeLocal.setQtdDerrotas(0);
		this.timeVisitante.setQtdVitorias(0);
		this.timeVisitante.setQtdPontos(0);
		this.timeVisitante.setQtdDerrotas(0);
		
		System.out.println("****************************************************************************************************");
        
        
		
	}
	
	public void finalizarPartida() {
		
		this.timeLocal.listar();
		this.timeVisitante.listar();
		
		
		if(scoreLocal > scoreVisitante)
		{
			//vencedor
				timeLocal.setQtdVitorias(1);
				timeLocal.setQtdPontos(3);
			//perdedor
				timeVisitante.setQtdDerrotas(1);
		}
		else if(scoreVisitante > scoreLocal)
		{
			//vencedor
				timeVisitante.setQtdVitorias(1);
				timeVisitante.setQtdPontos(3);
			//perdedor
				timeLocal.setQtdDerrotas(1);
		}
		else 
		{
			timeLocal.setQtdEmpates(1);
			timeLocal.setQtdPontos(1);
			
			timeVisitante.setQtdEmpates(1);
			timeVisitante.setQtdPontos(1);
			
		}
		
		
	}
	

}
