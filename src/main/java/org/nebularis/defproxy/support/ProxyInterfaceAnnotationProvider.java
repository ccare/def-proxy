package org.nebularis.defproxy.support;

import java.lang.annotation.*;

/**
 * Provides a means for annotating an annotation
 * to specify that it is a proxy interface provider.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface ProxyInterfaceAnnotationProvider {}
