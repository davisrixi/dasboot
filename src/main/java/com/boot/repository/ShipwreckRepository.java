package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by davis on 3/25/16.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck,Long> {

}
