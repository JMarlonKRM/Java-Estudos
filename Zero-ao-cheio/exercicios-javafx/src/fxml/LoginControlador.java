package fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginControlador {

    @FXML
    private TextField campoEmail;
    @FXML
    private PasswordField campoSenha;

    public void Entrar(){
        boolean EmailValido = campoEmail.getText().equals("jose@marlon.com");
        boolean SenhaValida = campoSenha.getText().equals("JMarlonKRM");

        if (EmailValido && SenhaValida){
            Notifications.create().position(Pos.TOP_RIGHT).title("Login JFX").text("Login efetuado!!!").showInformation();
        }else {
            Notifications.create().position(Pos.TOP_RIGHT).title("Login JFX").text("Erro ao efetuar o Login!!").showError();
        }
    }
}
