/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import jugador.Jugador;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Taller1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int id;
        int contador=0;
        int buscar;
        Jugador[] jugador= new Jugador[10];
        System.out.println("Bienvenido");
        do{
            System.out.println("");
            System.out.println("¿Qué deseas hacer?");
            System.out.println("");
            System.out.println("1. Agregar un jugador a la convocatoria");
            System.out.println("2. Buscar un jugador");
            System.out.println("3. Modificar un jugador");
            System.out.println("4. Mostrar la convocatoria de jugadores");
            System.out.println("5. Salir \n");
            System.out.println("Digite una opción");
            opcion= entrada.nextInt();
            switch(opcion){
                case 1:
                    if (contador<23){
                        jugador[contador]=new Jugador();
                        System.out.println("");
                        System.out.println("Ingrese el número de la camisa");
                        jugador[contador].setNumero(entrada.nextInt());
                        System.out.println("");
                        System.out.println("Ingrese el nombre del jugador");
                        jugador[contador].setNombre(entrada.next());
                        System.out.println("");
                        System.out.println("Ingrese el apellido del jugador");
                        jugador[contador].setApellido(entrada.next());
                        System.out.println("");
                        System.out.println("Ingrese la posicion en la que juega");
                        jugador[contador].setPosicion(entrada.next());
                        System.out.println("");
                        System.out.println("Ingrese la edad del jugador");
                        jugador[contador].setEdad(entrada.nextInt());
                        System.out.println("");
                        System.out.println("Ingrese el equipo en el que juega");
                        jugador[contador].setEquipo(entrada.next());
                        System.out.println("");
                        contador++;
                    }else{
                        System.out.println("Solo se pueden agregar 23 futbolistas");
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Ingrese el número de la camisa");
                    buscar= entrada.nextInt();
                    if (buscar <= contador){
                        for (int i=0; i<contador; i++){
                            if (buscar==jugador[i].getNumero()){
                                System.out.println("");
                                System.out.println("El número de la camisa es " +jugador[i].getNumero());
                                System.out.println("Su nombre es " +jugador[i].getNombre());
                                System.out.println("Su apellido es " +jugador[i].getApellido());
                                System.out.println("Juega de " +jugador[i].getPosicion());
                                System.out.println("En el " +jugador[i].getEquipo());
                                System.out.println("Y tiene " +jugador[i].getEdad()+ " años");
                                System.out.println("");
                            }
                        }
                    }else{
                        System.out.println("El jugador con la camisa #" +buscar+ " no existe aún");
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Ingrese el número de la camisa");
                    buscar= entrada.nextInt();
                    if (buscar <= contador){
                        for (int i=0; i<contador; i++){
                            if (buscar==jugador[i].getNumero()){
                                jugador[i]=new Jugador();
                                jugador[i].setNumero(buscar);
                                System.out.println(""); 
                                System.out.println("Ingrese el actual nombre del jugador");
                                jugador[i].setNombre(entrada.next());
                                System.out.println(""); 
                                System.out.println("Ingrese el actual apellido del jugador");
                                jugador[i].setApellido(entrada.next());
                                System.out.println(""); 
                                System.out.println("Ingrese la actual posicion del jugador");
                                jugador[i].setPosicion(entrada.next());
                                System.out.println(""); 
                                System.out.println("Ingrese la actual edad del jugador");
                                jugador[i].setEdad(entrada.nextInt());
                                System.out.println("");
                                System.out.println("Ingrese el actual equipo en el que juega");
                                jugador[i].setEquipo(entrada.next());
                                System.out.println("");
                            }
                        }
                    }else{
                        System.out.println("El jugador con la camisa #" +buscar+ " no existe aún");
                    }
                    break;
                case 4:
                    System.out.println("");
                    int h=1;
                    if (contador>0){
                        for (int i=0; i<contador; i++){
                            System.out.println("Jugador " +h+ ":");
                            System.out.println(""); 
                            System.out.println("El número de la camisa es " +jugador[i].getNumero());
                            System.out.println("Su nombre es " +jugador[i].getNombre());
                            System.out.println("Su apellido es " +jugador[i].getApellido());
                            System.out.println("Juega de " +jugador[i].getPosicion());
                            System.out.println("En el " +jugador[i].getEquipo());
                            System.out.println("Y tiene " +jugador[i].getEdad()+ " años");
                            System.out.println(""); 
                            h++;
                        }
                    }else{
                        System.out.println("Aún no se ha registrado ningún jugador");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción no válida");
                    break;
            }
        }while(opcion!=5 || contador<2);
    }
}
