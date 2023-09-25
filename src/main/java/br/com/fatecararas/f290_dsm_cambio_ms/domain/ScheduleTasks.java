package br.com.fatecararas.f290_dsm_cambio_ms.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduleTasks.class);
    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 300000)
    public void getCurrencies() {

        log.info("The time is now {}", format.format(new Date()));
    }
}
