package QuestaoVinteNoveAtualizada;

public class QuestaoVinteNoveRespostaAtualizada
{
	private int[]vetorRodado;

	public QuestaoVinteNoveRespostaAtualizada(int[]vetor, int posicao)
	{
		this.vetorRodado = new int[vetor.length];
		this.mostrar(vetor);
		this.rodarVetor(vetor, posicao);
		this.mostrar(this.vetorRodado);
	}

	private void rodarVetor(int[]vetor, int posicao)
	{
			
		for(int i = posicao; i >= 0 ; i--)
		{
			// se o contador chegar igual zero, a função irá parar para não dar ExceptionArrayOutOfBounds; 
			if(i == 0)
			{
				break;
			}
			// Nessa parte está toda a lógica da questão
			
			// Essa variável "aux" irá ajudar na troca de posição dos valores do vetor
			int aux = 0;

			// Condição de troca, se o número da posição atual for menor do que a posição anterior
			if(vetor[i] < vetor[i-1]){
				// Com isso é só realizar a troca com a ajuda da variável auxiliar
				aux = vetor[i-1];
				vetor[i-1] = vetor[i];
				vetor[i] = aux;
			}
		}

		// Por ultimo estou copiando os valores do vetor para o vetor da classe
		// Mas essa parte não é necessária
		for(int i = 0; i < this.vetorRodado.length; i++)
		{
			this.vetorRodado[i] = vetor[i];	
		}

	}

	
	private void mostrar(int[]vetor)
	{
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.println(i + "° = " + vetor[i]);	
		}
		System.out.println("============================================");
	}

}
