package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    private int contador = 0;

    private void atualizarLabelN (Label label){

        label.setText(Integer.toString(contador));

        label.getStyleClass().remove("verde");
        label.getStyleClass().remove("vermelho");

        if (contador > 0){
            label.getStyleClass().add("verde");
        }else if (contador < 0){
            label.getStyleClass().add("vermelho");
        }
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label labelTitulo = new Label("Contador");
        labelTitulo.getStyleClass().add("titulo");
        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero");

        Button botaoDecremento = new Button("-");
        botaoDecremento.getStyleClass().add("botoes");
        botaoDecremento.setOnAction( e ->{
            contador --;
            atualizarLabelN(labelNumero);
        });

        Button botaoIncremento = new Button("+");
        botaoIncremento.getStyleClass().add("botoes");
        botaoIncremento.setOnAction(e -> {
            contador++;
            atualizarLabelN(labelNumero);
        });

        HBox boxbotoes = new HBox();
        boxbotoes.setAlignment(Pos.CENTER);
        boxbotoes.setSpacing(10);
        boxbotoes.getChildren().add(botaoDecremento);
        boxbotoes.getChildren().add(botaoIncremento);

        VBox boxPrincial = new VBox();
        boxPrincial.getStyleClass().add("conteudo");
        boxPrincial.setAlignment(Pos.CENTER);
        boxPrincial.setSpacing(10);
        boxPrincial.getChildren().add(labelTitulo);
        boxPrincial.getChildren().add(labelNumero);
        boxPrincial.getChildren().add(boxbotoes);

        String CaminhoCSS = getClass().getResource("/basico/Contador.css").toExternalForm();
        Scene CenaPrincipal = new Scene(boxPrincial,400,200);
        CenaPrincipal.getStylesheets().add(CaminhoCSS);
        CenaPrincipal.getStylesheets().add("https://fonts.google.com/specimen/Oswald");

        stage.setScene(CenaPrincipal);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
