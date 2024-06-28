//package com.example.schoolapp.Service.Implements;
//
//import com.example.schoolapp.Model.Usuario;
//import com.example.schoolapp.Repository.UsuarioRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private UsuarioRepository usuarioRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String numero) throws UsernameNotFoundException {
//        Usuario usuario = usuarioRepository.findByNumero(Integer.parseInt(numero));
//        if (usuario == null) {
//            throw new UsernameNotFoundException("User not found with numero: " + numero);
//        }
//        return new org.springframework.security.core.userdetails.User(usuario.getNumero().toString(), usuario.getContrasena(), new ArrayList<>());
//    }
//}
