package bilhereteriacinema.controller;


import bilhereteriacinema.model.entity.Filme;
import bilhereteriacinema.service.FilmeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/filmes")
@RestController
@RequiredArgsConstructor
public class FilmeController {

    private final FilmeService filmeService;

    @GetMapping
    public ResponseEntity<List<Filme>> getAll() {
        List<Filme> filmeResponse = filmeService.getAll();
        return ResponseEntity.ok(filmeResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> getById(@PathVariable Long id) {
        Filme filmeResponse = filmeService.getById(id);
        return ResponseEntity.ok(filmeResponse);
    }

    @PostMapping
    public ResponseEntity<Filme> save(@RequestBody Filme filme) {
        Filme filmeResponse = filmeService.save(filme);
        return ResponseEntity.ok(filmeResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> update(@PathVariable Long id, @RequestBody Filme filme) {
        Filme filmeResponse = filmeService.update(id, filme);
        return ResponseEntity.ok(filmeResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        filmeService.delete(id);
        return ResponseEntity.ok().build();
    }

}







