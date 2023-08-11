/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import tienda.persistencia.FabricanteDAO;

import java.util.Scanner;

public class FabricanteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private FabricanteDAO dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }

    public void insertarFabricante() {
        System.out.println("Ingrese el nombre del fabricante:");
        String nombre = leer.next();
        try {
            dao.ingresarFabricante(nombre);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
