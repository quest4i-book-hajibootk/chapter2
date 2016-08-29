package com.example.app;

import org.springframework.stereotype.Component;

/**
 * Created on 2016. 8. 29. 오후 12:24.
 *
 * @author samyeong-gu
 */
@Component
public class AddCalculator implements Calculator {

    @Override
    public int calc(Argument argument) {
        return argument.getA() + argument.getB();
    }
}
