package objet;

import utils.ModelView;
import utils.MyAnnotation;

public class Voiture {
    @MyAnnotation(url="demarrer")
    public ModelView demarrer(){
        ModelView m = new ModelView();
        m.setView("liste.jsp");
        return m;
    }
    @MyAnnotation(url="get-voiture")
    public ModelView getVoite(){
        ModelView m = new ModelView();
        m.setView("liste.jsp");
        return m;
    }
}
