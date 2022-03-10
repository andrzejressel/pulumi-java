// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RunbookParameterResponse {
    /**
     * Gets or sets the default value of parameter.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
     */
    private final @Nullable Boolean isMandatory;
    /**
     * Get or sets the position of the parameter.
     * 
     */
    private final @Nullable Integer position;
    /**
     * Gets or sets the type of the parameter.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private RunbookParameterResponse(
        @OutputCustomType.Parameter("defaultValue") @Nullable String defaultValue,
        @OutputCustomType.Parameter("isMandatory") @Nullable Boolean isMandatory,
        @OutputCustomType.Parameter("position") @Nullable Integer position,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.defaultValue = defaultValue;
        this.isMandatory = isMandatory;
        this.position = position;
        this.type = type;
    }

    /**
     * Gets or sets the default value of parameter.
     * 
    */
    public Optional<String> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
    */
    public Optional<Boolean> getIsMandatory() {
        return Optional.ofNullable(this.isMandatory);
    }
    /**
     * Get or sets the position of the parameter.
     * 
    */
    public Optional<Integer> getPosition() {
        return Optional.ofNullable(this.position);
    }
    /**
     * Gets or sets the type of the parameter.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunbookParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable Boolean isMandatory;
        private @Nullable Integer position;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RunbookParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.isMandatory = defaults.isMandatory;
    	      this.position = defaults.position;
    	      this.type = defaults.type;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setIsMandatory(@Nullable Boolean isMandatory) {
            this.isMandatory = isMandatory;
            return this;
        }

        public Builder setPosition(@Nullable Integer position) {
            this.position = position;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public RunbookParameterResponse build() {
            return new RunbookParameterResponse(defaultValue, isMandatory, position, type);
        }
    }
}
