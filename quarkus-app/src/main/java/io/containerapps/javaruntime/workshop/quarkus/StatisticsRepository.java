package io.containerapps.javaruntime.workshop.quarkus;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
@Transactional
public class StatisticsRepository implements PanacheRepository<Statistics> {
}
