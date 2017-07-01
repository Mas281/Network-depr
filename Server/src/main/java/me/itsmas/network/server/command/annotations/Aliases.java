package me.itsmas.network.server.command.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(METHOD)
public @interface Aliases
{
    /**
     * The command value, separated by a pipe character ("|")
     */
    String value();
}