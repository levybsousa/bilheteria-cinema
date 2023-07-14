package bilhereteriacinema.controller;

import bilhereteriacinema.model.entity.Produtora;
import bilhereteriacinema.service.ProdutoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produtoras")
@RequiredArgsConstructor
@RestController
public class ProdutoraController {

    private final ProdutoraService produtoraService;

    @GetMapping
    public List<Produtora> getAll() {
        return produtoraService.getAll();
    }

    @GetMapping("/{id}")
    public Produtora getById(@PathVariable Long id) {
        return produtoraService.getById(id);
    }

    @PostMapping
    public Produtora save(@RequestBody Produtora produtora) {
        return produtoraService.save(produtora);
    }

    @PutMapping("/{id}")
    public Produtora update(@PathVariable Long id, @RequestBody Produtora produtora) {
        return produtoraService.update(id, produtora);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produtoraService.delete(id);
    }
}
