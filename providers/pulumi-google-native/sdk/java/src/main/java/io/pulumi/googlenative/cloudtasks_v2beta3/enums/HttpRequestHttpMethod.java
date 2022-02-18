// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The HTTP method to use for the request. The default is POST.
     * 
     */
    @EnumType
    public enum HttpRequestHttpMethod {
        /**
         * HTTP method unspecified
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

        HttpRequestHttpMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "HttpRequestHttpMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
