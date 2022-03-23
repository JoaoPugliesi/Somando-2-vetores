
public class SomandoDoisVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet1[] = {2,4,6,8}; 
		int vet2[] = {8,6,4,2};
		int soma = 0;
		
		for(int i = 0; i <=3; i++) {
			
			System.out.println("O índice " + i + " do vetor |1|  recebe o valor: " + vet1[i]);
			System.out.println("O índice " + i + " do vetor |2|  recebe o valor: " + vet2[i]);
			System.out.println("----------------------------------------");
			soma = soma + (vet1[i] + vet2[i]);
		}
		System.out.println("A soma dos elementos dos dois vetores é igual a: " + soma + "!");
	}

}
