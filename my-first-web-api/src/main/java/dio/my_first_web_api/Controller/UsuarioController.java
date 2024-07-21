package dio.my_first_web_api.Controller;

import dio.my_first_web_api.model.Usuario;
import dio.my_first_web_api.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "User API", description = "APIs related to User operations")
@Controller
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UserRepository repository;

    @Operation(summary = "Get all users", description = "Fetch all users from the system")
    @GetMapping
    @ResponseBody
    public List<Usuario> getUsers() {
        return repository.listAll();
    }

    @Operation(summary = "Get a user by ID", description = "Fetch a user by its ID")
    @GetMapping("/{id}")
    @ResponseBody
    public Usuario getOne(@PathVariable("id") Integer id) {
        return repository.finById(id);
    }

    @Operation(summary = "Delete a user", description = "Delete a user by its ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id) {
        repository.remove(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Create a user", description = "Create a new user")
    @PostMapping
    public ResponseEntity<Object> postUser(@RequestBody Usuario user) {
        repository.save(user);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update a user", description = "Update data from an existing user")
    @PutMapping
    public ResponseEntity<Object> putUser(@RequestBody Usuario user) {
        repository.save(user);
        return ResponseEntity.ok().build();
    }
}
