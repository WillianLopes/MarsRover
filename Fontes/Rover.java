package marsrover;

public class Rover {
	
	/*
		Variáveis que representam os pontos cardeais num plano.
		Usado abreviação em inglês para não confundir L (Leste) com o L do comando do rover.
	*/	
	public static final Integer N = 1;
	public static final Integer E = 2;
	public static final Integer S = 3;
	public static final Integer W = 4;
	
	/* Atributos para gravar a posição geográfica do robô. */
	Integer x = 0;
	Integer y = 0;
	Integer direcao = 0;
	
	/* Método para indicar a posição inicial do robô. */
	public void setPosicao(Integer x, Integer y, Integer direcao) {
		this.x = x;
		this.y = y;
		this.direcao = direcao;
	}
	
	/* Método que mostra a posição final do robô. */
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
	
	/* Método que recupera cada charactere da string de comando. */
	public void processar(String comandos) {
		for (int i = 0; i < comandos.length(); i++) {
			processarComando(comandos.charAt(i));
		}
	}
	
	/* Método que realiza cada comando L, R e M */
	private void processarComando(Character comando) {		
		switch (comando) {
			case 'L': /* Muda direção do rover para esquerda. */
				if ((direcao - 1) < N )
					direcao = W;
				else
					direcao = direcao - 1;
				break;
				
			case 'R': /* Muda direção do rover para direita. */
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
				System.out.println("Comando " + comando + " inválido!");
				break;
		}
	}
}