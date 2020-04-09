package br.lasalle.opp.trab1;

import java.util.Scanner;

public class Campeonato {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Partida copa = new Partida();
		
		System.out.println("Iniciando as partidas da Rodada do Brasileirao");
		
		for(int i=1;i<4;i++)
		{
			
		System.out.println("Vai comecar a partida numero "+i);	
		
		System.out.println("Entre com o time 1:");
		String time1 = scanner.next();
		
		System.out.println("Entre com o time 2:");
		String time2 = scanner.next();
		
		System.out.println("Preparando o jogo n."+i);
		System.out.println("");
		
		copa.iniciarPartida(time1,time2);	
		
		System.out.println("");
		copa.finalizarPartida();
		
		copa.mostrarResultado();
		
		}
		
		System.out.println("");
		
		System.out.println("*********************************************************************************FIM DA RODADA***********************************************************************");
		
		System.out.println("Integrantes do grupo: ");
		System.out.println("Iago Albuquerque");
		System.out.println("Tiago Cruz");
		
		System.out.println("********************************************************************");
		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println("");
		System.out.println("********************************************************************");
	}

}
