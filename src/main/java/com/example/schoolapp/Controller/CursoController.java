package com.example.schoolapp.Controller;

import com.example.schoolapp.Model.Curso;
import com.example.schoolapp.Model.Usuario;
import com.example.schoolapp.Service.CursoService;
import com.example.schoolapp.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@CrossOrigin(origins = "http://localhost:3000")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Curso> findAll() {
        return cursoService.findAll();
    }

    @PostMapping
    public Curso save(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @GetMapping("/{cursoId}/teachers")
    public List<Usuario> getTeachersByCourse(@PathVariable Long cursoId) {
        return usuarioService.findTeachersByCourse(cursoId);
    }
}
