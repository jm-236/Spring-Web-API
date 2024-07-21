package dio.my_first_web_api.Controller;

import dio.my_first_web_api.model.Usuario;
import dio.my_first_web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    @ResponseBody
    public List<Usuario> getUsers() {
        return repository.listAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Usuario getOne(@PathVariable("id") Integer id) {
        return repository.finById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id) {
        repository.remove(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Object> postUser(@RequestBody Usuario user) {
        repository.save(user);
        return ResponseEntity.ok().build();
    }
}
