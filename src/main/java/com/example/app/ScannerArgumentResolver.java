package com.example.app;

import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created on 2016. 8. 29. 오후 12:19.
 *
 * @author samyeong-gu
 */

@Component
public class ScannerArgumentResolver implements ArgumentResolver {

    @Override
    public Argument resolve(InputStream stream) {
        int a;
        int b;
        try (Scanner scanner = new Scanner(stream)) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        return new Argument(a, b);
    }
}
