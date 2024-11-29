package numeros;

import interfacess.Jugable;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero implements Jugable {

	public JuegoAdivinaImpar(int vidasIniciales) {
		super(vidasIniciales);
	}
	
	public boolean validaNumero(int numero) {
		if (numero % 2 != 0) {
			return true;
		} else {
			System.out.println("El n�mero tiene que ser par");
			return false;
		}
	}
	
	public void Juega() {
		
	}
	public void muestraNombre() {
		System.out.println("Adivina un n�mero impar");
	}

	public void muestraInfo() {
		System.out.println("Tendr�s que adivinar un n�mero impar. Para ello tendr�s 3 vidas");
	}

}
