module Octubre1 {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens com.carballeira.application.view to javafx.graphics, javafx.fxml;
}
