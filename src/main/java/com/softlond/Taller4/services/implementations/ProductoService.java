package com.softlond.Taller4.services.implementations;

import com.softlond.Taller4.repositories.java.contracts.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    private IProductoRepository productoRepository;
}
