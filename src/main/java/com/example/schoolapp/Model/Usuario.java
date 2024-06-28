package com.example.schoolapp.Model;

import com.example.schoolapp.Model.Curso;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer numero;
    private String contrasena;
    private String fotodeperfil;
    private String tipo;

    @ManyToMany
    @JoinTable(
            name = "usuario_curso",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private List<Curso> cursos;

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFotodeperfil() {
        return fotodeperfil;
    }

    public void setFotodeperfil(String fotodeperfil) {
        this.fotodeperfil = fotodeperfil;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario(Long id, String nombre, Integer numero, String contrasena, String fotodeperfil, String tipo, List<Curso> cursos) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
        this.contrasena = contrasena;
        this.fotodeperfil = fotodeperfil;
        this.tipo = tipo;
        this.cursos = cursos;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", contrasena='" + contrasena + '\'' +
                ", fotodeperfil='" + fotodeperfil + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}
