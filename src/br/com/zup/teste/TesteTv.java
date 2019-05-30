package br.com.zup.teste;

import br.com.zup.modelo.Analogica;

public class TesteTv {

	public static void main(String[] args) {
		
		Analogica analogica = new Analogica(27, 2, 50, true, "Toshiba - K8S1000");
		
		analogica.desligarTelevisao(false);
		
		System.out.println(analogica);
	}

}
