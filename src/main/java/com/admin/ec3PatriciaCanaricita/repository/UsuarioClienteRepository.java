package com.admin.ec3PatriciaCanaricita.repository;

import com.admin.ec3PatriciaCanaricita.model.UsuarioCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {
    UsuarioCliente findByUsuario(String usuario);
}
