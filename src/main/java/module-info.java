module DAM.Programacion.jxml.ProyectoGame1 {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens DAM.Programacion.jxml.ProyectoGame1 to javafx.fxml;
    exports DAM.Programacion.jxml.ProyectoGame1;
}
