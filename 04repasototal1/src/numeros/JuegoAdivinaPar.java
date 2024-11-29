package numeros;

import interfacess.Jugable;

public class JuegoAdivinaPar extends JuegoAdivinaNumero implements Jugable {

	public JuegoAdivinaPar(int vidasIniciales) {
		super(vidasIniciales);

	}

	public boolean validaNumero(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			System.out.println("El n�mero tiene que ser par");
			return false;
		}
	}

	public void muestraNombre() {
		System.out.println("Adivina un n�mero par");
	}

	public void muestraInfo() {
		System.out.println("Tendr�s que adivinar un n�mero par. Para ello tendr�s 3 vidas");

	}

}
