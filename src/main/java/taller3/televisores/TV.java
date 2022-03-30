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
	private static int numTV;

	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		Tv.numTV ++;
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
		if((volumen>=0 && volumen<=7) && (this.estado)) {
			this.volumen = volumena;
			}}

	public int getCanal() {
		return canal;
	}

	public int setCanal (int canala) {
		if((canal>= 1 && canal <=120) && (this.estado)) {
			this.canal = canala;
		}
	}

	public void turnOn(){
		this.estado = true;
	}

	public void turnOff(){
		this.estado = false;
	}

	public static void setNumTV (int numTVa){
		TV.numTV = numTVa;
	}

	public int getNumTV(){
		return numTV;
	}

	public boolean getEstado(){
		return estado;
	}

	public void canalUp(){//revisar puede haber errorer en la ejecucion del gitjava
		if(this.estado && this.canal<120) {
			this.canal++;
		}
	}

	public void canalDown(){ //revisar puede haber errorer en la ejecucion del gitjava
		if(this.estado && this.canal>1) {
			this.canal--;
			}
	}

	public void volumenUp (){ //revisar puede haber errorer en la ejecucion del gitjava
		if(this.estado && this.volumen<7) {
			this.volumen++;
		}
	}


	public void volumenDown (){ //revisar puede haber errorer en la ejecucion del gitjava
		if(this.estado && this.volumen>0) {
			this.volumen--;
		}
	}  
}

