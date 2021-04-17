import java.util.Scanner;

public class funcionario {

	int menos;
	double salario[] = new double[90];
	Scanner leia = new Scanner(System.in);
	

	public void reg() {
		System.out.println("================== Vetor com salario ===================");
		//Registrar os salarios	
		for (int c = 1 ; c < 91; c++) {
				System.out.println("Qual o  salario do "+c+"° funcionário?");
				salario[c-1] = leia.nextDouble();
				if (salario[c-1] < 900.00) {
					menos = menos + 1;
				}
			}
		System.out.println("___________________  Verificando quantos funcionarios recebem menos de R$900,00 _____________________");
		System.out.println();
		System.out.println(menos+" funcionarios recebem menos de R$ 900,00");		
		
		
	}
	
	
	
	
}
