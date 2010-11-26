package org.nebularis.defproxy.support;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Allow you to annotate an interface to specify
 * a type to act as a validator for delegates.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ProxyInterfaceValidator {
    /**
     * Optional. The validation provider class.
     * @return
     */
    Class<? extends InterfaceValidator> validatorClass();
}
