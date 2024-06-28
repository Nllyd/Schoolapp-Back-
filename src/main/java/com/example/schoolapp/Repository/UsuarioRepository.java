package com.example.schoolapp.Repository;

import com.example.schoolapp.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNumero(Integer numero);
}