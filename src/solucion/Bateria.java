package solucion;

public class Bateria implements InstrumentoPercusion, Afinacion{

	@Override
	public void afinar() {
		System.out.println("*Afinar parche*");
		
	}

	@Override
	public void reproducirRedoblante() {
		System.out.println("*Sonido de Redoblante*");
		
	}

	@Override
	public void reproducirBombo() {
		System.out.println("*Sonido de Bombo*");
		
	}

}
