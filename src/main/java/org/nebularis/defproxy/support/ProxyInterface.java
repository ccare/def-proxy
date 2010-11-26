package org.nebularis.defproxy.support;

import org.nebularis.defproxy.support.InterfaceValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Provides configuration for against a specific back-end.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ProxyInterfaceAnnotationProvider
public @interface ProxyInterface {
    /**
     * Required. The back-end to which the decorated interface will delegate.
     * @return
     */
    Class<?> delegate();
}
