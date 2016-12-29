package marsrover;

public class Rover {
	
	/*
		Vari�veis que representam os pontos cardeais num plano.
		Usado abrevia��o em ingl�s para n�o confundir L (Leste) com o L do comando do rover.
	*/	
	public static final Integer N = 1;
	public static final Integer E = 2;
	public static final Integer S = 3;
	public static final Integer W = 4;
	
	/* Atributos para gravar a posi��o geogr�fica do rob�. */
	Integer x = 0;
	Integer y = 0;
	Integer direcao = 0;
	
	/* M�todo para indicar a posi��o inicial do rob�. */
	public void setPosicao(Integer x, Integer y, Integer direcao) {
		this.x = x;
		this.y = y;
		this.direcao = direcao;
	}
	
	/* M�todo que mostra a posi��o final do rob�. */
	public String exibirPosicao() {
		char dir = ' ';
		switch (direcao) {
			case 1:
				dir = 'N';
				break;
			case 2:
				dir = 'E';
				break;
			case 3:
				dir = 'S';
				break;
			case 4:
				dir = 'W';
				break;
			default:
				dir = 'N';
				break;
		}
		
		return x + " " + y + " " + dir;
	}
	
	/* M�todo que recupera cada charactere da string de comando. */
	public void processar(String comandos) {
		for (int i = 0; i < comandos.length(); i++) {
			processarComando(comandos.charAt(i));
		}
	}
	
	/* M�todo que realiza cada comando L, R e M */
	private void processarComando(Character comando) {		
		switch (comando) {
			case 'L': /* Muda dire��o do rover para esquerda. */
				if ((direcao - 1) < N )
					direcao = W;
				else
					direcao = direcao - 1;
				break;
				
			case 'R': /* Muda dire��o do rover para direita. */
				if((direcao + 1) > W)
					direcao = N;
				else
					direcao = direcao + 1;
				break;
				
			case 'M': /* Realiza de fato o movimento. */
				if (direcao == N) {
					this.y++;
				} else if (direcao == E) {
					this.x++;
				} else if (direcao == S) {
					this.y--;
				} else if (direcao == W) {
					this.x--;
				}
				break;
				
			default:
				System.out.println("Comando " + comando + " inv�lido!");
				break;
		}
	}
}