package io.apicurio.registry.metrics.health.readiness;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

/**
 * @author Jakub Senko <em>m@jsenko.net</em>
 */
@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface PersistenceTimeoutReadinessApply {
}
