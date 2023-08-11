/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

public class FabricanteDAO extends DAO {
    public void ingresarFabricante(String nombre) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + nombre + "')";
            insertarModificarEliminar(sql);
            System.out.println("Fabricante ingresado");
        } catch (Exception e) {
            throw e;
        }
    }
}
