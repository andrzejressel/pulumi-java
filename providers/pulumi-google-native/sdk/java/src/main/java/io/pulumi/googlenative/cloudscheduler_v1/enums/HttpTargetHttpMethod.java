// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Which HTTP method to use for the request.
     * 
     */
    @EnumType
    public enum HttpTargetHttpMethod {
        /**
         * HTTP method unspecified. Defaults to POST.
         * 
         */
        HttpMethodUnspecified("HTTP_METHOD_UNSPECIFIED"),
        /**
         * HTTP POST
         * 
         */
        Post("POST"),
        /**
         * HTTP GET
         * 
         */
        Get("GET"),
        /**
         * HTTP HEAD
         * 
         */
        Head("HEAD"),
        /**
         * HTTP PUT
         * 
         */
        Put("PUT"),
        /**
         * HTTP DELETE
         * 
         */
        Delete("DELETE"),
        /**
         * HTTP PATCH
         * 
         */
        Patch("PATCH"),
        /**
         * HTTP OPTIONS
         * 
         */
        Options("OPTIONS");

        private final String value;

        HttpTargetHttpMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "HttpTargetHttpMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
