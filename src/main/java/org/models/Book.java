package org.models;

public class Book {
    private int id;
    private final String titulo;
    private final String publisher;
    private final int yearLaunch;
    private Availability availability;

    public Book(String titulo, String publisher, int yearLaunch){
        this.titulo = titulo;
        this.publisher = publisher;
        this.yearLaunch = yearLaunch;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearLaunch() {
        return yearLaunch;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Availability getAvailability() {
        return availability;
    }
}
