package notas;
import java.util.Scanner;
public class Medias {
String nome;
String matricula;
String[]disciplina = new String [3];
double[][]notas=new double[3][4];
String curso;


	Scanner dados = new Scanner(System.in);

	void resultado() {
	
		for(int i=0; i<disciplina.length;i++) {
			double soma=0;
			System.out.print(" disciplina "+disciplina[i]);

		for(int j=0; j<notas[i].length;j++) {
		
	
			
			soma+=notas[i][j];
			
		}
		
			double media=0;
			media=soma/4;
						
			if(media>=7) {
		
			
			System.out.print(" aluno aprovado media= "+media);
			System.out.println("");
			}
			else {
				
				System.out.print(" aluno reprovado media= "+media);
				System.out.println();
			}
		
		
			}
			
}

			
	}
