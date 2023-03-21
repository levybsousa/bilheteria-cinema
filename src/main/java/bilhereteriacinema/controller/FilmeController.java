package bilhereteriacinema.controller;

import bilhereteriacinema.model.dto.Filme;
import bilhereteriacinema.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("Filme")
@Log4j2
public class FilmeController {
    @Autowired
    private DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Filme> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Filme("007"), new Filme("Rei leão"));
    }
}

