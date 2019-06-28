package com.company;

public class Main {

    public static void main(String[] args) {
        Wydzial w1 = new Wydzial(1, "Informatyki");

        Student s1 = new Student(1, "Kowalski", "Jan", 20, "mezczyzna");
        Student s2 = new Student(2, "Abacki", "Adam" , 23, "mezczyzna");
        Student s3 = new Student(3, "Nowak", "Anna", 19, "kobieta");
        Student s4 = new Student(4, "Krzmien", "Justyna", 24, "kobieta");
        Student s5 = new Student(5, "Placzek", "Anna", 23, "kobieta");
        Student s6 = new Student(6, "Kasinska", "Marta", 27, "kobieta");
        Student s7 = new Student(7, "Kilijan", "Wiktor", 23, "mezczyzna");
        Student s8 = new Student(8, "Kilijan", "Dominik", 18, "mezczyzna");
        Student s9 = new Student(9, "Flak", "Andrzej", 26, "mezczyzna");
        Student s10 = new Student(10, "Arciemowicz", "Bartosz", 28, "mezczyzna");

        Kurs k1 = new Kurs("Analiza", "Gorniak");
        Kurs k2 = new Kurs("Fizyka", "Radosz");
        Kurs k3 = new Kurs("Algorytmy", "Konieczny");
        Kurs k4 = new Kurs("Geografia", "Pociecha");
        Kurs k5 = new Kurs("Biologia", "Bak");
        Kurs k6 = new Kurs("Angielski", "Neary");

        w1.dodajStudenta(s1);
        w1.dodajStudenta(s2);
        w1.dodajStudenta(s3);
        w1.dodajStudenta(s4);
        w1.dodajStudenta(s5);
        w1.dodajStudenta(s6);
        w1.dodajStudenta(s7);
        w1.dodajStudenta(s8);
        w1.dodajStudenta(s9);
        w1.dodajStudenta(s10);

        s1.dodajKurs(k1);
        s1.dodajKurs(k3);
        s1.dodajKurs(k5);

        s2.dodajKurs(k1);

        s3.dodajKurs(k1);
        s3.dodajKurs(k2);

        s4.dodajKurs(k2);

        s5.dodajKurs(k1);
        s5.dodajKurs(k2);
        s5.dodajKurs(k3);
        s5.dodajKurs(k4);
        s5.dodajKurs(k5);
        s5.dodajKurs(k6);

        s6.dodajKurs(k3);

        s7.dodajKurs(k1);
        s7.dodajKurs(k2);
        s7.dodajKurs(k3);
        s7.dodajKurs(k4);
        s7.dodajKurs(k5);

        s8.dodajKurs(k2);
        s8.dodajKurs(k3);

        s9.dodajKurs(k4);
        s9.dodajKurs(k5);
        s9.dodajKurs(k6);

        s10.dodajKurs(k3);
        s10.dodajKurs(k4);
        s10.dodajKurs(k5);

        System.out.println("Starsi niz 22 lata: ");
        w1.wypiszStarszychStudentow(22);
        System.out.println();

        System.out.println("Pierwszy kurs:");
        w1.wypiszPierszyKursStudentow();
        System.out.println();

        System.out.println("Najwiecej kursow:");
        w1.wypiszStudentaZNajwiekszaLiczbaKursow();
        System.out.println();

        System.out.println("Sredni wiek w zaleznosci od plci");
        w1.wypiszSredniWiekWZaleznosciOdPlci();

    }
}
