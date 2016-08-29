package com.example.app;

import java.io.InputStream;

/**
 * Created on 2016. 8. 29. 오후 12:18.
 *
 * @author samyeong-gu
 */
public interface ArgumentResolver {
    Argument resolve(InputStream stream);
}
