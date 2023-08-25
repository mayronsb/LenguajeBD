/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl_svr_primer_gui;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class Conexion {

//jdbc:mysql://localhost:3306/proylengdatcine"
    public static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    public static final String user = "Estudiante";
    public static final String pass = "1234";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return con;
    }
    //creamos un metodo para generar la conslta de lso datos de la BD

    public static void consultarInfo() {
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement st = con.prepareStatement("Select * from TB_CLIENTE_CINE");///Select * from TB_CLIENTE_CINE
            ResultSet res = st.executeQuery();
            while (res.next()) {
                JOptionPane.showMessageDialog(null,"La cédula es: "+ res.getString("IDENT") + ".\nEl nombre es: "
                        + res.getString("NOMBRE") + " "
                        + res.getString("APELLIDO_PATERNO") + " "
                        + res.getString("APELLIDO_MATERNO") + ".\nLa  película es: "
                        + res.getString("PELICULA") + ".\nLa tanda es: "
                        + res.getString("RESERVA") + "h. ");
            }
           
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void insertarInfo(){
        String ced=JOptionPane.showInputDialog(null,"Ingrese la cedula del cliente que desea incluir.");;
        String nom=JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente que desea incluir.");;
        String apPat=JOptionPane.showInputDialog(null,"Ingrese el primer apellido del cliente que desea incluir.");;
        String apMat=JOptionPane.showInputDialog(null,"Ingrese el segundo apellido cliente que desea incluir.");;
        String Peli=JOptionPane.showInputDialog(null,"Ingrese la película que el cliente desea ver.");;
        String Reser=JOptionPane.showInputDialog(null,"Ingrese la hora de la película que el cliente desea ver.");;
        
    try{
        Connection con =Conexion.getConnection();
        Statement st=con.createStatement();
        ///innstruccion sql para  insertar dartos en la bd
        String instruccionSQL="INSERT INTO TB_CLIENTE_CINE(IDENT,NOMBRE,APELLIDO_PATERNO,APELLIDO_MATERNO,PELICULA,RESERVA)"
                            + "values('"+ced+"','"+nom+"','"+apPat+"','"+apMat+"','"+Peli+"','"+Reser+"')";
   st.executeUpdate(instruccionSQL);
   con.close();
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    
    
}

    public static void mostrarNombreyCedula() {/// String instruccionSQL = "INSERT INTO TB_CLIENTE_CINE(ID,NOMBRE,APELLIDO_PATERNO,APELLIDO_MATERNO,PELICULA,RESERVA)"
                    ///+ "values(10,'Marco','SOLIS','VARGAS','JOHHWICK3','10010')";
        try {
            Connection con = Conexion.getConnection();
            
             Statement st = con.createStatement();
            ///innstruccion sql para  insertar dartos en la bd
            String instruccionSQL = "";
            st.executeUpdate(instruccionSQL);
            
            
            
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public static void modificarInfo() {///UPDATE TB_CLIENTE_CINE (ID,NOMBRE,APELLIDO_PATERNO,APELLIDO_MATERNO,PELICULA,RESERVA)"
                    ///+ "SET values(11,'LUIS','SOLERA','BLANCO','BARBIE','10011') WHERE nombre = 'Marco'
        try {
            Connection con = Conexion.getConnection();
            Statement st = con.createStatement();
            ///innstruccion sql para  insertar dartos en la bd
            String instruccionSQL = "";
            st.executeUpdate(instruccionSQL);
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    public static void verClientes() {
        try {
            Connection con = Conexion.getConnection();
            Statement st = con.createStatement();
            ///innstruccion sql para  insertar dartos en la bd
            String instruccionSQL = "CREATE OR REPLACE PROCEDURE SPMostrar_TBCliente_Cine\n" +
" AS\n" +
"    CURSOR DATOS IS  SELECT IDENT, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO, PELICULA, RESERVA\n" +
"                                                  FROM TB_CLIENTE_CINE;\n" +
"    IDENTIF               VARCHAR2 (20);\n" +
"    NOMBRE                VARCHAR2(20);\n" +
"    APELLIDO_PADRE        VARCHAR2(20);\n" +
"    APELLIDO_MADRE        VARCHAR2(20);\n" +
"    PELICULA_ELEG         VARCHAR2(20);\n" +
"    RESERVA_HORA          VARCHAR2(20);\n" +
"    \n" +
"BEGIN\n" +
"      OPEN DATOS;\n" +
"       LOOP\n" +
"           FETCH DATOS INTO IDENTIF, NOMBRE, APELLIDO_PADRE, APELLIDO_MADRE, PELICULA_ELEG, RESERVA_HORA;\n" +
"           EXIT WHEN DATOS%NOTFOUND;\n" +
"           DBMS_OUTPUT.PUT_LINE('EL ID ES: ' || IDENTIF || '   EL NOMBRE ES: '||NOMBRE||APELLIDO_PADRE || APELLIDO_MADRE || '   LA PELICULA ES:  ' || PELICULA_ELEG || '   A LA HORA: '||RESERVA_HORA||' H');\n" +
"     END LOOP; \n" +
"END;"+"EXEC SPMostrar_TBCliente_Cine";
            PreparedStatement st2 = con.prepareStatement("Select * from TB_CLIENTE_CINE");///Select * from TB_CLIENTE_CINE
            ResultSet procCursor = st2.executeQuery();
            while (procCursor.next()) {
                JOptionPane.showMessageDialog(null,"La cédula es: "+ procCursor.getString("IDENT") + ".\nEl nombre es: "
                        + procCursor.getString("NOMBRE") + " "
                        + procCursor.getString("APELLIDO_PATERNO") + " "
                        + procCursor.getString("APELLIDO_MATERNO") + ".\nLa  película es: "
                        + procCursor.getString("PELICULA") + ".\nLa tanda es: "
                        + procCursor.getString("RESERVA") + "h. ");
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    public static void eliminarInfo() {
        String nombreAEliminar="";
        nombreAEliminar=JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente que desea eliminar.");
        try {
            Connection con = Conexion.getConnection();
            Statement st = con.createStatement();
            ///instruccion sql para  insertar dartos en la bd
            
            String instruccionSQL = "DELETE FROM TB_CLIENTE_CINE WHERE nombre = '"+nombreAEliminar+"'";
            st.executeUpdate(instruccionSQL);
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    public static void consultarPeli() {
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement st = con.prepareStatement("Select * from TB_PELICULAS");
            ResultSet res = st.executeQuery();
            while (res.next()) {
                JOptionPane.showMessageDialog(null,"\nLa película es: "
                        + res.getString("NOMBRE_PELICULA") + ".\nLa tanda es: "
                        + res.getString("HORA_RESERVA") + "h. ");
            }
           
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void consultarReservas() {
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement st = con.prepareStatement("Select * from TB_SALAS");///Select * from TB_CLIENTE_CINE
            ResultSet res = st.executeQuery();
            while (res.next()) {
                JOptionPane.showMessageDialog(null,"El nombre del asiento es: "+ res.getString("NOMBRE_ASIENTO") + ".\nEl estado de reserva es: "
                        + res.getString("RESERVADO"));
            }
           
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void consultarAlimentos() {
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement st = con.prepareStatement("Select * from TB_PRODUCTOS");///Select * from TB_CLIENTE_CINE
            ResultSet res = st.executeQuery();
            while (res.next()) {
                JOptionPane.showMessageDialog(null,"El Id del producto es: "+ res.getString("ID_PRODUCTO") + ".\nEl nombre del producto es: "
                        + res.getString("NOMBRE_PROD")+"\nEl precio del producto es: "
                        + res.getString("PRECIO_PROD")+"\nEl tipo de producto es: "
                        + res.getString("TIPO_PROD"));
            }
           
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
     
}
