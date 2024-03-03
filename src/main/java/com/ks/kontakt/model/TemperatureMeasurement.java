package com.ks.kontakt.model;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;

public class TemperatureMeasurement {
    private double temperature;
    private Instant timestamp;
    private int roomId;
    private int thermometerId;

    private AtomicBoolean isAnomaly;
    public TemperatureMeasurement() {
    }

    public TemperatureMeasurement(double temperature, Instant timestamp, int roomId, int thermometerId) {
        this.temperature = temperature;
        this.timestamp = timestamp;
        this.roomId = roomId;
        this.thermometerId = thermometerId;
        this.isAnomaly = new AtomicBoolean(false);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getThermometerId() {
        return thermometerId;
    }

    public void setThermometerId(int thermometerId) {
        this.thermometerId = thermometerId;
    }

    public AtomicBoolean getIsAnomaly() {
        return isAnomaly;
    }

    public void setIsAnomaly(AtomicBoolean isAnomaly) {
        this.isAnomaly = isAnomaly;
    }
}
