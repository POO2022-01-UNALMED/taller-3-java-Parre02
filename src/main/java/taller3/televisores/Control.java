package taller3.televisores;
import taller3.televisores.TV;

public class Control {
	private TV tv;

	public void enlazar(TV tv) {
		tv.setControl(this);
		this.tv = tv;
	}

	public void turnOn() {
		if(tv instanceof TV) {
			tv.turnOn(true);
		}
	}
	public void turnOff() {
		if(tv instanceof TV) {
			tv.turnOff(false);
		}
	}
	public void canalUp() {
		if(tv instanceof TV) {
			tv.canalUp(+1);
		}
	}
	public void canalDown() {
		if(tv instanceof TV) {
			tv.canalDown(-1);
		}
	}
	public void volumenUp() {
		if(tv instanceof TV) {
			tv.volumenUp(+1);
		}
	}
	public void volumenDown() {
		if(tv instanceof TV) {
			tv.volumenDown(-1);
		}
	}
	public void setCanal(int canal) {
		if(tv instanceof TV) {
			tv.setCanal(canal);
		}
	}

	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
}
