// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script is executed directly, which likely only succeed for scripts with [shebang lines](<https://en.wikipedia.org/wiki/Shebang_\(Unix\)>).
     * 
     */
    @EnumType
    public enum SoftwareRecipeStepRunScriptInterpreter {
        /**
         * Default value for ScriptType.
         * 
         */
        InterpreterUnspecified("INTERPRETER_UNSPECIFIED"),
        /**
         * Indicates that the script is run with `/bin/sh` on Linux and `cmd` on windows.
         * 
         */
        Shell("SHELL"),
        /**
         * Indicates that the script is run with powershell.
         * 
         */
        Powershell("POWERSHELL");

        private final String value;

        SoftwareRecipeStepRunScriptInterpreter(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SoftwareRecipeStepRunScriptInterpreter[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
