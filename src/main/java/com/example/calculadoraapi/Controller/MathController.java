package com.example.calculadoraapi.Controller;

import com.example.calculadoraapi.Service.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    private SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
    method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        Double n1 = Double.parseDouble(numberOne);
        Double n2= Double.parseDouble(numberTwo);

        return math.sum(n1, n2);
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}",
    method = RequestMethod.GET)
    public Double substraction(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        Double n1 = Double.parseDouble(numberOne);
        Double n2= Double.parseDouble(numberTwo);

        return math.subtraction(n1, n2);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        Double n1 = Double.parseDouble(numberOne);
        Double n2= Double.parseDouble(numberTwo);

        return math.multiplication(n1, n2);
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        Double n1 = Double.parseDouble(numberOne);
        Double n2= Double.parseDouble(numberTwo);

        return math.division(n1, n2);
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double mean(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        Double n1 = Double.parseDouble(numberOne);
        Double n2= Double.parseDouble(numberTwo);

        return math.mean(n1, n2);
    }

}
