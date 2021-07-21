package br.com.paineluser.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paineluser.models.Usuarios;
import br.com.paineluser.repository.UsuariosRepository;

@RestController
@RequestMapping ("/usuarios")
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository _usuariosRepository;
	
	@GetMapping
	public List<Usuarios> obterTodos(){
		return this._usuariosRepository.findAll();
	}
	
	@GetMapping(value="/{nome}")
	public Optional<Usuarios> obter(@PathVariable(value = "nome") String nome) {
		return this._usuariosRepository.findById(nome);
	}
	
	/*@GetMapping(value="/{id}")
	public Optional<Usuarios> obter(@PathVariable(value = "id") Long id) {
		return this._usuariosRepository.findById(id);
	}*/
	
	@PostMapping
	public ResponseEntity<Usuarios> adicionar(@RequestBody Usuarios usuarios) {
		return new ResponseEntity<Usuarios>(_usuariosRepository.save(usuarios), HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}")
	public Usuarios atualizar(@PathVariable(value = "id") Long id, @RequestBody Usuarios usuarios) {
		usuarios.setId(id);
		return this._usuariosRepository.save(usuarios);
	}

	@DeleteMapping(value = "/{id}")
	public void apagar(@PathVariable(value = "id") Long id) {
		this._usuariosRepository.deleteById(id);
	}
}
