package com.plantsmtl.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_sensor")
public class Sensor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double soilMoisture;
    private Double airHumidity;
    private Double luminosity;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant infoDate;
    private String version;
    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;

    public Sensor(){};

    public Sensor(Long id, Double soilMoisture, Double airHumidity, Double luminosity, Instant infoDate, String version, Plant plant) {
        this.id = id;
        this.soilMoisture = soilMoisture;
        this.airHumidity = airHumidity;
        this.luminosity = luminosity;
        this.infoDate = infoDate;
        this.version = version;
        this.plant = plant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(Double soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public Double getAirHumidity() {
        return airHumidity;
    }

    public void setAirHumidity(Double airHumidity) {
        this.airHumidity = airHumidity;
    }

    public Double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(Double luminosity) {
        this.luminosity = luminosity;
    }

    public Instant getInfoDate() {
        return infoDate;
    }

    public void setInfoDate(Instant infoDate) {
        this.infoDate = infoDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sensor)) return false;
        Sensor sensor = (Sensor) o;
        return Objects.equals(getId(), sensor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
