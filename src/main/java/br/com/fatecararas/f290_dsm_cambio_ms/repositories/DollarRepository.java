package br.com.fatecararas.f290_dsm_cambio_ms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.fatecararas.f290_dsm_cambio_ms.domain.entities.USD;

@Repository
public interface DollarRepository extends JpaRepository<USD, Long>{
    
    @Query("SELECT u FROM USD u WHERE u.date = (SELECT MAX(u.date) FROM USD u)")
    USD findLatest();
}
