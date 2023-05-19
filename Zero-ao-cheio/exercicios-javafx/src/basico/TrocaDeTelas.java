package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TrocaDeTelas extends Application {

    private Stage tela;

    private Scene passo1;
    private Scene passo2;
    private Scene passo3;

    @Override
    public void start(Stage stage) throws Exception {
        tela = stage;

        CriarPasso1();
        CriarPasso2();
        CriarPasso3();

        tela.setScene(passo1);
        tela.setTitle("Trocando tela com FX/1");
        tela.show();
    }
    private void CriarPasso1(){

        Button Proximo = new Button("PROXIMO/2");
        Proximo.setOnAction(e -> {
            tela.setScene(passo2);
            tela.setTitle("Trocando tela com FX/2");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(Proximo);

        passo1 = new Scene(box, 400,400);

    }
    private void CriarPasso2(){

        Button Proximo = new Button("PROXIMO/3");
        Proximo.setOnAction(e -> {
            tela.setScene(passo3);
            tela.setTitle("Trocando tela com FX/3");
        });

        Button Anterior = new Button("Voltar/1");
        Anterior.setOnAction(e -> {
            tela.setScene(passo1);
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(Proximo);
        box.getChildren().add(Anterior);

        passo2 = new Scene(box, 400,400);
    }
    private void CriarPasso3(){

        Button Finalizar = new Button("VOLTAR/2");
        Finalizar.setOnAction(e -> {
            tela.setScene(passo2);
        });

        Button Proximo = new Button("FINALIZAR!");
        Proximo.setOnAction(e -> {
            System.exit(0);
        });


        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(Proximo);
        box.getChildren().add(Finalizar);

        passo3 = new Scene(box, 400,400);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
