package br.com.fatecararas.f290_dsm_cambio_ms.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Configuration {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    
}
