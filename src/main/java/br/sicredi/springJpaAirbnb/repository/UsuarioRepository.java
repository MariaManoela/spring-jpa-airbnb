package br.sicredi.springJpaAirbnb.repository;

import br.sicredi.springJpaAirbnb.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Optional<Usuario> findById(@Param("id")Long id);
}
