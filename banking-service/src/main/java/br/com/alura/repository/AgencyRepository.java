package br.com.alura.repository;

import br.com.alura.domain.Agency;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class AgencyRepository implements PanacheRepository<Agency> {
}
