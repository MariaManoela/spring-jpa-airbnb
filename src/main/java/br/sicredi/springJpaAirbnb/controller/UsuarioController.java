package br.sicredi.springJpaAirbnb.controller;

import br.sicredi.springJpaAirbnb.domain.Usuario;
import br.sicredi.springJpaAirbnb.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;

    @GetMapping
    public List findAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Optional findById(@PathVariable("id") Long id) {
        return usuarioService.findById(id);
    }

    @PostMapping
    public void cadastraUsuario(@RequestBody Usuario usuario) {
        usuarioService.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        usuarioService.deleteById(id);
    }
}
