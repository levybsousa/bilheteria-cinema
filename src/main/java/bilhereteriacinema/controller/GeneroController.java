package bilhereteriacinema.controller;

import bilhereteriacinema.model.entity.Genero;
import bilhereteriacinema.service.GeneroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/generos")
@RestController
@RequiredArgsConstructor
public class GeneroController {

    private final GeneroService generoService;

    @GetMapping
    public List<Genero> getAll() {
        return generoService.getAll();
    }

    @GetMapping("{/id}")
    public Genero getById(@PathVariable Long id) {
        return generoService.getById(id);
    }

    @PostMapping
    public Genero save(@RequestBody Genero genero) {
        return generoService.save(genero);
    }

    @PutMapping("{/id}")
    public Genero update(@PathVariable Long id, @RequestBody Genero genero) {
        return generoService.update(id, genero);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        generoService.delete(id);
    }
}
