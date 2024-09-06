package com.sommierlar.sommierlarbackend.repository;

import com.sommierlar.sommierlarbackend.entity.cliente.clienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.Optional;

public interface clienteRepository extends JpaRepository<clienteEntity, Long> {


    public Optional<clienteEntity> findById(final Long id);

    public Optional<clienteEntity> findAllByIdNotDelete(final boolean deleted, final Pageable pageable);

    @Query(value = "SELECT * FROM CLIENTES WHERE CLIENTES.ID =? AND CLIENTES.DELETED =?", nativeQuery = true)
    public Optional<clienteEntity> findByIdAndDelete(final Long id, final boolean deleted);
}
