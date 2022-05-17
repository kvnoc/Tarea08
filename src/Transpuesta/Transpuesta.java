package Transpuesta;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Transpuesta {

    private int matriz[][];

    private int fila;

    private int columna;

    private int valores;

    public Transpuesta() {

        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas de la matriz"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas de la matriz"));

        this.matriz = new int[fila][columna];
    }

    public void agregarMatriz(){

        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {

                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores para la matriz"));

                this.matriz[i][j] = this.valores;
            }
        }
    }

    public void mostrarMatriz(){

        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {

                System.out.printf("%d ",this.matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void transMatriz(){

        for (int i = 0; i < columna; i++){

            for (int j = 0; j < fila; j++){

                System.out.printf("%d ",this.matriz[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Transpuesta transpuesta = new Transpuesta();

        transpuesta.agregarMatriz();

        System.out.println("Matriz Original");

        transpuesta.mostrarMatriz();

        System.out.println("");

        System.out.println("Transpuesta de Matriz");

        transpuesta.transMatriz();
    }
}
