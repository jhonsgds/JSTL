package modelo;

import java.util.ArrayList;

public class credito {
	private float montoInicial;
	private float montoFinal;
	private float tasa;
	private int cuotas;
	private ArrayList<Float> listacuotas;
	
	public credito() {
	}
	
	public credito(float montoInicial, float tasa, int cuotas) {
		this.montoInicial = montoInicial;
		this.tasa = tasa;
		this.cuotas = cuotas;
		this.listacuotas = new ArrayList<Float>();
	}
	
	public float getMontoInicial() {
		return montoInicial;
	}

	public void setMontoInicial(float montoInicial) {
		this.montoInicial = montoInicial;
	}

	public float getMontoFinal() {
		return montoFinal;
	}

	public void setMontoFinal(float montoFinal) {
		this.montoFinal = montoFinal;
	}

	public float getTasa() {
		return tasa;
	}

	public void setTasa(float tasa) {
		this.tasa = tasa;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public ArrayList<Float> getListacuotas() {
		return listacuotas;
	}

	public void setListacuotas(ArrayList<Float> listacuotas) {
		this.listacuotas = listacuotas;
	}
	
	public void CalcularCredito() {
		float interes = this.getCuotas() * this.getTasa();
		float montofinal = this.getMontoInicial() + this.getMontoInicial() * interes/100;
		float valorCuota = montofinal / this.getCuotas();
		this.setMontoFinal(montofinal);
		for(int i = 0; i < this.getCuotas(); i++) {
			this.getListacuotas().add(valorCuota);
		}
	}
}
