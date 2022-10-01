package com.mintic.tienda.domain.moduleclothes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.mintic.tienda.domain.moduleclothes.impl.ManageClothesDomainImpl;
import com.mintic.tienda.service.DTO.PrendaDTO;

public class ManageClothesDomainImplTest {

    public static final String MINIMUM_PRICE_MESSAGE = "El precio minimo de una prenda debe ser mayor o igual a 1.000";
    public static final String MESSAGE_MINIMUM_QUANTITY = "La cantidad minima de prendas a guardar debe ser mayor o igual a 10";
    public static final String TYPE_OF_CLOTHING_IS_NECESSARY = "Se debe asignar un tipo a la ropa para poder categorizarla";

    ManageClothesDomainImpl manageClothesDomainImpl = new ManageClothesDomainImpl();

    @Nested
    class validates {

        @Test
        @DisplayName("Genera excepción si el precio de la prenda es menor a 1.000")
        void validPrice() throws Exception {

            // Given
            PrendaDTO prendaDTO = new PrendaDTO();
            prendaDTO.setId(1L);
            prendaDTO.setNombre("Camisa");
            prendaDTO.setTalla("M");
            prendaDTO.setTipoPrenda("Superior");
            prendaDTO.setGenero("Masculino");
            prendaDTO.setPrecio(900L);
            prendaDTO.setMarca("Nike");
            prendaDTO.setDetalle("Camisa en algodon para relajarse un domingo");
            prendaDTO.setCantidad(14);
            prendaDTO.setImagen("No disponible");

            // When
            final Exception exception = assertThrows(Exception.class,
                    () -> manageClothesDomainImpl.validatePrenda(prendaDTO));

            // Then
            assertEquals(MINIMUM_PRICE_MESSAGE, exception.getMessage());
        }

        @Test
        @DisplayName("Genera excepción si la cantidad es menor a 10")
        void validQuantity() throws Exception {

            // Given
            PrendaDTO prendaDTO = new PrendaDTO();
            prendaDTO.setId(1L);
            prendaDTO.setNombre("Camisa");
            prendaDTO.setTalla("M");
            prendaDTO.setTipoPrenda("Superior");
            prendaDTO.setGenero("Masculino");
            prendaDTO.setPrecio(1000L);
            prendaDTO.setMarca("Nike");
            prendaDTO.setDetalle("Camisa en algodon para relajarse un domingo");
            prendaDTO.setCantidad(9);
            prendaDTO.setImagen("No disponible");

            // When
            final Exception exception = assertThrows(Exception.class,
                    () -> manageClothesDomainImpl.validatePrenda(prendaDTO));

            // Then
            assertEquals(MESSAGE_MINIMUM_QUANTITY, exception.getMessage());
        }

        @Test
        @DisplayName("Genera excepción si el tipo de prenda es vacio o nulo")
        void validType() throws Exception {

            // Given
            PrendaDTO prendaDTO = new PrendaDTO();
            prendaDTO.setId(1L);
            prendaDTO.setNombre("Camisa");
            prendaDTO.setTalla("M");
            prendaDTO.setTipoPrenda("");
            prendaDTO.setGenero("Masculino");
            prendaDTO.setPrecio(1000L);
            prendaDTO.setMarca("Nike");
            prendaDTO.setDetalle("Camisa en algodon para relajarse un domingo");
            prendaDTO.setCantidad(10);
            prendaDTO.setImagen("No disponible");

            // When
            final Exception exception = assertThrows(Exception.class,
                    () -> manageClothesDomainImpl.validatePrenda(prendaDTO));

            // Then
            assertEquals(TYPE_OF_CLOTHING_IS_NECESSARY, exception.getMessage());
        }
    }
}
