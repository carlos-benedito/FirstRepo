package com.example.divisas;

public class DivisasModel {

    public String divisaAbrev;
    public String divisaValor;

    public int eventImage;

    public DivisasModel(String divisaAbrev, String divisaValor, int eventImage) {

        this.divisaAbrev = divisaAbrev;
        this.divisaValor = divisaValor;
        this.eventImage = eventImage;
    }

    public String getDivisaAbrev() {
        return divisaAbrev;
    }

    public String getDivisaValor() {
        return divisaValor;
    }

    public int getEventImage(){
        return eventImage;
    }
}

