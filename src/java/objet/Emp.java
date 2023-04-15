package objet;

import utils.ModelView;
import utils.MyAnnotation;


public class Emp {
    
    @MyAnnotation(url="/Framework/parler")
    public ModelView parler(){
        ModelView m = new ModelView();
        m.setView("liste.jsp");
        return m;
    }
    
    @MyAnnotation(url="get-emp")
    public ModelView getAll(){
        ModelView m = new ModelView();
        m.setView("liste.jsp");
        return m;
    }
    
    @MyAnnotation(url="add-emp")
    public ModelView insert(){
        ModelView m = new ModelView();
        m.setView("liste.jsp");
        return m;
    }
}
