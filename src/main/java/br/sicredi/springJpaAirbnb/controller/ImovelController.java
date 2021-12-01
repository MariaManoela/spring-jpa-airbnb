package br.sicredi.springJpaAirbnb.controller;

import br.sicredi.springJpaAirbnb.domain.Imovel;
import br.sicredi.springJpaAirbnb.domain.TiposImovel;
import br.sicredi.springJpaAirbnb.domain.Usuario;
import br.sicredi.springJpaAirbnb.service.ImovelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    @Autowired
    private final ImovelService imovelService;

    @GetMapping
    public List<Imovel> findAll() {
        return imovelService.findAll();
    }

    @GetMapping("/{tipo}")
    public List<Imovel> findByType(@PathVariable TiposImovel tipo) {
        return imovelService.findByType(tipo);
    }

    @PostMapping
    public void cadastraImovel(@RequestBody Imovel imovel) {
        imovelService.save(imovel);
    }
}
