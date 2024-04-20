package co.com.ps.C22JA.service;

import co.com.ps.C22JA.entity.Usuario;
import co.com.ps.C22JA.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService implements IUsuarioService {


    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuario(Long id) {
        return usuarioRepository.getReferenceById(id);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario saveUsuario(Usuario Usuario) {
        return usuarioRepository.save(Usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario Usuario) {
        Usuario p=  usuarioRepository.getReferenceById(Usuario.getId());
        p.setNombre(Usuario.getNombre());
        p.setEmail(Usuario.getEmail());
        p.setTelefono(Usuario.getTelefono());


        if (p==null){
            return null;
        } else{
            return usuarioRepository.save(Usuario);
        }

    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}