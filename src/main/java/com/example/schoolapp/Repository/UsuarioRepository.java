package com.example.schoolapp.Repository;

import com.example.schoolapp.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNumero(Integer numero);
    List<Usuario> findByCursos_Id(Long cursoId);
}
