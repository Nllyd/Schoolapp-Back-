package com.example.schoolapp.DTO;

import java.util.List;

public class UsuarioDTO {
    private String nombre;
    private Integer numero;
    private String contrasena;
    private String fotodeperfil;
    private String tipo;
    private List<Long> cursos; // Lista de IDs de cursos

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFotodeperfil() {
        return fotodeperfil;
    }

    public void setFotodeperfil(String fotodeperfil) {
        this.fotodeperfil = fotodeperfil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Long> getCursos() {
        return cursos;
    }

    public void setCursos(List<Long> cursos) {
        this.cursos = cursos;
    }
}