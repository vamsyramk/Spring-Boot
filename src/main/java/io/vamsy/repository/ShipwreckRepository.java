package io.vamsy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.vamsy.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
