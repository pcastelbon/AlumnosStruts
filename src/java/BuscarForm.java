
import java.util.List;
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
public class BuscarForm extends ActionForm{
    
    private String alumno;
    private List<AlumnoForm> listado;
    
    public void setAlumno(String alumno){
        this.alumno=alumno;
    }
    public String getAlumno(){
        return alumno;
    }
    public void setListado(List<AlumnoForm> listado){
        this.listado=listado;
    }
    public List<AlumnoForm> getListado(){
        return listado;
    }
    
    public Boolean validate(ActionMapping actionMapping,HttpServletResponse httpServletResponse){
        
        return null;
    }
    public void reset(ActionMapping actionMapping,HttpServletResponse httpServletResponse){
        
    }
}
