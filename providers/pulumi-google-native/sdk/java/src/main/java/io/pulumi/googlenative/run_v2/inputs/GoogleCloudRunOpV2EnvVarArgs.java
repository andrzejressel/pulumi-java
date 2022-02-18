// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2EnvVarSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EnvVar represents an environment variable present in a Container.
 * 
 */
public final class GoogleCloudRunOpV2EnvVarArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2EnvVarArgs Empty = new GoogleCloudRunOpV2EnvVarArgs();

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER, and mnay not exceed 32768 characters.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "", and the maximum length is 32768 bytes.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    /**
     * Source for the environment variable's value.
     * 
     */
    @InputImport(name="valueSource")
    private final @Nullable Input<GoogleCloudRunOpV2EnvVarSourceArgs> valueSource;

    public Input<GoogleCloudRunOpV2EnvVarSourceArgs> getValueSource() {
        return this.valueSource == null ? Input.empty() : this.valueSource;
    }

    public GoogleCloudRunOpV2EnvVarArgs(
        Input<String> name,
        @Nullable Input<String> value,
        @Nullable Input<GoogleCloudRunOpV2EnvVarSourceArgs> valueSource) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = value;
        this.valueSource = valueSource;
    }

    private GoogleCloudRunOpV2EnvVarArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
        this.valueSource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2EnvVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<String> value;
        private @Nullable Input<GoogleCloudRunOpV2EnvVarSourceArgs> valueSource;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2EnvVarArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueSource = defaults.valueSource;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public Builder setValueSource(@Nullable Input<GoogleCloudRunOpV2EnvVarSourceArgs> valueSource) {
            this.valueSource = valueSource;
            return this;
        }

        public Builder setValueSource(@Nullable GoogleCloudRunOpV2EnvVarSourceArgs valueSource) {
            this.valueSource = Input.ofNullable(valueSource);
            return this;
        }

        public GoogleCloudRunOpV2EnvVarArgs build() {
            return new GoogleCloudRunOpV2EnvVarArgs(name, value, valueSource);
        }
    }
}
