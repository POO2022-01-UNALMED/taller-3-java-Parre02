package taller3.televisores;
import taller3.televisores.Control;
import taller3.televisores.Marca;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private int numTV;

	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
	}

	public Marca getMarca() {
		return marca;
	}

	public Marca setMarca (Marca marcaa) {
		marca = marcaa;
		return marca;
	}

	public Control getControl() {
		return control;
	}

	public Control setControl (Control controla) {
		control = controla;
		return control;
	}

	public int getPrecio() {
		return precio;
	}

	public int setPrecio (int precioa) {
		precio = precioa;
		return precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public int setVolumen (int volumena) {
		volumen = volumena;
		return volumen;
	}

	public int getCanal() {
		return canal;
	}

	public int setCanal (int canala) {
		canal = canala;
		return canal;
	}

	public boolean turnOn(boolean estado){
		return this.estado = true;
	}

	public boolean turnOff(boolean estado){
		return this.estado = false;
	}

	public int setNumTV (int numTVa){
		numTV = numTVa;
		return numTV;
	}

	public int getNumTV(){
		return numTV;
	}

	public boolean getEstado(){
		return estado;
	}

	public int canalUp(int aum){//revisar puede haber errorer en la ejecucion del gitjava
		if(aum == 1 && canal >1 && canal < 120){
			this.canal = canal+1;
		}
		return aum;
	}

	public int canalDown(int baj){ //revisar puede haber errorer en la ejecucion del gitjava
		if(baj == -1 && canal >1 && canal < 120){
			this.canal = canal -1;
		}
		return baj;
	}

	public int volumenUp (int up){ //revisar puede haber errorer en la ejecucion del gitjava
		if(up == 1 && volumen >0 && volumen <7){
			this.volumen = volumen + 1;
		}
		return up;
	}


	public int volumenDown (int down){ //revisar puede haber errorer en la ejecucion del gitjava
		if(down == -1 && volumen >0 && volumen <7){
			this.volumen = volumen -1;
		}
		return down;
	}  
}

