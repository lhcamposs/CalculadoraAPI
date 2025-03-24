package com.example.calculadoraapi.Controller;

import com.example.calculadoraapi.Service.SimpleMath;
import com.example.calculadoraapi.Utils.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    private SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
    method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) {

        if (NumberConverter.isNumeric(numberOne) && NumberConverter.isNumeric(numberTwo)) {
            return math.sum(NumberConverter.convert(numberOne), NumberConverter.convert(numberTwo));
        }
        return 0D;
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}",
    method = RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
                              @PathVariable(value = "numberTwo") String numberTwo) {

        if(NumberConverter.isNumeric(numberOne) && NumberConverter.isNumeric(numberTwo)) {
            return math.subtraction(NumberConverter.convert(numberOne), NumberConverter.convert(numberTwo));
        }
        return 0D;
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
                                 @PathVariable(value = "numberTwo") String numberTwo) {

        if(NumberConverter.isNumeric(numberOne) && NumberConverter.isNumeric(numberTwo)) {
            return math.multiplication(NumberConverter.convert(numberOne), NumberConverter.convert(numberTwo));
        }
        return 0D;
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne,
                           @PathVariable(value = "numberTwo") String numberTwo) {

        if(NumberConverter.isNumeric(numberOne) && NumberConverter.isNumeric(numberTwo)) {
            return math.division(NumberConverter.convert(numberOne), NumberConverter.convert(numberTwo));
        }
        return 0D;
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double mean(@PathVariable(value = "numberOne") String numberOne,
                       @PathVariable(value = "numberTwo") String numberTwo) {
        if(NumberConverter.isNumeric(numberOne) && NumberConverter.isNumeric(numberTwo)) {
            return math.mean(NumberConverter.convert(numberOne), NumberConverter.convert(numberTwo));
        }
        return 0D;
    }

    @RequestMapping(value = "/square/{numberOne}", method = RequestMethod.GET)
    public Double square(@PathVariable(value = "numberOne")String numberOne) {
        if(NumberConverter.isNumeric(numberOne)) {
            return math.squareRoot(NumberConverter.convert(numberOne));
        }
        return 0D;
    }

}
