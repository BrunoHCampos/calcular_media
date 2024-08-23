package notas;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] ordem= new String[3];
ordem[0]=" primeira ";
ordem[1]=" segunda ";
ordem[2]=" terceira ";
	Scanner scan= new Scanner (System.in);
		Medias md = new Medias();
		
		
		System.out.println("Digite o nome do aluno");
			md.nome=scan.next();
		
		System.out.println("Digite o número da matricula do aluno");
			md.matricula=scan.next();
		
		for(int i=0; i<md.notas.length;i++) {
		System.out.println("Digite o nome  da "+ordem[i]+"disciplina");
			md.disciplina[i]=scan.next();
	
		for(int j=0; j<md.notas[i].length;j++) {
		
		System.out.println("Insira a nota "+(j+1));
		md.notas[i][j]=scan.nextDouble();
		
		while(10<md.notas[i][j]) {
		System.out.println("digite um valor entre 0 e 10");
		md.notas[i][j]=scan.nextDouble();
		}	
		}
		}
	
	
		
		
		System.out.println(" Aluno= "+md.nome);
		System.out.println(" numero da matricula "+md.matricula);
		
		md.resultado();
		
		
		
		
	
		
	
		 
	}
	}
	
