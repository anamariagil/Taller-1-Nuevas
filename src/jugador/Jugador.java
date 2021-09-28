/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author 503
 */
public class Jugador {
private int numero;
    private String nombre;
    private String apellido;
    private String posicion;
    private int edad;
    private String equipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if(edad>0 && edad<100){
            this.edad = edad;            
        }else{
            System.out.println("Edad inválida");
        }
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Jugador() {
    }
    
    public Jugador(int numero, String nombre, String apellido, String posicion, int edad, String equipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.edad = edad;
        this.equipo = equipo;
    }
}