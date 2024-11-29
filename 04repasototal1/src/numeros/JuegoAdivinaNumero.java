package numeros;

import java.util.Random;
import java.util.Scanner;

import interfacess.Jugable;
import juegos.Juego;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	int vidas;
	int numAdivinar;
	Random rand = new Random();
	Scanner entrada = new Scanner(System.in);

	public JuegoAdivinaNumero(int vidasIniciales) {
		super(vidasIniciales);

	}

	public boolean validaNumero(int numero) {
		return true;

	}

	int numUsuario;

	public void Juega() {
		reiniciar();
		System.out.println("Adivina el n�mero del 0 al 10: ");

		numUsuario = entrada.nextInt();
		int valorRand = rand.nextInt(10) + 1;
		for (int i = 0; i < 10; i++) {

			if (!validaNumero(numUsuario)) {
				System.out.println("N�mero no v�lido");
			}

			if (valorRand == numUsuario) {

				System.out.println("Has acertado!");
				actualizaRecord();
				break;
			} else {
				quitaVida();
				System.out.println("Numero incorrecto, intentalo de nuevo que te quedan vidas");
			}
			if (getVidasRestantes() == 0) {
				System.out.println("No te quedan vidas");
			}
			break;

		}
		entrada.close();
	}

	@Override
	public void muestraNombre() {
		System.out.println("Adivina un n�mero");
	}

	@Override
	public void muestraInfo() {
		System.out
				.println("Tendr�s que adivinar un n�mero aleatorio generado por el sistema. Para ello tendr�s 3 vidas");
	}
}
