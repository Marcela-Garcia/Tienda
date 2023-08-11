package tienda.persistencia;

public class ProductoDAO extends DAO {
    private FabricanteDAO dao; 
    private int codigoFabricante; 

    public ProductoDAO() {
        this.dao = new FabricanteDAO(); 
    }

    public void mostrarProductos1() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            consultarBaseDeDatos(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarProductos2() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            consultarBaseDeDatos(sql);
            while (resultado.next()) {
                System.out.println(
                        resultado.getInt("codigo") +
                                "     " + resultado.getString("nombre") +
                                "     " + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarProductos3(int a, int b) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN " + a + " AND " + b;
            consultarBaseDeDatos(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + "     " + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }


    public void listarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%'";
            consultarBaseDeDatos(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + "     " + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            consultarBaseDeDatos(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") +
                        "     " + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarProducto(String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            this.codigoFabricante = codigoFabricante; // Asignar el valor del código de fabricante a la variable
            String sql = "INSERT INTO producto (nombre, precio, codigo_Fabricante) VALUES ('" + nombre + "', " + precio + ", " + codigoFabricante + ")";
            insertarModificarEliminar(sql);
            System.out.println("Producto ingresado");
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            this.codigoFabricante = codigoFabricante; // Asignar el valor del código de fabricante a la variable
            String sql = "UPDATE producto SET nombre = '" + nombre + "', precio = " + precio + ", codigo_Fabricante = " + codigoFabricante + " WHERE codigo = " + codigo;
            insertarModificarEliminar(sql);
            System.out.println("Producto modificado");
        } catch (Exception e) {
            throw e;
        }
    }
}
