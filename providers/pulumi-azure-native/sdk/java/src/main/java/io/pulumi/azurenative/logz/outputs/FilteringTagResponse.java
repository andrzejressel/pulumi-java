// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FilteringTagResponse {
    /**
     * Valid actions for a filtering tag. Exclusion takes priority over inclusion.
     * 
     */
    private final @Nullable String action;
    /**
     * The name (also known as the key) of the tag.
     * 
     */
    private final @Nullable String name;
    /**
     * The value of the tag.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private FilteringTagResponse(
        @OutputCustomType.Parameter("action") @Nullable String action,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.action = action;
        this.name = name;
        this.value = value;
    }

    /**
     * Valid actions for a filtering tag. Exclusion takes priority over inclusion.
     * 
    */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * The name (also known as the key) of the tag.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The value of the tag.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilteringTagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FilteringTagResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public FilteringTagResponse build() {
            return new FilteringTagResponse(action, name, value);
        }
    }
}
