package com.softlond.Taller4.services.contracts;

import com.softlond.Taller4.entities.java.Categoria;
import com.softlond.Taller4.entities.java.Producto;

public interface IProductService {
    public ResponseEntity<List<Producto> findAll();
    public ResponseEntity<Producto> create(Producto producto);
    public ResponseEntity<Producto> update(Producto producto);
    public ResponseEntity<Boolean> delete(Long id);
}
