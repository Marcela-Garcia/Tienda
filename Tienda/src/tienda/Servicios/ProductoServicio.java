/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import tienda.persistencia.ProductoDAO;

import java.util.Scanner;

public class ProductoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public void mostrarProductos1() {
        try {
            dao.mostrarProductos1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrarProductos2() {
        try {
            dao.mostrarProductos2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public void mostrarProductos3(int a, int b) {
        try {
            dao.mostrarProductos3(a,b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }         


    public void listarPortatiles() {
        try {
            dao.listarPortatiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarProductoMasBarato() {
        try {
            dao.listarProductoMasBarato();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ingresarProducto() {
        try {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto:");
            double precio = leer.nextDouble();
            System.out.println("Ingrese el código del fabricante:");
            int codigo_fabricante = leer.nextInt();
            dao.ingresarProducto(nombre, precio, codigo_fabricante);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modificarProducto() {
        try {
            System.out.println("Ingrese el código del producto que desea modificar:");
            int codigo = leer.nextInt();
            System.out.println("Ingrese el nuevo nombre del producto:");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto:");
            double precio = leer.nextDouble();
            System.out.println("Ingrese el código del fabricante:");
            int codigo_fabricante = leer.nextInt();
            dao.modificarProducto(codigo, nombre, precio, codigo_fabricante);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
