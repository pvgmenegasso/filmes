import java.util.Scanner;

public class main {
	
	
	
	
	// função requerida
	public static void filme(String[] personagens,String[] filmes, int[] anos, int id)
	{
		// vetor para armazenar o tamanho dos arrays
		int[] size = {0, 0, 0} ;
		
		// atribuição do tamanho dos arrays
		size[0] = personagens.length ;
		size[1] = filmes.length ;
		size[2] = anos.length ;
		
		// supoe que o primeiro seja o menor
		int menor = size[0] ;
		
		// testa se algum outro é menor que o suposto menor, se for, muda o menor para este
		for(int i = 1 ; i <= 2 ; i++)
		{
			if(size[i] <= menor)
			{
				menor = size[i] ;
				System.out.println(menor);
			}
		}
				
		// checa se nao passou id negativo		
		if(id <= 0)
		{
			System.out.println("Id: "+id+" invalido, tente novamente");
			// retorna pra forçar sair da função
			return ;
		}
		
		// faz o -1 no id pois em java array começa no 0. Verifica se id está dentro do tamanho máximo
		if(id-1 < menor)
		{
			System.out.println(""+personagens[id-1]+" é um personagem do filme: '"+filmes[id-1]+"' que estreou em: "+anos[id-1]);
			return ;
		}
		
			// caso contrario id inválido
			else
			{
				System.out.println("Id: "+id+" invalido, tente novamente");
				return ;
			}
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) 
	{

		// coisas relacionadas a pegar o input do teclado para o id
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("entre uma id : ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		
		// declaração arrays pro teste
		String[] filmes = {"3 homens em conflito", "matrix", "senhor do anéis"} ;
		String[] personagens = {"Tuco", "Neo", "Frodo"} ;
		int[] anos = {1950, 1999, 2003} ;
		
		
		// uso da função filme
		filme(personagens, filmes, anos, n) ;
		
		
		
		

	}

}


