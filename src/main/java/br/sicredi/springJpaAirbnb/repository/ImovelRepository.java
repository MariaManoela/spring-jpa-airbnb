package br.sicredi.springJpaAirbnb.repository;

import br.sicredi.springJpaAirbnb.domain.Imovel;
import br.sicredi.springJpaAirbnb.domain.TiposImovel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ImovelRepository extends CrudRepository<Imovel, Long> {
    List<Imovel> findByTipo(TiposImovel tipo);
}
