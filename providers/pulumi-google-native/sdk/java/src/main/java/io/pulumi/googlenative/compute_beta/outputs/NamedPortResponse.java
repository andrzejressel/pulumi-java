// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NamedPortResponse {
    /**
     * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    private final String name;
    /**
     * The port number, which can be a value between 1 and 65535.
     * 
     */
    private final Integer port;

    @OutputCustomType.Constructor({"name","port"})
    private NamedPortResponse(
        String name,
        Integer port) {
        this.name = Objects.requireNonNull(name);
        this.port = Objects.requireNonNull(port);
    }

    /**
     * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The port number, which can be a value between 1 and 65535.
     * 
     */
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(NamedPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public NamedPortResponse build() {
            return new NamedPortResponse(name, port);
        }
    }
}
