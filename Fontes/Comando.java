package marsrover;

public class Comando {
	public static void main(String args[]) {
		Rover rover = new Rover();
		System.out.println("[Rover 1]Posi��o inicial: 1 2 N");
		rover.setPosicao(1, 2, Rover.N);
		System.out.println("[Rover 1]Comando: LMLMLMLMM");
		rover.processar("LMLMLMLMM");
		System.out.println("[Rover 1]Posi��o Final: " + rover.exibirPosicao());
		System.out.println("[Rover 2]Posi��o inicial: 3 3 E");
		rover.setPosicao(3, 3, Rover.E);
		System.out.println("[Rover 2]Comando: MMRMMRMRRM");
		rover.processar("MMRMMRMRRM");
		System.out.println("[Rover 2]Posi��o Final: " + rover.exibirPosicao());
	}
}