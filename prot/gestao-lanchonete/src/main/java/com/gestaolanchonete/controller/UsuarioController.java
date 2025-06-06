package com.gestaolanchonete.controller;

import com.gestaolanchonete.DAO.IUsuario;
import com.gestaolanchonete.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuario dao;

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) dao.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return dao.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable int id, @RequestBody Usuario usuarioAtualizado) {
        Optional<Usuario> optionalUsuario = dao.findById(id);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setCargo(usuarioAtualizado.getCargo());
            usuario.setLogin(usuarioAtualizado.getLogin());
            usuario.setSenha(usuarioAtualizado.getSenha());
            return dao.save(usuario);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable int id) {
        dao.deleteById(id);
    }
}
