package com.mintic.tienda.mapper;

public interface IObjectMapper<E,D> {
    
    E dTOToEntity(D dto);

    D entityToDTO(E entity);

}
