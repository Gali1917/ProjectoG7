package com.mintic.tienda.service.moduleclothes.exceptions;

public class ManagerClothesServiceException  extends Exception{

    public static final String PRENDA_NULL = "No se está enviando prenda para guardar, objeto nulo";
    public static final String IDPRENDA_NULL = "id nulo, se necesita id para buscar una prenda";

    public ManagerClothesServiceException() {
		super();
	}
	
	public ManagerClothesServiceException(String message) {
		super(message);
	}
    
}
