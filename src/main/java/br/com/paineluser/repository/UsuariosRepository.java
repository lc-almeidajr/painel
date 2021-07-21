package br.com.paineluser.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paineluser.models.Usuarios;


public interface UsuariosRepository extends JpaRepository<Usuarios, Long>{
    Optional<Usuarios> findById(String nome);
}
