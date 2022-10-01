package com.mintic.tienda.moduleclothes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.spy;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.mintic.tienda.entity.Prenda;
import com.mintic.tienda.mapper.impl.PrendaMapperImpl;
import com.mintic.tienda.repository.IPrendaRepo;
import com.mintic.tienda.service.DTO.PrendaDTO;
import com.mintic.tienda.service.moduleclothes.impl.ManageClothesServiceImpl;

public class ManageClothesDomainImplTest {
    

    public static final String PRENDA_NULL = "No se esta enviando prenda para guardar, objeto nulo";
    public static final String IDPRENDA_NULL = "id nulo, se necesita id para buscar una prenda";

    IPrendaRepo prendaRepo;
    PrendaMapperImpl prendaMapper;
    

    @BeforeEach
	private void initSavePrenda() {
        prendaMapper = spy(PrendaMapperImpl.class);
        prendaRepo = spy(IPrendaRepo.class);
	}

    @Nested
    class validateCRUD {
    

        @Test
        @DisplayName("Valida que covierta una entiedad en un DTO")
	    void validConvertDTOToEntity() throws Exception {
	
            //Given
	    	PrendaDTO prendaDTO = new PrendaDTO();
            prendaDTO.setId(1L);
            prendaDTO.setNombre("Camisa");
            prendaDTO.setTalla("M");
            prendaDTO.setTipoPrenda("Superior");
            prendaDTO.setGenero("Masculino");
            prendaDTO.setPrecio(29000L);
            prendaDTO.setMarca("Nike");
            prendaDTO.setDetalle("Camisa en algodon para relajarse un domingo");
            prendaDTO.setCantidad(14);
            prendaDTO.setImagen("No disponible");

            Prenda prenda = new Prenda();
            prenda.setId(1L);
            prenda.setNombre("Camisa");
            prenda.setTalla("M");
            prenda.setTipoPrenda("Superior");
            prenda.setGenero("Masculino");
            prenda.setPrecio(29000L);
            prenda.setMarca("Nike");
            prenda.setDetalle("Camisa en algodon para relajarse un domingo");
            prenda.setCantidad(14);
            prenda.setImagen("No disponible");


            Prenda expected = prendaMapper.dTOToEntity(prendaDTO);


            //Then
	        assertEquals(expected, prenda);
	    }

        @Test
        @DisplayName("Valida que se genere excepción al mandar un Null como objeto PrendaDTO")
	    void validErrorAtSavePrenda() {
	
            //Given
            ManageClothesServiceImpl manageClothesServiceImpl = new ManageClothesServiceImpl(prendaRepo);

            // When
			final Exception exception = assertThrows(Exception.class,
            () -> manageClothesServiceImpl.savePrenda(null));

            // Then
            assertEquals(PRENDA_NULL, exception.getMessage());
        }

        @Test
        @DisplayName("Valida que se genere excepción al no mandar id para buscar una prenda")
	    void validErrorAtGetOnePrenda() {
	
            //Given
            ManageClothesServiceImpl manageClothesServiceImpl = new ManageClothesServiceImpl(prendaRepo);            

            // When
			final Exception exception = assertThrows(Exception.class,
            () -> manageClothesServiceImpl.getOnePrenda(null));

            // Then
            assertEquals(IDPRENDA_NULL, exception.getMessage());
        }
    }
}
