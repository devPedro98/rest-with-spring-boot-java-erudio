package br.com.erudio.demo.operations.math;

import br.com.erudio.demo.exceptions.UnsupportedMathOperationException;

import static br.com.erudio.demo.operations.math.ConvertToDouble.convertToDouble;
import static br.com.erudio.demo.operations.math.IsNumeric.isNumeric;

public class Operations {

    private Operations() {
    }

    private static final String SET_NUMERIC_VALUE = "Please set a numeric value";

    public static Double sum(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(SET_NUMERIC_VALUE);
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    public static Double subtraction(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(SET_NUMERIC_VALUE);
        }
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    public static Double multiplication(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(SET_NUMERIC_VALUE);
        }
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    public static Double division(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(SET_NUMERIC_VALUE);
        }
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    public static Double average(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(SET_NUMERIC_VALUE);
        }
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    public static Double squareRoot(String number) {
        if (!isNumeric(number)) {
            throw new UnsupportedMathOperationException(SET_NUMERIC_VALUE);
        }
        return Math.sqrt(convertToDouble(number));
    }
}
