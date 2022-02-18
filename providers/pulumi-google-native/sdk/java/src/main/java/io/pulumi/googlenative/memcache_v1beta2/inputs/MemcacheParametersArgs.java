// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemcacheParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final MemcacheParametersArgs Empty = new MemcacheParametersArgs();

    /**
     * User defined set of parameters to use in the memcached process.
     * 
     */
    @InputImport(name="params")
    private final @Nullable Input<Map<String,String>> params;

    public Input<Map<String,String>> getParams() {
        return this.params == null ? Input.empty() : this.params;
    }

    public MemcacheParametersArgs(@Nullable Input<Map<String,String>> params) {
        this.params = params;
    }

    private MemcacheParametersArgs() {
        this.params = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemcacheParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> params;

        public Builder() {
    	      // Empty
        }

        public Builder(MemcacheParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.params = defaults.params;
        }

        public Builder setParams(@Nullable Input<Map<String,String>> params) {
            this.params = params;
            return this;
        }

        public Builder setParams(@Nullable Map<String,String> params) {
            this.params = Input.ofNullable(params);
            return this;
        }

        public MemcacheParametersArgs build() {
            return new MemcacheParametersArgs(params);
        }
    }
}
