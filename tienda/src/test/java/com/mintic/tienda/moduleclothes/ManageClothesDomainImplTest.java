package com.mintic.tienda.moduleclothes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.mintic.tienda.domain.moduleclothes.impl.ManageClothesDomainImpl;
import com.mintic.tienda.service.DTO.PrendaDTO;

public class ManageClothesDomainImplTest {
    

    @Nested
    class validateGetDoubleup {
    
	    @Test
        @DisplayName("Valida que al guardar una prenda, se haga correctamente")
	    void validSaveSuccessfully() {
	
            //Given
            ManageClothesDomainImpl manageClothesDomainImpl = new ManageClothesDomainImpl();

	    	PrendaDTO expectedPrendaDTO = new PrendaDTO();
            expectedPrendaDTO.setNombre("Camisa");
            expectedPrendaDTO.setTalla("M");
            expectedPrendaDTO.setTipoPrenda("Superior");
            expectedPrendaDTO.setGenero("Masculino");
            expectedPrendaDTO.setPrecio(29000L);
            expectedPrendaDTO.setMarca("Nike");
            expectedPrendaDTO.setDetalle("Camisa en algodon para relajarse un domingo");
            expectedPrendaDTO.setCantidad(14);
            expectedPrendaDTO.setImagen("No disponible");

            //When
            PrendaDTO prendaDTO = manageClothesDomainImpl.savePrenda(expectedPrendaDTO);

            //Then
	        assertEquals(expectedPrendaDTO, prendaDTO);
	    }
    }
}
