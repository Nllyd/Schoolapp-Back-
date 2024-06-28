package com.example.schoolapp.Service;

import com.example.schoolapp.DTO.UsuarioDTO;
import com.example.schoolapp.Model.Curso;
import com.example.schoolapp.Model.Usuario;
import com.example.schoolapp.Repository.CursoRepository;
import com.example.schoolapp.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;

    public Usuario register(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setNumero(usuarioDTO.getNumero());
        usuario.setContrasena(usuarioDTO.getContrasena());
        usuario.setFotodeperfil(usuarioDTO.getFotodeperfil());
        usuario.setTipo(usuarioDTO.getTipo());

        if (usuarioDTO.getTipo().equals("maestro") && usuarioDTO.getCursos() != null && !usuarioDTO.getCursos().isEmpty()) {
            List<Curso> cursos = cursoRepository.findAllById(usuarioDTO.getCursos());
            usuario.setCursos(cursos);
        }
        return usuarioRepository.save(usuario);
    }

    public Usuario login(Integer numero, String contrasena) {
        Usuario usuario = usuarioRepository.findByNumero(numero);
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return usuario;
        }
        return null;
    }
}
