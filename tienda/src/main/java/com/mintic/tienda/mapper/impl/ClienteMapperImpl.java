package com.mintic.tienda.mapper.impl;

import org.springframework.stereotype.Component;

import com.mintic.tienda.entity.Cliente;
import com.mintic.tienda.mapper.IClienteMapper;
import com.mintic.tienda.service.DTO.ClienteDTO;


@Component
public class ClienteMapperImpl implements IClienteMapper {

    @Override
    public Cliente dTOToEntity(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(dto.getIdCliente());
        cliente.setNombre(dto.getNombre());
        return cliente;
    }

    @Override
    public ClienteDTO entityToDTO(Cliente entity) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setIdCliente(entity.getIdCliente());
        clienteDTO.setNombre(entity.getNombre());
        return clienteDTO;
    }

    
}
