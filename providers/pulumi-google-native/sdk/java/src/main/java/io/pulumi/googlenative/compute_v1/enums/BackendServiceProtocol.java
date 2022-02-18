// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The protocol this BackendService uses to communicate with backends. Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, UDP or GRPC. depending on the chosen load balancer or Traffic Director configuration. Refer to the documentation for the load balancers or for Traffic Director for more information. Must be set to GRPC when the backend service is referenced by a URL map that is bound to target gRPC proxy.
     * 
     */
    @EnumType
    public enum BackendServiceProtocol {
        /**
         * gRPC (available for Traffic Director).
         * 
         */
        Grpc("GRPC"),
        Http("HTTP"),
        /**
         * HTTP/2 with SSL.
         * 
         */
        Http2("HTTP2"),
        Https("HTTPS"),
        /**
         * TCP proxying with SSL.
         * 
         */
        Ssl("SSL"),
        /**
         * TCP proxying or TCP pass-through.
         * 
         */
        Tcp("TCP"),
        /**
         * UDP.
         * 
         */
        Udp("UDP"),
        /**
         * If a Backend Service has UNSPECIFIED as its protocol, it can be used with any L3/L4 Forwarding Rules.
         * 
         */
        Unspecified("UNSPECIFIED");

        private final String value;

        BackendServiceProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackendServiceProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
