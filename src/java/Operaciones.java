
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro-hp
 */
public class Operaciones {
            
    public Connection getConnection(){
        Connection cn=null;
        String url="jdbc:mysql://localhost:3306/alumnos";
        String user="root";
        String pass="";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(url,user,pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }return cn;
    }
    //Inserta un alumno en la base de datos "alumnos"
    public void grabar(AlumnoForm alumnoForm){
        
        Connection cn;        
        Statement st;
        String tsql;
        try{
            cn=getConnection();
            st=cn.createStatement();
            tsql="insert into alumnos (ni,nombre,edad,email,curso,fecha_alta) values ('";
            tsql+=alumnoForm.getNi()+"','";
            tsql+=alumnoForm.getNombre()+"','";
            tsql+=alumnoForm.getEdad()+"','";
            tsql+=alumnoForm.getEmail()+"','";
            tsql+=alumnoForm.getCurso()+"','";
            tsql+=alumnoForm.getFecha()+"')";
            st.executeUpdate(tsql);
            st.close();
            cn.close();
        }catch(Exception ex){
            
            ex.printStackTrace();
        }
    }
    //Busca alumnos
    public List<AlumnoForm> buscar(String nombre){
        Connection cn;
        cn=getConnection();
        Statement st;
        String tsql;
        ResultSet rs;
        List<AlumnoForm> lista=new ArrayList<>();
        try{            
            st=cn.createStatement();
            tsql="select * from alumnos";
            if(nombre!="*"){
                tsql+=" where nombre='"+nombre+"'";
            }
                       
            rs=st.executeQuery(tsql);            
            while(rs.next()){
                AlumnoForm alumno=new AlumnoForm();
                alumno.setNi(rs.getString("ni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setCurso(rs.getString("curso"));
                alumno.setEdad(rs.getInt("edad"));
                alumno.setEmail(rs.getString("email"));
                alumno.setFecha(rs.getString("fecha_alta"));
                lista.add(alumno);
            } 
              rs.close();
              st.close();
              cn.close();           
            
        }catch(Exception ex){
            
            ex.printStackTrace();
        } return lista;          
                 
    }
    
}
