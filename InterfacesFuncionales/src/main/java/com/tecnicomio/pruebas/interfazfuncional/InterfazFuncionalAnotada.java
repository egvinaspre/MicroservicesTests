package com.tecnicomio.pruebas.interfazfuncional;


@FunctionalInterface
public interface InterfazFuncionalAnotada {

    public String saludo(String nombre);

    public default String holaMundo() {
        return "Hola mundo";
    }

}
