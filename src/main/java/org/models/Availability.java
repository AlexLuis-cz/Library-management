package org.models;

public enum Availability {
    AVAILABLE(true,"Available"),
    UNAVAILABLE(false,"Unavailable");

    private boolean available;
    private final String availableName;

    Availability(boolean available, String availableName) {
        this.available = available;
        this.availableName = availableName;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getAvailableName() {
        return availableName;
    }
}
