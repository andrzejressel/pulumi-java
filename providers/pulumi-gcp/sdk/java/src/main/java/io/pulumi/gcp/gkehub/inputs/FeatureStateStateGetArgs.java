// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureStateStateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureStateStateGetArgs Empty = new FeatureStateStateGetArgs();

    @InputImport(name="code")
    private final @Nullable Input<String> code;

    public Input<String> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public FeatureStateStateGetArgs(
        @Nullable Input<String> code,
        @Nullable Input<String> description,
        @Nullable Input<String> updateTime) {
        this.code = code;
        this.description = description;
        this.updateTime = updateTime;
    }

    private FeatureStateStateGetArgs() {
        this.code = Input.empty();
        this.description = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureStateStateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> code;
        private @Nullable Input<String> description;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureStateStateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCode(@Nullable Input<String> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public FeatureStateStateGetArgs build() {
            return new FeatureStateStateGetArgs(code, description, updateTime);
        }
    }
}
