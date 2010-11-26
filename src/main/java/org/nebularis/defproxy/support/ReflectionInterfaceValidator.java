package org.nebularis.defproxy.support;

/**
 * Reflection based {@link org.nebularis.defproxy.support.InterfaceValidator}.
 */
public class ReflectionInterfaceValidator implements InterfaceValidator {
    @Override
    public void validate(Class<?> proxyInterface, Object delegate) throws InvalidDelegationException {
        throw new InvalidDelegationException();
    }
}
