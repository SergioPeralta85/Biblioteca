package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursos {
    ArrayList<String> Inventario = new ArrayList<>();
    ArrayList<String> LibrosA = new ArrayList<>();
    ArrayList<String> ComicA = new ArrayList<>();
    ArrayList<String> RevistasA = new ArrayList<>();
    public void Modelo() {
        System.out.print("Introduzca Nombre:");
        Scanner Nombre = new Scanner(System.in);
        String Nombre1 = Nombre.nextLine();
        Inventario.add(Nombre1);
        System.out.print("Introduzca Fecha de Publicacion:");
        Scanner Fecha = new Scanner(System.in);
        String Fecha1 = Fecha.nextLine();
        Inventario.add(Fecha1);
    }
        public void Libros(){
        Modelo();
            System.out.print("Edicion:");
            Scanner Edicion=new Scanner(System.in);
            String Edicion1=Edicion.nextLine();
            LibrosA.add(Edicion1);
            System.out.print("ISBN:");
            Scanner ISBN=new Scanner(System.in);
            String ISBN1=ISBN.nextLine();
            LibrosA.add(ISBN1);
            System.out.print("Autor:");
            Scanner Autor=new Scanner(System.in);
            String Autor1=Autor.nextLine();
            LibrosA.add(Autor1);
        }
        public void Revistas(){
        Modelo();
            System.out.print("Numero:");
            Scanner Numero=new Scanner(System.in);
            String Numero1=Numero.nextLine();
            RevistasA.add(Numero1);
            System.out.print("Periodicidad:");
            Scanner Periodo=new Scanner(System.in);
            String Periodo1=Periodo.nextLine();
            RevistasA.add(Periodo1);
            }
         public void Comic(){
        Modelo();
             System.out.print("Numero:");
             Scanner Numero=new Scanner(System.in);
             String Numero1=Numero.nextLine();
             ComicA.add(Numero1);
             System.out.print("Coleccion:");
             Scanner Coleccion=new Scanner(System.in);
             String Coleccion1=Coleccion.nextLine();
             ComicA.add(Coleccion1);
             }
}