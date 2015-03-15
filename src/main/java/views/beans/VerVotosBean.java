package views.beans;

import models.entities.Tema;
import controllers.ControllerFactory;

public class VerVotosBean {

	private int idTema;

	private Tema tema;

	private ControllerFactory controllerFactory;
	
	private int numVotos;
	
	private int mediaValoracion;

	public VerVotosBean() {

	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	

	public int getNumVotos() {
		return numVotos;
	}

	public void setNumVotos(int numVotos) {
		this.numVotos = numVotos;
	}

	public int getMediaValoracion() {
		return mediaValoracion;
	}

	public void setMediaValoracion(int mediaValoracion) {
		this.mediaValoracion = mediaValoracion;
	}

	public void setControllerFactory(ControllerFactory controller) {
		this.controllerFactory = controller;

	}

	public void setidTema(Integer idTema) {
		this.idTema = idTema;

	}

	public void update() {
		this.tema = controllerFactory.getVerVotosController().getTema(idTema);
		this.numVotos = controllerFactory.getVerVotosController().getNumVotos(idTema);
		this.mediaValoracion = controllerFactory.getVerVotosController().getValoracionMedia(idTema);
	}

}
