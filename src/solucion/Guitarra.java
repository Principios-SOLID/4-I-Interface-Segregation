package solucion;

public class Guitarra implements InstrumentoMelodico, Afinacion{

	@Override
	public void afinar() {
		System.out.println("*Afinar cuerda*");
		
	}

	@Override
	public void reproducirNotaDo() {
		System.out.println("*Nota Do*");
		
	}

	@Override
	public void reproducirNotaRe() {
		System.out.println("*Nota Re*");
		
	}

	@Override
	public void reproducirNotaMi() {
		System.out.println("*Nota Mi*");
		
	}

	@Override
	public void reproducirNotaFa() {
		System.out.println("*Nota Fa*");
		
	}

}
