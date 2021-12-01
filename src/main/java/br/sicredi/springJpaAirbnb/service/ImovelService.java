package br.sicredi.springJpaAirbnb.service;

import br.sicredi.springJpaAirbnb.domain.Imovel;
import br.sicredi.springJpaAirbnb.domain.TiposImovel;
import br.sicredi.springJpaAirbnb.repository.ImovelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ImovelService {
    @Autowired
    private final ImovelRepository imovelRepository;

    public List<Imovel> findAll() {
        return imovelRepository.findAll();
    }

    public List<Imovel> findByType(TiposImovel tipo) {
        return imovelRepository.findByType(tipo);
    }

    public void save(Imovel imovel) {
        imovelRepository.save(imovel);
    }
}
