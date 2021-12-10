import java.util.ArrayList;

public class ProjetoMeiaPiramide {

	public static void main(String[] args) {
		//Declaracao da variável string com os valores atribuidos para a meia piramide.
		String numeros = "8 52 5 45 64 98 82 52 34 46 36 65 58 37 71 94 56 16 87 83 60 83 38 42 77 45 67 17 98 14 26 59 10 71 19 98 49 87 85 40 12 6 90";
		
		
        int[] tamanho = new int[100]; // Declaracao do vetor 
        int contTam= 0, size = 0, menorsoma = 0, quantNum = 0; 

        //declaracao das duas listas
        
        ArrayList<Integer> lista1 = new ArrayList<>(); //contem todos os numeros da string
        
        ArrayList<Integer> lista2 = new ArrayList<>(); // contem apenas os menores numeros da string
        
        //definicao da posicao do primeiro numero da string, que no caso deve começar no primeiro espaco da lista listaNum.
        lista1.add(Integer.parseInt(numeros.substring(0, numeros.indexOf(" "))));
        
        //Espacamento do vetor "tamanho" para string numeros, uso de variavel para fazer a contagem.
        for (int i = 0; i < numeros.length(); i++) {
        	if (numeros.charAt(i) == ' ') {
        		tamanho[contTam] = i;
        		contTam++;
        	}
        }
        //Percorrer o vetor declarado acima e inserindo os numeros na primeira lista.
        for (int i= 0; i < tamanho.length; i++) {
        	if (tamanho[i] != 0) {
        		int index = tamanho[i] + 1;
        		int num;
        		if(i == contTam - 1) {
        			num = Integer.parseInt(numeros.substring(index));
        		} else {
        			num = Integer.parseInt(numeros.substring(index, tamanho[i + 1]));
        		}
        		lista1.add(num); //ultimo numero contido na lista.
        	}
        	
        }
        System.out.println("Quantidade: " + (contTam + 1));
        System.out.println("String: " + numeros);
        System.out.println("Lista: " + lista1 + "\n");
        
        System.out.println("--------------------------------------\n");
        
        
        System.out.println("-- PIRAMIDE -- \n");
        while(size < lista1.size()) {
        	int menorValor = 0;
        	
        	System.out.print("[");
        	//Identificar o menor numero e o resultado da soma.
        	for (int i = 0; i <= quantNum; i++) {
        		if (size < lista1.size()) {
        			if (i == quantNum) {
        				if (size == 0) {
        					menorValor = lista1.get(size);
        					System.out.print(lista1.get(size));
        				}else{
        					System.out.print(lista1.get(size));
        				if (lista1.get(size) < menorValor) 
        					menorValor = lista1.get(size);
        				}
        				
        				} else {
        					if (i == 0) {
        						menorValor = lista1.get(size);
        					} else {
        					if (lista1.get(size) < menorValor)
        					menorValor = lista1.get(size);
        					}
        					System.out.print(lista1.get(size) + ", ");
        				}
        				size++;
        			
        			}
        		}
        	System.out.println("]"); 
        	lista2.add(menorValor); //neste trecho, lista com os menores numeros sera adicionada, e sera feita a soma de seus numeros,
        	menorsoma += menorValor;
        	quantNum++;
        }
        
        System.out.println("\n--------------------------------------\n");
        System.out.println("Os menores valores são: "+lista2);
        System.out.println("A soma dos menores valores é: " + menorsoma + ".");
//ADS P1 MANHÃ
//ALUNO: JOSÉ RICARDO
//RGM: 27412644
//POO - PROGRAMAÇÃO ORIENTADA A OBJETOS
	

}
}
