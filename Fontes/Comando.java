package marsrover;

public class Comando {
	public static void main(String args[]) {
		Rover rover = new Rover();
		System.out.println("[Rover 1]Posição inicial: 1 2 N");
		rover.setPosicao(1, 2, Rover.N);
		System.out.println("[Rover 1]Comando: LMLMLMLMM");
		rover.processar("LMLMLMLMM");
		System.out.println("[Rover 1]Posição Final: " + rover.exibirPosicao());
		System.out.println("[Rover 2]Posição inicial: 3 3 E");
		rover.setPosicao(3, 3, Rover.E);
		System.out.println("[Rover 2]Comando: MMRMMRMRRM");
		rover.processar("MMRMMRMRRM");
		System.out.println("[Rover 2]Posição Final: " + rover.exibirPosicao());
	}
}