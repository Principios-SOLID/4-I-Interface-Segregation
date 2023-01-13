package solucion;



public class Musica {
	public static void reproducirMelodia(InstrumentoMelodico instrumento) {
		instrumento.reproducirNotaFa();
		instrumento.reproducirNotaMi();
		instrumento.reproducirNotaRe();
		instrumento.reproducirNotaDo();
		instrumento.reproducirNotaRe();
		instrumento.reproducirNotaRe();

	}

	public static void reproducirRitmo(InstrumentoPercusion instrumento) {
		instrumento.reproducirBombo();
		instrumento.reproducirBombo();
		instrumento.reproducirRedoblante();
	}
}
