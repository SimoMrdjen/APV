package ucitavanja.obrazaca.psf.obrazac5;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/obrazac5")
@RequiredArgsConstructor
public class Obr5Controller {

    private final IObr5Service service;

    @PostMapping
    public List<Obrazac5DTO> saveAll(@RequestBody List<Obrazac5DTO> dtos) {
        return service.saveAll(dtos);
    }

}
