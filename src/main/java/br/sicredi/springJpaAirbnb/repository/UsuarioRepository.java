package br.sicredi.springJpaAirbnb.repository;

import br.sicredi.springJpaAirbnb.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findById(@Param("id")Long id);
}
