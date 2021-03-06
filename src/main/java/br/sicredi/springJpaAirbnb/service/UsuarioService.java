package br.sicredi.springJpaAirbnb.service;

import br.sicredi.springJpaAirbnb.domain.Usuario;
import br.sicredi.springJpaAirbnb.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class UsuarioService {
    @Autowired
    private final UsuarioRepository usuarioRepository;

    public List findAll() {
        return (List) usuarioRepository.findAll();
    }

    public Optional findById(Long id) {
        return usuarioRepository.findById(id);
    }

    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }

    public String validaUsuario(Usuario usuario) {
        if (usuario.equals(usuarioRepository.findAll())){
            return "Não logado!";
        }else{
            return "Logado!";
        }
    }
}
