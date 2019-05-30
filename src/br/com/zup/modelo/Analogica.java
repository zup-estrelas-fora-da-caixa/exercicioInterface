package br.com.zup.modelo;

import br.com.zup.interfaces.TvInterface;

public class Analogica extends Tv implements TvInterface {
	
	private String modelo;
	
	// Construtor
	public Analogica(int tamanho, int canal, int volume, boolean ligada, String modelo) {
		super(tamanho, canal, volume, ligada);
		this.modelo = modelo;
	}
	
	// Getters e Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		
		String modelo = "";
		
		modelo += "Tamanho -> " + super.getTamanho() + "\n";
		modelo += "Canal -> " + super.getCanal() + "\n";
		modelo += "Volume -> " + super.getVolume() + "\n";
		modelo += "Está ligada? -> " + super.isLigada() + "\n";
		modelo += "Modelo TV -> " + this.getModelo() + "\n";
		
		return modelo;
	}

	@Override
	public void aumentarVolume(int valorVolume) {
		if ((valorVolume + super.getVolume()) <= 100) {
			super.setVolume(super.getVolume() + valorVolume);
		} else {
			System.out.println("Comando inválido!");
		}
	}

	@Override
	public void diminuirVolume(int valorVolume) {
		if ((super.getVolume() - valorVolume) >= 0) {
			super.setVolume(super.getVolume() - valorVolume);
		} else {
			System.out.println("Comando inválido!");
		}
	}

	@Override
	public void ligarTelevisao(boolean ligarTv) {
		if (ligarTv == true) {
			super.setLigada(ligarTv);
		} else {
			System.out.println("Comando inválido!");
		}
	}

	@Override
	public void desligarTelevisao(boolean desligarTv) {
		if (desligarTv == false) {
			super.setLigada(desligarTv);
		} else {
			System.out.println("Comando inválido!");
		}
	}
}
