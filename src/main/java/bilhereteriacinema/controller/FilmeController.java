package bilhereteriacinema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Filmes")
public class FilmeController {
    @GetMapping(value = " /{nome}")
    public String nome(@PathVariable("nome") String nome) {
        return "Filme" + nome;
    }
}
