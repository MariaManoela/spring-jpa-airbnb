package br.sicredi.springJpaAirbnb.controller;

import br.sicredi.springJpaAirbnb.domain.Imovel;
import br.sicredi.springJpaAirbnb.domain.TiposImovel;
import br.sicredi.springJpaAirbnb.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    ImovelService imovelService;

    @GetMapping
    public List<Imovel> findAll() {
        return imovelService.findAll();
    }

    @GetMapping("/tipo")
    public List<Imovel> findByType(@RequestParam TiposImovel tipo) {
        return imovelService.findByType(tipo);
    }

    @PostMapping
    public void cadastraImovel(@RequestBody Imovel imovel) {
        imovelService.save(imovel);
    }
}
