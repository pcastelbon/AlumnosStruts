

import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro-hp
 */
public class AlumnoForm extends ActionForm{
    
    private String ni;
    private String nombre;
    private String curso;
    private int edad;
    private String email;
    private  String fecha;
    
    public void setNi(String ni){
        this.ni=ni;
    }
    public String getNi(){
        return ni;
    }
    
    public void setNombre(String nombre){
        
        this.nombre=nombre;
    }
    public String getNombre(){
        
        return nombre;
    }
    public void setEdad(int edad){
        
        this.edad=edad;
    }
    public int getEdad(){
        
        return edad;
    }
    public void setEmail(String email){
        
        this.email=email;
    }
    public String getEmail(){
        
        return email;
    }
    public void setCurso(String curso){
        
        this.curso=curso;
    }
    public String getCurso(){
        
        return curso;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;      
    }
    public String getFecha(){        
        return fecha;
    }
    public Boolean validate(ActionMapping actionMapping,HttpServletResponse httpServletResponse){
        
        return null;
    }
    public void reset(ActionMapping actionMapping,HttpServletResponse httpServletResponse){
        
    }
}
