package com.myapp.empresapoo.modelo;

//Es una clase que hereda de empleado
public class Contratista extends Empleado {

	private int totalHoras;
	private float valorHora;

	// Constructor
	public Contratista(float valorHora, int totalHoras) {
		super();
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}

	// Getters
	public int getTotalHoras() {
		return totalHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	// Setters

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	

}
