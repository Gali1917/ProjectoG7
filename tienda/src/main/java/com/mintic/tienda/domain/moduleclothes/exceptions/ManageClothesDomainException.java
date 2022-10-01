package com.mintic.tienda.domain.moduleclothes.exceptions;

public class ManageClothesDomainException  extends Exception {
    

    public static final String MINIMUM_PRICE_MESSAGE = "El precio minimo de una prenda debe ser mayor o igual a 1.000";
    public static final String MESSAGE_MINIMUM_QUANTITY = "La cantidad minima de prendas a guardar debe ser mayor o igual a 10";
    public static final String TYPE_OF_CLOTHING_IS_NECESSARY = "Se debe asignar un tipo a la ropa para poder categorizarla";
    

    public ManageClothesDomainException() {
		super();
	}
	
	public ManageClothesDomainException(String message) {
		super(message);
	}
}
