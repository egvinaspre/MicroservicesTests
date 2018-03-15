package com.tecnicomio.microservicios.spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aritmetica")
public class CalculadoraAritmeticaRESTController {
    public CalculadoraAritmeticaRESTController() {
    }

    @RequestMapping(
            value = "/sumar",
            method = RequestMethod.GET,
            params = {"operando1", "operando2"}
    )
    public Integer sumar(@RequestParam("operando1") Integer operando1,
                         @RequestParam("operando2") Integer operando2) {
        return operando1 + operando2;
    }

    @RequestMapping(
            value = "/multiplicar",
            method = RequestMethod.GET,
            params = {"operando1", "operando2"}
    )
    public Integer multiplicar(@RequestParam("operando1") Integer operando1,
                         @RequestParam("operando2") Integer operando2) {
        return operando1 * operando2;
    }


}
