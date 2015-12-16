
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
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
//Accion utilizada para buscar a uno o todos los alumnos
public class BuscarAction extends Action{
    @Override
    public ActionForward execute(ActionMapping actionMapping,ActionForm actionForm,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        BuscarForm bf=(BuscarForm)actionForm;
        String nombre=bf.getAlumno();
        //Si no disponemos de un nombre de alumno que buscar, le asignamos el valor "*"
        //Que usaremos para saber si tenemos que mostrar todos los alumnos,tanto
        //si elegimos la opción en inicio.jsp , como si dejamos el campo para buscar en blanco
        if(nombre==null||nombre==""){
            nombre="*";
        }
        List<AlumnoForm> listado=new ArrayList<>();
        Operaciones op=new Operaciones();
        listado=op.buscar(nombre);
        bf.setListado(listado);
        //Pasamos el listado de alumnos encontrado al request
        httpServletRequest.setAttribute("listado", bf);
        return(actionMapping.findForward("listado"));
    }
}
