package com.tecnicomio.pruebas.interfazfuncional;

public interface InterfazFuncionalRebuscada {
    public String saludo(String nombre);

    public default String holaMundo() {
        return "Hola mundo";
    }

}
