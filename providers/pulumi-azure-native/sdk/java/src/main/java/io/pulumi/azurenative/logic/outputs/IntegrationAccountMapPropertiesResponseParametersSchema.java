// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationAccountMapPropertiesResponseParametersSchema {
    /**
     * The reference name.
     * 
     */
    private final @Nullable String ref;

    @OutputCustomType.Constructor
    private IntegrationAccountMapPropertiesResponseParametersSchema(@OutputCustomType.Parameter("ref") @Nullable String ref) {
        this.ref = ref;
    }

    /**
     * The reference name.
     * 
    */
    public Optional<String> getRef() {
        return Optional.ofNullable(this.ref);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountMapPropertiesResponseParametersSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ref;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountMapPropertiesResponseParametersSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ref = defaults.ref;
        }

        public Builder setRef(@Nullable String ref) {
            this.ref = ref;
            return this;
        }
        public IntegrationAccountMapPropertiesResponseParametersSchema build() {
            return new IntegrationAccountMapPropertiesResponseParametersSchema(ref);
        }
    }
}
