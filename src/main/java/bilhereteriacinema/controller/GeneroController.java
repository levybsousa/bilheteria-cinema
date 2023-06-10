package bilhereteriacinema.controller;

import org.springframework.web.bind.annotation.*;


@RequestMapping("/generos")
@RestController
public class GeneroController {

    @GetMapping
    public List<Genero> getAll() {
        return null;
    }

    @GetMapping("{/id}")
    public Genero getById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public Genero save(@RequestBody Genero genero) {
        return null;
    }

    @PutMapping("{/id}")
    public Genero update(@PathVariable Long id, @RequestBody Genero genero) {
        return null /
    }

    @DeleteMapping("/{id}")
    public Genero delete(@PathVariable Long id) {
        return null;
    }
}
