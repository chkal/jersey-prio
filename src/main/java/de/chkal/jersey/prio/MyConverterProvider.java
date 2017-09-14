package de.chkal.jersey.prio;

import javax.annotation.Priority;
import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Priority(0)
public class MyConverterProvider implements ParamConverterProvider {

    @Override
    public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {

        if (rawType.equals(Integer.class)) {

            /*
             * Dummy ParamConverter which always returns "42".
             */
            return (ParamConverter<T>) new ParamConverter<Integer>() {
                @Override
                public Integer fromString(String value) {
                    return 42;
                }

                @Override
                public String toString(Integer value) {
                    throw new UnsupportedOperationException();
                }
            };

        }
        return null;
    }
}

