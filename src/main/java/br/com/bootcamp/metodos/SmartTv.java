package br.com.bootcamp.metodos;

public class SmartTv {

	public boolean ligada = false;
	public int canal = 5;
	public int volume = 15;

	public void liga(){
		ligada = true;
	}

	public void desliga(){
		if (tvEstaLigada(ligada)){
			ligada = false;
		}
	}

	public void aumentaVolume(){
		if (tvEstaLigada(ligada)) {
			volume++;
		}
	}

	public void diminuiVolume(){
		if (tvEstaLigada(ligada)){
			volume--;
		}
	}

	public void mudaCanal(int canal){
		if (tvEstaLigada(ligada)){
			this.canal = canal;
		}
	}

	public boolean tvEstaLigada(Boolean ligada){
		if (ligada == true){
			return true;
		}
		return false;
	}



}
