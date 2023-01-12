/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package exemplominimo_tema1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author guilh
 */
public class FXMLDocumentController implements Initializable {
    
    private Calculadora c = new Calculadora();
    
    @FXML
    private Label label;
    
        @FXML
    private Label lbl_resultado;
    
    @FXML
    private TextField txtDado;
    
        @FXML
    private TextField txtDado2;
        
        
    @FXML
    private void somar(ActionEvent event) {
        float x = Float.valueOf(txtDado.getText()).floatValue();
        float y = Float.valueOf(txtDado2.getText()).floatValue();
        
        x = c.somar(x, y);
        
        lbl_resultado.setText("Resultado da soma: "+x);
    }
    
    
    @FXML
    private void subtrair(ActionEvent event) {
        float x = Float.valueOf(txtDado.getText()).floatValue();
        float y = Float.valueOf(txtDado2.getText()).floatValue();
        
        x = c.subtrair(x, y);
        
        lbl_resultado.setText("Resultado da sub: "+x);
        
    }
    
    @FXML
    private void dividir(ActionEvent event) {
        float x = Float.valueOf(txtDado.getText()).floatValue();
        float y = Float.valueOf(txtDado2.getText()).floatValue();
        
        x = c.dividir(x, y);
        
        lbl_resultado.setText("Resultado da divisao: "+x);
    }
    
    @FXML
    private void multiplicar(ActionEvent event) {
        float x = Float.valueOf(txtDado.getText()).floatValue();
        float y = Float.valueOf(txtDado2.getText()).floatValue();
        
        x = c.multiplicar(x, y);
        
        lbl_resultado.setText("Resultado da multi: "+x);
        
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
