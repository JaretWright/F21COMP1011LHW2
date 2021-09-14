module com.example.f21comp1011lhw2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.example.f21comp1011lhw2 to javafx.fxml;
    exports com.example.f21comp1011lhw2;
}