package br.sicredi.springJpaAirbnb.service;

import br.sicredi.springJpaAirbnb.domain.Imovel;
import br.sicredi.springJpaAirbnb.domain.TiposImovel;
import br.sicredi.springJpaAirbnb.repository.ImovelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ImovelService {
    @Autowired
    ImovelRepository imovelRepository;

    public List<Imovel> findAll() {
        return (List<Imovel>) imovelRepository.findAll();
    }

    public List<Imovel> findByTipo(TiposImovel tipo) {
        return imovelRepository.findByTipo(tipo);
    }

    public void save(Imovel imovel) {
        imovelRepository.save(imovel);
    }
}
