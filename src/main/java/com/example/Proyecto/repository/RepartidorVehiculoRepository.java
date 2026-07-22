package com.example.Proyecto.repository;

import com.example.Proyecto.entity.RepartidorVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepartidorVehiculoRepository extends JpaRepository<RepartidorVehiculo, Integer> {

    Optional<RepartidorVehiculo> findByRepartidorIdRepartidorAndEstadoAsignacion(
            Integer idRepartidor, String estadoAsignacion);

}