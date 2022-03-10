// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentSettingResponse {
    private final String name;
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private EnvironmentSettingResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public EnvironmentSettingResponse build() {
            return new EnvironmentSettingResponse(name, value);
        }
    }
}
