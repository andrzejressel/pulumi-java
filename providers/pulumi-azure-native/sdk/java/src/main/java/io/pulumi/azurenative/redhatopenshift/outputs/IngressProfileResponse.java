// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IngressProfileResponse {
    /**
     * The IP of the ingress (immutable).
     * 
     */
    private final @Nullable String ip;
    /**
     * The ingress profile name.  Must be "default" (immutable).
     * 
     */
    private final @Nullable String name;
    /**
     * Ingress visibility (immutable).
     * 
     */
    private final @Nullable String visibility;

    @OutputCustomType.Constructor
    private IngressProfileResponse(
        @OutputCustomType.Parameter("ip") @Nullable String ip,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("visibility") @Nullable String visibility) {
        this.ip = ip;
        this.name = name;
        this.visibility = visibility;
    }

    /**
     * The IP of the ingress (immutable).
     * 
    */
    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * The ingress profile name.  Must be "default" (immutable).
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Ingress visibility (immutable).
     * 
    */
    public Optional<String> getVisibility() {
        return Optional.ofNullable(this.visibility);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String name;
        private @Nullable String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.name = defaults.name;
    	      this.visibility = defaults.visibility;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setVisibility(@Nullable String visibility) {
            this.visibility = visibility;
            return this;
        }
        public IngressProfileResponse build() {
            return new IngressProfileResponse(ip, name, visibility);
        }
    }
}
