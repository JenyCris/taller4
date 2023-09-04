package com.softlond.Taller4.services.contracts;

import com.softlond.Taller4.entities.java.Cliente;

public interface IClienteService {
    public ResponseEntity<List<Cliente>> findAll();
    public ResponseEntity<Cliente> create(Cliente cliente);
    public ResponseEntity<Cliente> update(Cliente cliente);
    public ResponseEntity<Boolean> delete(Long id);
}
