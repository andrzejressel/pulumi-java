// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.memcache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMemcacheParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceMemcacheParametersArgs Empty = new InstanceMemcacheParametersArgs();

    /**
     * - 
     * This is a unique ID associated with this set of parameters.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * User-defined set of parameters to use in the memcache process.
     * 
     */
    @InputImport(name="params")
    private final @Nullable Input<Map<String,String>> params;

    public Input<Map<String,String>> getParams() {
        return this.params == null ? Input.empty() : this.params;
    }

    public InstanceMemcacheParametersArgs(
        @Nullable Input<String> id,
        @Nullable Input<Map<String,String>> params) {
        this.id = id;
        this.params = params;
    }

    private InstanceMemcacheParametersArgs() {
        this.id = Input.empty();
        this.params = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMemcacheParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<Map<String,String>> params;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMemcacheParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.params = defaults.params;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setParams(@Nullable Input<Map<String,String>> params) {
            this.params = params;
            return this;
        }

        public Builder setParams(@Nullable Map<String,String> params) {
            this.params = Input.ofNullable(params);
            return this;
        }

        public InstanceMemcacheParametersArgs build() {
            return new InstanceMemcacheParametersArgs(id, params);
        }
    }
}
