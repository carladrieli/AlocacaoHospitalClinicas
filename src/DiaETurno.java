import java.util.ArrayList;
import java.util.Scanner;

public class DiaETurno {

	protected int dia ;
	protected int turno ;	
	
	public int getDia() {
		return dia;
	}

	public int getTurno() {
		return turno;
	}
	
	
	void escolherDia (){
	
		Scanner ler = new Scanner(System.in);
		int selecao = ler.nextInt();
		
		System.out.println("Selecione um dia da semana: ");	
		System.out.print("1 - Domingo \n2 - Segunda-Feira \n3 - Terça-Feira \n4 - Quarta-Feira \n5 - Quinta-Feira \n6 - Sexta-Feira \n7 - Sábado \n");
		
		switch (selecao) {
			case 1:		// Domingo
				this.dia=1;  
				escolherTurno();
				break;
				
			case 2:		//Segunda-feira
				this.dia=2;  
				escolherTurno();
				break;
				
			case 3:		//Terça-feira
				this.dia=3;  
				escolherTurno();
				break;
				
			case 4:		//Quarta-feira
				this.dia=4;  
				escolherTurno();
				break;
				
			case 5:		//Quinta-feira
				this.dia=5;  
				escolherTurno();
				break;
				
			case 6:		//Sexta-feira
				this.dia=6;  
				escolherTurno();
				break;
				
			case 7:		//Sábado
				this.dia=7;  
				escolherTurno();
				break;
				
			default:
				System.out.println("Este não é um dia válido!");
				break;
		
		}
	
	}
	 
	void escolherTurno(){
		Scanner ler = new Scanner(System.in);
		int selecao = ler.nextInt();
		switch (selecao){
			case 1:		// Manhã
				this.turno=1;  
				break;

			case 2:		// Tarde
				this.turno=2;  
				break;
			
			case 3:		// Noite
				this.turno=3;  
				break;
		}
	}
}