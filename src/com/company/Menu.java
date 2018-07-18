package com.company;

import java.util.Scanner;

public class Menu {
    public void MenuPrincipal(){
        System.out.println("1.Añadir al inventario");
        System.out.print("Elige una opcion:");
        Scanner Opcion=new Scanner(System.in);
        int Opcion1=Opcion.nextInt();

        switch (Opcion1){
            case 1:
                MenuAñadir();
                break;
                default:
                    System.out.println("La opcion no es correcta");
                }
        }
        public void MenuAñadir(){
            System.out.println("1.Añadir un libro");
            System.out.println("2.Añadir una revista");
            System.out.println("3.Añadir un comic");
            System.out.print("Elige una opcion:");
            Scanner Opcion=new Scanner(System.in);
            int Opcion1=Opcion.nextInt();

            switch (Opcion1){
                case 1:
                    Recursos Inicio=new Recursos();
                    Inicio.Libros();
                    break;
                case 2:
                    Recursos Inicio2=new Recursos();
                    Inicio2.Revistas();
                    break;
                case 3:
                    Recursos Inicio3=new Recursos();
                    Inicio3.Comic();
                    break;
                    default:
                        System.out.println("La opcion no es correcta");
                    }
            }
}
