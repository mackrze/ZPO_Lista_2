package com.company;

import java.time.LocalDate;

public class HealthProfile {
    private String imieNazwisko;
    private String plec;
    private LocalDate dataUrodzenia;
    private int wzrost;
    private int waga;

    public String getImieNazwisko() {
        return imieNazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public int getWzrost() {
        return wzrost;
    }

    public int getWaga() {
        return waga;
    }

    public void setImieNazwisko(String imieNazwisko) {
        this.imieNazwisko = imieNazwisko;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public HealthProfile(String imieNazwisko, String plec, LocalDate dataUrodzenia, int wzrost, int waga) {
        this.imieNazwisko = imieNazwisko;
        this.plec = plec;
        this.dataUrodzenia = dataUrodzenia;
        this.wzrost = wzrost;
        this.waga = waga;
    }
    private    int wiek(){
        LocalDate terazniejszosc= LocalDate.now();
        int wiek = terazniejszosc.getYear()-dataUrodzenia.getYear();
        return wiek;
    }
    private float bmi (int waga,int wzrost){
        float bmi = (float)waga/(float)(Math.pow(wzrost,2));
        bmi=bmi/10000;
        return bmi;
    }
    private float tentnoMax(){
        int wiek=wiek();
        float tentnoMax=220-wiek;
        return  tentnoMax;
    }
    private float tentnoSrednie(){
        float tenntoMax=tentnoMax();
        float tentnoSrednie=(float)(tenntoMax*0.6);
        return  tentnoSrednie;
    }
    public void wyswietlProfil(){
        System.out.println(imieNazwisko);
        System.out.println(plec);
        System.out.println();
    }


}
