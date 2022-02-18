// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Which interpreter (python or jinja) should be used during expansion.
     * 
     */
    @EnumType
    public enum TemplateContentsInterpreter {
        UnknownInterpreter("UNKNOWN_INTERPRETER"),
        Python("PYTHON"),
        Jinja("JINJA");

        private final String value;

        TemplateContentsInterpreter(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TemplateContentsInterpreter[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
