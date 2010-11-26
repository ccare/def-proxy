package org.nebularis.defproxy.support;

/**
 * The external behavioural contract for interface validation.
 */
public interface InterfaceValidator {

    /**
     * Performs validation
     * @param proxyInterface the interface type to validate
     * @param delegate the delegate object(s) to validate against 
     */
    void validate(Class<?> proxyInterface, Object delegate) throws InvalidDelegationException;
}
