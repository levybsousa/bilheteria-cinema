package bilhereteriacinema.controller;

import bilhereteriacinema.model.entity.Produtora;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produtoras")
@RequiredArgsConstructor
@RestController
public class ProdutoraController {
    @GetMapping
    public List<Produtora> getAll() {
        return null;
    }
    @GetMapping
    public Produtora getById(){
        return null;
    }
    @PostMapping
    public Produtora save(){
        return null;
    }
    @PutMapping
    public Produtora update(){
        return null;
    }
    @DeleteMapping
    public void delete(){

    }
}
