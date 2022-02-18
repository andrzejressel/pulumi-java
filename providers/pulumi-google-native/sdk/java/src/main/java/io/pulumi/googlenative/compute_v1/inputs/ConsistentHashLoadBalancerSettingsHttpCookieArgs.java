// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.DurationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The information about the HTTP Cookie on which the hash function is based for load balancing policies that use a consistent hash.
 * 
 */
public final class ConsistentHashLoadBalancerSettingsHttpCookieArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsistentHashLoadBalancerSettingsHttpCookieArgs Empty = new ConsistentHashLoadBalancerSettingsHttpCookieArgs();

    /**
     * Name of the cookie.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Path to set for the cookie.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Lifetime of the cookie.
     * 
     */
    @InputImport(name="ttl")
    private final @Nullable Input<DurationArgs> ttl;

    public Input<DurationArgs> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    public ConsistentHashLoadBalancerSettingsHttpCookieArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> path,
        @Nullable Input<DurationArgs> ttl) {
        this.name = name;
        this.path = path;
        this.ttl = ttl;
    }

    private ConsistentHashLoadBalancerSettingsHttpCookieArgs() {
        this.name = Input.empty();
        this.path = Input.empty();
        this.ttl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistentHashLoadBalancerSettingsHttpCookieArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> path;
        private @Nullable Input<DurationArgs> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistentHashLoadBalancerSettingsHttpCookieArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttl = defaults.ttl;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setTtl(@Nullable Input<DurationArgs> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable DurationArgs ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }

        public ConsistentHashLoadBalancerSettingsHttpCookieArgs build() {
            return new ConsistentHashLoadBalancerSettingsHttpCookieArgs(name, path, ttl);
        }
    }
}
