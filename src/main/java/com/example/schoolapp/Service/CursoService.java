package com.example.schoolapp.Service;

import com.example.schoolapp.Model.Curso;
import com.example.schoolapp.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }
}
