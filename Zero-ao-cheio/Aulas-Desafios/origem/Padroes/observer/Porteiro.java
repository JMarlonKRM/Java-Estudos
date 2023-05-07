package Padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void RegistarObservador(ObservadorChegadaAniversariante observador){
        observadores.add(observador);
    }
    public void monitorar(){
        Scanner input = new Scanner(System.in);

        String valor = "";
        while (!"sair".equalsIgnoreCase(valor)){
            System.out.println("Aniversariante chegou?");
            valor = input.nextLine();
            if("sim".equalsIgnoreCase(valor)){
                //criando evento
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                //notificar os interessados
                observadores.stream().forEach(o -> o.chegou(evento));
                valor = "sair";
            }else{
                System.out.println("Alarme falso !!");
            }
        }
        
        input.close();
    }
}
