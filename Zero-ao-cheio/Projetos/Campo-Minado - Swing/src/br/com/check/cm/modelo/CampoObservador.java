package br.com.check.cm.modelo;

public interface CampoObservador {

    default void EventoOcorreu(Campo campo, CampoEvendo evento){

    }
}
