package br.com.fatecararas.f290_dsm_cambio_ms.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.fatecararas.f290_dsm_cambio_ms.domain.entities.EUR;
import br.com.fatecararas.f290_dsm_cambio_ms.domain.entities.USD;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DefaultResponse {

    public Results results;

    @Override
    public String toString() {
        return "DefaultResponse [results=" + results + "]";
    }
}

class Results {
    public Currencies currencies;

    @Override
    public String toString() {
        return "Results [currencies=" + currencies + "]";
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Currencies {
    @JsonProperty("USD")
    public USD usd;
    @JsonProperty("EUR")
    public EUR eur;

    @Override
    public String toString() {
        return "Currencies [usd=" + usd + ", eur=" + eur + "]";
    }
}