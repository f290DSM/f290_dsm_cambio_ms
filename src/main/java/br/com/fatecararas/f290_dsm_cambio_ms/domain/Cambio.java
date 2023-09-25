package br.com.fatecararas.f290_dsm_cambio_ms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cambio {
    private String from = "BRL";
    private String to = "USD";
    private Double factor;
    private Double value;
}
