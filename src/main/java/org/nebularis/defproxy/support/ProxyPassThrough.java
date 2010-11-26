package org.nebularis.defproxy.support;

/**
 * When this annotates a target interface, all members
 * are passed through to the underlying delegate with
 * a direct mapping of the method signature. Co-variant
 * method return type <i>are</i> supported.
 */
public @interface ProxyPassThrough {}
