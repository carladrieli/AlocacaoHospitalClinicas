import java.util.ArrayList;
import java.util.Scanner;

public class Alocacao {

	protected byte dia ;
	protected byte turno ;
	
	
	public byte getDia() {
		return dia;
	}

	public byte getTurno() {
		return turno;
	}
	
	void escolherDiaETurno (){
		Scanner ler = new Scanner(System.in);	
		System.out.println("Selecione um dia da semana: ");	
		System.out.print("1 - Domingo \n2 - Segunda-Feira \n3 - Terça-Feira \n4 - Quarta-Feira \n5 - Quinta-Feira \n6 - Sexta-Feira \n7 - Sábado \n");

		this.dia = ler.nextByte();

        System.out.println("Selecione um turno do dia da semana escolhido anteriormente: ");	
        System.out.print("1 - Manha \n2 - Tarde \n3 - Noite \n");
		
		this.turno = ler.nextByte();	
	}

	
	public void alocarEscalaFinal(){
		
	}
	
	public void imprimirEscalaEscolhida(){
		
	}
	
	public void imprimirEscalaPorFuncionario(){
		
	}


}