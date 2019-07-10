package com.myapp.empresapoo.modelo;


//Clase que hereda de Planta
public class Planta extends Empleado {
	
	private float deducciones;
	private float sueldoBasico;
	private float valorExtras;
	public float getDeducciones() {
		return deducciones;
	}
	
	//Constructor
	public Planta() {
		super();
	}
	
	public Planta(float deducciones, float sueldoBasico, float valorExtras) {
		super();
		this.deducciones = deducciones;
		this.sueldoBasico = sueldoBasico;
		this.valorExtras = valorExtras;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}
	

	public void setDeducciones(float deducciones) {
		this.deducciones = deducciones;
	}


	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}


	public void setValorExtras(float valorExtras) {
		this.valorExtras = valorExtras;
	}


	public float getValorExtras() {
		return valorExtras;
	}
	
	
}
