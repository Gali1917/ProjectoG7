package com.mintic.tienda.moduleclothes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.mintic.tienda.domain.moduleclothes.impl.ManageClothesDomainImpl;
import com.mintic.tienda.entity.Prenda;
import com.mintic.tienda.mapper.impl.PrendaMapperImpl;
import com.mintic.tienda.repository.IPrendaRepo;
import com.mintic.tienda.service.DTO.PrendaDTO;
import com.mintic.tienda.service.moduleclothes.impl.ManageClothesServiceImpl;

public class ManageClothesDomainImplTest {
    

    public static final String PRENDA_NULL = "No se está enviando prenda para guardar, objeto nulo";
    public static final String IDPRENDA_NULL = "id nulo, se necesita id para buscar una prenda";

    ManageClothesServiceImpl manageClothesServiceImpl;
    IPrendaRepo prendaRepo;
    PrendaMapperImpl prendaMapper;
    

    @BeforeEach
	private void initSavePrenda() {
		manageClothesServiceImpl = spy(ManageClothesServiceImpl.class);
        prendaMapper = spy(PrendaMapperImpl.class);
	}

    @Nested
    class validateCRUD {

        @Test
        @DisplayName("Valida que se genere excepción al mandar un Null como objeto PrendaDTO")
	    void validErrorAtSavePrenda() {
	
            //Given
            ManageClothesDomainImpl manageClothesDomainImpl = new ManageClothesDomainImpl();

            // When
			final Exception exception = assertThrows(Exception.class,
            () -> manageClothesDomainImpl.savePrenda(null));

            // Then
            assertEquals(PRENDA_NULL, exception.getMessage());
        }

        @Test
        @DisplayName("Valida que se genere excepción al no mandar id para buscar una prenda")
	    void validErrorAtGetOnePrenda() {
	
            //Given
            ManageClothesDomainImpl manageClothesDomainImpl = new ManageClothesDomainImpl();

            // When
			final Exception exception = assertThrows(Exception.class,
            () -> manageClothesDomainImpl.getOnePrenda(null));

            // Then
            assertEquals(IDPRENDA_NULL, exception.getMessage());
        }
    }
}
