package br.com.fatecararas.f290_dsm_cambio_ms.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecararas.f290_dsm_cambio_ms.domain.Cambio;
import br.com.fatecararas.f290_dsm_cambio_ms.domain.entities.USD;
import br.com.fatecararas.f290_dsm_cambio_ms.repositories.DollarRepository;

@RestController
@RequestMapping("/cambio-service")
public class DollarResource {

    @Autowired
    private DollarRepository repository;

    @GetMapping("/{value}/BRL/USD")
    public Cambio getCambio(@PathVariable("value") Double value) {
        USD dollar = repository.findLatest();

        var cambio = new Cambio();
        cambio.setFactor(1 / dollar.getBuy());
        cambio.setValue(value * cambio.getFactor());

        return cambio;
    }
}
