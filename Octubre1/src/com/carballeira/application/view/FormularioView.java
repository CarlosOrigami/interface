package com.carballeira.application.view;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import com.carballeira.application.model.Usuario;


public class FormularioView extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			GridPane root = new GridPane();
			 root.setHgap(20); // Espacio horizontal entre columnas
		     root.setVgap(10); // Espacio vertical entre filas
		     root.setPadding(new Insets(20)); // Padding para el GridPane

			
			//etiquetas
		     
			Label nombreLbl = new Label("Nombre:*");
			Label apellidosLbl = new Label("Apellidos:");
			Label usuarioLbl = new Label("Usuario:");
			Label contraLbl = new Label("Contraseña:*");
			Label estatusLbl = new Label("Estatus:");
			
			ToggleGroup togglegroup = new ToggleGroup();
			
			RadioButton option1 = new RadioButton("Activo");
			option1.setToggleGroup(togglegroup);
			RadioButton option2 = new RadioButton("Inacivo");
			option2.setToggleGroup(togglegroup);
			
			HBox vbox = new HBox(10);
			vbox.getChildren().addAll(option1, option2);
			
			Button boton = new Button("Añadir Usuario");
			
			//cuadros de texto
			
			TextField nombreF = new TextField();
			TextField apellidosf = new TextField();
			TextField usuariof = new TextField();
			TextField contraf = new TextField();
			
			//Tabla
			TableView tabla = new TableView();
			
			TableColumn<Usuario, String>column1 = new TableColumn<>("Nombre");
			column1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
			
			TableColumn<Usuario, String>column2 = new TableColumn<>("Apellidos");
			column2.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
			
			TableColumn<Usuario, String>column3 = new TableColumn<>("Usuario");
			column3.setCellValueFactory(new PropertyValueFactory<>("usuario"));
			
			TableColumn<Usuario, String>column4 = new TableColumn<>("Estatus");
			column4.setCellValueFactory(new PropertyValueFactory<>("estatus"));
			
			tabla.getColumns().addAll(column1, column2, column3, column4);
			
			boton.setOnAction(event -> {
				String nombre = nombreF.getText();
				String apellidos = apellidosf.getText();
				String usuario = usuariof.getText();
				String contra = contraf.getText();
				RadioButton radio=(RadioButton)togglegroup.getSelectedToggle();
				Usuario user = new Usuario(nombre, apellidos, usuario, contra,radio.getText());
			
			});

			//Añadir
			
			root.add(nombreLbl,0,0);
			root.add(nombreF, 1, 0);
			
			root.add(apellidosLbl,0,1);
			root.add(apellidosf, 1, 1);
			
			root.add(usuarioLbl,2,0);
			root.add(usuariof, 3, 0);
			
			root.add(contraLbl,2,1);
			root.add(contraf, 3, 1);
			
			root.add(estatusLbl, 0, 2);
			root.add(vbox, 1, 2);
			
			root.add(boton, 2, 2);
			root.add(tabla, 0, 3, 4, 1);
			
			Scene scene = new Scene(root,900,900);
			primaryStage.setTitle("Formulario de Usuario");
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
