package com.company;

import java.util.ArrayList;

public class Student {

    int nrAlbumu;
    String imie;
    String nazwisko;
    int wiek;
    String plec;
    ArrayList<Kurs> listaKursow;


    public Student(int nrAlbumu, String nazwisko, String imie, int wiek, String plec){
        this.nrAlbumu = nrAlbumu;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.wiek = wiek;
        this.plec = plec;
        listaKursow = new ArrayList<>();
    }

    public String toString(){
        return nrAlbumu+" "+nazwisko+" "+imie+" "+wiek+" "+plec+" kursow:"+liczbaKursow();
    }

    public void dodajKurs(Kurs k){
        listaKursow.add(k);
    }

    public int liczbaKursow(){
        return listaKursow.size();
    }

    public int getWiek(){
        return wiek;
    }

    public String getPlec(){
        return plec;
    }
}
