package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Wydzial {

    String nazwaWydzialu;
    int numerWydzialu;
    ArrayList<Student> listaStudentow;

    Wydzial(int numerWydzialu, String nazwaWydzialu){
        this.numerWydzialu = numerWydzialu;
        this.nazwaWydzialu = nazwaWydzialu;
        listaStudentow = new ArrayList<>();
    }

    public void dodajStudenta(Student s){
        listaStudentow.add(s);
    }


    //filtrowanie
    public void wypiszStarszychStudentow(int minWiek){
        listaStudentow.stream().filter(student -> student.wiek > minWiek).forEach(student -> System.out.println(student));
    }

    //map
    public void wypiszPierszyKursStudentow(){
        listaStudentow.stream().map(student -> student.listaKursow.get(0).nazwaKursu).forEach(s -> System.out.println(s));
    }

    //max
    public void wypiszStudentaZNajwiekszaLiczbaKursow(){
        Comparator<Student> comparator = Comparator.comparing(Student::liczbaKursow);
        System.out.println(listaStudentow.stream().max(comparator).get());
    }

    //groupingBy
    public void wypiszSredniWiekWZaleznosciOdPlci(){
        System.out.println(listaStudentow.stream().collect(Collectors.groupingBy(Student::getPlec, Collectors.averagingDouble(Student::getWiek))));
    }

}
