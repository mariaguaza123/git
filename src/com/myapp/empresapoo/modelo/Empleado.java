package com.myapp.empresapoo.modelo;



public class Empleado {
	protected String cargo;
	protected int identificacion;
	protected String nombre;
	protected float salario;
	

	// Metodo constructor
	public Empleado() {
		super();
	}

	public Empleado(String cargo, int identificacion, String nombre, float salario) {
		this.cargo = cargo;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.salario = salario;
	}
	

	//Getters

	public String getCargo() {
		return cargo;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public float getSalario() {
		return salario;
	}
	
	//Setters

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
		  
		  

	}
	
	
	
	
	
	

	
	

