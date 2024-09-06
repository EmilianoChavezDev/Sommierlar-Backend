package com.sommierlar.sommierlarbackend.repository;

import com.sommierlar.sommierlarbackend.entity.cliente.ClienteEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    Optional<ClienteEntity> findById(Long id);

    Page<ClienteEntity> findAllByDeleted(boolean deleted, Pageable pageable);

    @Query(value = "SELECT * FROM CLIENTES WHERE CLIENTES.ID = ?1 AND CLIENTES.DELETED = ?2", nativeQuery = true)
    Optional<ClienteEntity> findByIdAndDelete(Long id, boolean estado);
}
