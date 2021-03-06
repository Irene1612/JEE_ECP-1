package views.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import controllers.ControllerFactory;

@ManagedBean
public class EliminarTemaBean {

    private int idTema;

    //@ManagedProperty(value = "#{auth}")
    private int auth;

    @ManagedProperty(value = "#{controllerFactory}")
    private ControllerFactory controllerFactory;

    public EliminarTemaBean() {

    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public void setidTema(Integer idTema) {
        this.idTema = idTema;

    }

    public void setControllerFactory(ControllerFactory controller) {
        this.controllerFactory = controller;

    }

    public int getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;

    }

    public String process() {
        if (auth == 666) {
            controllerFactory.getEliminarController().eliminar(idTema);
            return "home";
        } else {
            System.out.println("No autorizado");
            return "error";
        }
    }

}
