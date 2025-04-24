package com.accesadades.botiga.Service;

import java.util.List;
import java.util.Optional;

public interface BotigaService<T, ID> {
    List<T> findAll();
    Optional<T> findById(ID id);
    void save(T dto);
    void deleteById(ID id);
}
