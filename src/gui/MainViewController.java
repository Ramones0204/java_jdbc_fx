package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemVendedor;
	@FXML 
	private MenuItem menuItemDepartamento;
	@FXML 
	private MenuItem menuItemAbout;
	
	@FXML
	public void menuItemVendedorAction() {
		System.out.println("menuItemVendedor");
	}
	
	@FXML
	public void menuItemDepartamentoAction() {
		System.out.println("menuItemDepartamento");
	}
	
	@FXML
	public void menuItemAboutAction() {
		System.out.println("menuItemAbout");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}

}
