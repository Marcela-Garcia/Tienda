/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tienda;

import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio productoServicio = new ProductoServicio();
        FabricanteServicio fabricanteServicio = new FabricanteServicio();
        int menu = 0;
        do {
            System.out.println();
            System.out.println("1. Mostrar productos");
            System.out.println("2. Mostrar productos con precio");
            System.out.println("3. Mostrar productos con precio entre X y X");
            System.out.println("4. Listar portátiles");
            System.out.println("5. Listar producto más barato");
            System.out.println("6. Ingresar producto");
            System.out.println("7. Ingresar fabricante");
            System.out.println("8. Modificar producto");
            System.out.println("0. Salir");
            System.out.println();
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    productoServicio.mostrarProductos1();
                    break;
                case 2:
                    productoServicio.mostrarProductos2();
                    break;
                case 3:
                    System.out.println("Ingrese el precio mínimo:");
                    int min = leer.nextInt();
                    System.out.println("Ingrese el precio máximo:");
                    int max = leer.nextInt();
                    productoServicio.mostrarProductos3(min, max);
                    break;
                case 4:
                    productoServicio.listarPortatiles();
                    break;
                case 5:
                    productoServicio.listarProductoMasBarato();
                    break;
                case 6:
                    productoServicio.ingresarProducto();
                    break;
                case 7:
                    fabricanteServicio.insertarFabricante();
                    break;
                case 8:
                    productoServicio.modificarProducto();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (menu != 0);
    }
}
