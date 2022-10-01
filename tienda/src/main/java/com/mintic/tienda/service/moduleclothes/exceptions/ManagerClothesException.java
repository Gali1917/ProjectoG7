package com.mintic.tienda.service.moduleclothes.exceptions;

public class ManagerClothesException  extends Exception{

    public static final String PRENDA_NULL = "No se está enviando prenda para guardar, objeto nulo";
    public static final String IDPRENDA_NULL = "id nulo, se necesita id para buscar una prenda";

    public ManagerClothesException() {
		super();
	}
	
	public ManagerClothesException(String message) {
		super(message);
	}
    
}
