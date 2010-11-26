package org.nebularis.defproxy.support;

/**
 * This annotation explicitly marks a method as delegated,
 * which is only useful when you've not annotated your interface
 * as {@link org.nebularis.defproxy.support.ProxyPassThrough}.
 */
public @interface Delegated {

    /**
     * Optional. Indicates the method name in the back-end to
     * which calls should be delegated. If left blank, the name
     * of the annotated method will be used by default.
     *
     * <em>This value is ignored if the {@link Delegated#methodInvocationHandler()}
     * option has been set.</em>
     * @return
     */
    String methodName() default "";

    /**
     * Optional. Indicates a type which, once instantiated, will handle the
     * calls to the back-end.
     *
     * <em>This value is ignored if the {@link Delegated#methodName()}
     * option has been set.</em>
     * @return
     */
    Class<? extends MethodInvocationHandler> methodInvocationHandler();
}
