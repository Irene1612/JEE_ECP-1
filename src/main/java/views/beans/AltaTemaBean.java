package views.beans;

import javax.faces.bean.ManagedBean;

import controllers.ControllerFactory;

@ManagedBean
public class AltaTemaBean {
	
	private ControllerFactory controllerFactory;
	
	private String nombre;
	
	private String pregunta;
	
	public AltaTemaBean(){
		
	}


	public void setControllerFactory(ControllerFactory controller) {
		this.controllerFactory = controller;
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
		
	}

	public String process() {
		controllerFactory.getanadirTemaController().nuevoTema(nombre, pregunta);
		return "home";
	}

}
