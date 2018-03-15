package com.tecnicomio.pruebas.funcionesanonimas;

public class EjemploFuncionesAnonimas {

    public static void ejemploTradicional() {
        ICalculadora calculadora = new Calculadora();

        Integer operando1 = 10;
        Integer operando2 = 22;


        Integer resultado = calculadora.suma(operando1, operando2);

        System.out.println(operando1 + "+" + operando2 + "=" + resultado);
    }

    public static void ejemploFuncionesAnonimas() {
        Integer operando1 = 10;
        Integer operando2 = 22;

        System.out.println(operando1 + "+" + operando2 + "=" +
                new ICalculadora() {
                    @Override
                    public Integer suma(Integer operando1, Integer operando2) {
                        return operando1 + operando2;
                    }
                }.suma(operando1, operando2));


    }

    public static void ejemploExpresionLambda() {

        ICalculadora calculadora = (Integer operando1, Integer operando2)->(operando1+operando2);

        Integer operando1 = 10;
        Integer operando2 = 22;

        System.out.println(operando1 + "+" + operando2 + "=" + calculadora.suma(operando1,operando2));

    }

    public static void ejemploExpresionLambdaUnaLinea() {


        System.out.println("En una línea:10+22=" + (ICalculadora)(Integer operando1, Integer operando2)->(operando1+operando2)).suma(10,22));

    }


    public static void main(String [ ] args) {
        ejemploTradicional();
        ejemploFuncionesAnonimas();
        ejemploExpresionLambda();
        ejemploExpresionLambdaUnaLinea();
    }

}
