package org.nebularis.defproxy.support;

import java.lang.reflect.Method;

/**
 * The external behavioural contract for custom method invocations.
 */
public interface MethodInvocationHandler {
    /**
     * 
     * @param o
     * @param method
     * @param objects
     * @return
     */
    Object invoke(Object o, Method method, Object[] objects);
}
