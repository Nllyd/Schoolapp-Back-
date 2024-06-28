package com.example.schoolapp.Controller;

import com.example.schoolapp.DTO.UsuarioDTO;
import com.example.schoolapp.Model.Usuario;
import com.example.schoolapp.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/register")
    public Usuario register(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.register(usuarioDTO);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario loginRequest) {
        Usuario usuario = usuarioService.login(loginRequest.getNumero(), loginRequest.getContrasena());
        if (usuario == null) {
            throw new RuntimeException("Usuario o contraseña incorrectos");
        }
        return usuario;
    }
}
