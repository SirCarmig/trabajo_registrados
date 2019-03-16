package com.example.tarea.controller;

public class Client {
	private String nombre;
	private String tipo_id;
	private long id;
	private long tel;
	private String dir;
	private String ciudad;
	
	
	public Client(String nombre, String tipo_id, long id, long tel, String dir, String ciudad) {
		super();
		this.nombre = nombre;
		this.tipo_id = tipo_id;
		this.id = id;
		this.tel = tel;
		this.dir = dir;
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Client [nombre=" + nombre + ", tipo_id=" + tipo_id + ", id=" + id + ", tel=" + tel + ", dir=" + dir
				+ ", ciudad=" + ciudad + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo_id() {
		return tipo_id;
	}
	public void setTipo_id(String tipo_id) {
		this.tipo_id = tipo_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}
