package com.softlond.Taller4.services.contracts;

import com.softlond.Taller4.entities.java.Categoria;

public interface ICategoriaService {
    public ResponseEntity<Categoria> create(Categoria category);
    public ResponseEntity<Categoria> update(Categoria categoria);
    public ResponseEntity<Boolean> delete(Long id);
}
