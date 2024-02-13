package io.wispforest.owo.network.serialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Deprecated : Use {@link io.wispforest.owo.serialization.annotations.SealedPolymorphic}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(forRemoval = true)
public @interface SealedPolymorphic {}
