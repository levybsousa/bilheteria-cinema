package bilhereteriacinema.controller;

import bilhereteriacinema.model.dto.Filme;
import bilhereteriacinema.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/Filme") //PADRÃO DE API É MINÚSCULO e plural!
@Log4j2 //REMOVER LOG4J2
// ADICIONAR REQUIREDARGSCONSTRUCTOR
public class FilmeController {
    @Autowired
    private DateUtil dateUtil;

    @GetMapping(path = "list") //remover list
    public List<Filme> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Filme("007", "1"), new Filme("Rei leão", "2"));
    }

    @PostMapping
    public void incluir(@RequestBody Filme filme) {
        filme.save(filme);
    }

    @PutMapping
    public void alterar(@RequestBody Filme filme) {
        filme.save(filme);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
//        filme.deleteById(id);
    }

//    @GetMapping("/{id}") //Descomentar
//    public Filme ler(@PathVariable Long id) {
//      return //filme.findById(id);
//    }

}

