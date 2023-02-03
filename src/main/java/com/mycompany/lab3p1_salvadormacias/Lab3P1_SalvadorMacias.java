package com.mycompany.lab3p1_salvadormacias;

import java.util.Scanner;

public class Lab3P1_SalvadorMacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }//fin main

    public static void menu() {
        boolean salida = true;
        do {
            System.out.println("Bienvenido al menu!");
            System.out.println("Estas son las opciones disponibles: ");
            System.out.println("1.Triangulo\n2.Calculando Pi\n3.Construyendo casas\n4.Salir");
            System.out.println("Ingrese opcion : ");
            int opc = lea.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Ingrese el tamaño de la figura(numero positivo entre 4 y 16): ");
                    int n = lea.nextInt();
                    System.out.println("Ingrese el caracter del triangulo superior: ");
                    String caracter = str.nextLine();
                    if (n >= 4 && n <= 16) {

                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("  ");
                            }//Fin for j espacios
                            for (int j = n - 1 - i; j >= 0; j--) {
                                System.out.print(caracter + " ");
                            }//Fin for j asteriscos
                            System.out.println("");
                        }//Fin for i
                        System.out.println("-----------------------------------------------------------------------------");

                    } else {

                        System.out.println("El numero ingresado tiene que estar entre 4 y 16 ");
                        System.out.println("");
                    }//fin if
                    System.out.println("--------------------------------------------------------------------------------");

                }//fin case 1
                break;

                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.print("Ingrese el límite de la sumatoria(numero positivo): ");
                    int limite = lea.nextInt();
                    double apr = 0;
                    if(limite>=1){
                    for (int i = 0; i <= limite; i++) {
                        int dem = 2*i +1;
                        apr += Math.pow(-1, i) /dem;
                    }
                    apr *= 4;
                    System.out.println("La aproximación es: " + apr);
                    
                    System.out.println("--------------------------------------------------------------------------------");
                }else{
                        System.out.println("El numero tiene que ser mayor a 1");
                    
                    }//fin if
                }//fin case 2
                break;
                
                case 3: {
                    System.out.println("--------------------------------------------------------------------------------");
                    int base;
                    System.out.print("Ingrese el tamano de la figura(numero mayor a 4): ");
                    base = lea.nextInt();
                    if (base > 4) {
                        int basefinal = base * 2;
                        for (int i = 0; i < basefinal; i++) {
                            for (int j = basefinal - 1 - i; j > 0; j--) {
                                System.out.print(" ");
                            }//Fin for espacios
                            for (int j = 0; j <= i; j++) {
                                System.out.print("* ");
                            }//Fin for j asteriscos
                            System.out.println("");
                        }//Fin for i
                        int tamano = basefinal;

                        for (int i = 0; i < tamano; i++) {
                            for (int j = 0; j < tamano; j++) {
                                System.out.print("+ ");
                            }//Fin for interno
                            System.out.println("");
                        }//Fin for externo
                        System.out.println("--------------------------------------------------------------------------------");
                    }//fin if 
                    else {
                        System.out.println("El numero ingresado tiene que ser mayor a 4");

                    }

                }//fin case 3
                break;
                case 4: {
                    salida = false;
                    System.out.println("Se abandonara el programa");

                }//fin case 4
                break;

                default:
                    System.out.println("Opcion ingresada no es valida");
                    System.out.println("--------------------------------------------------------------------------------");

            }//fin switch

        } while (salida != false);//fin while
    }//fin menu
}//fin clase
