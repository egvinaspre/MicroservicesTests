package com.tecnicomio.pruebas.funcionesanonimas;

public class Calculadora implements ICalculadora {

    @Override
    public Integer suma(Integer operando1, Integer operando2) {
        return operando1 + operando2;
    }
}
