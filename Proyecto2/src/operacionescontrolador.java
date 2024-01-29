import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ToggleGroup;


public class operacionescontrolador implements Initializable {

    @FXML
    private RadioButton RdbDivision;

    @FXML
    private Button btnCalcular;

    @FXML
    private RadioButton rdbMult;

    @FXML
    private RadioButton rdbResta;

    @FXML
    private RadioButton rdbSuma;

    @FXML
    private TextField txtOperando1;

    @FXML
    private TextField txtOperando2;

    @FXML
    private TextField txtResultado;



    @Override
    public void initialize(URL url, ResourceBundle rb ){
        ToggleGroup tg=new ToggleGroup();
        this.rdbSuma.setToggleGroup(tg);
        this.rdbResta.setToggleGroup(tg);
        this.rdbMult.setToggleGroup(tg);
        this.RdbDivision.setToggleGroup(tg);


    }
    @FXML
    private void haceroperacion(ActionEvent event){
        try{
            //obtengo operaadores 
            int Operando1= Integer.parseInt(this.txtOperando1.getText());
            int Operando2=Integer.parseInt(this.txtOperando2.getText());


            //creo una instancia de modelo 
            operaciones op =new operaciones(Operando1,Operando2);
            //segun el radio seleccionado hago otra operacion

            if(this.rdbSuma.isSelected()){
                this.txtResultado.setText(op.suma()+"");
            }else if (this.rdbResta.isSelected()){
                this.txtResultado.setText(op.resta()+"");
            } else if (this.rdbMult.isSelected()){
                this.txtResultado.setText(op.multiplicacion()+"");
            }else if (this.RdbDivision.isSelected()){
                //si el operando 2 es 0 , lanzo error 

                if (Operando2==0){
                    Alert alert =new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("ERROR");
                    alert.setContentText("el operando 2 no puede ser 0");
                    alert.showAndWait();

                }else {
                    this.txtResultado.setText(op.division()+"");
                }
            }

        } catch(NumberFormatException e ){
            Alert alert =new Alert (Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("formato incorrecto");
            alert.showAndWait();
        }

    }


}



