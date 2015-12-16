

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
public class AlumnoAction extends Action{
    
    public ActionForward execute(ActionMapping actionMapping,ActionForm actionForm,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        
        AlumnoForm af=(AlumnoForm)actionForm;
        Operaciones op=new Operaciones();
        op.grabar(af);
        return(actionMapping.findForward("registrado"));
    }
    
    
}
