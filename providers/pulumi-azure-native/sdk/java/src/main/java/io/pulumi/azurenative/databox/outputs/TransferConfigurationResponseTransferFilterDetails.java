// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.TransferFilterDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TransferConfigurationResponseTransferFilterDetails {
    /**
     * Details of the filtering the transfer of data.
     * 
     */
    private final @Nullable TransferFilterDetailsResponse include;

    @OutputCustomType.Constructor
    private TransferConfigurationResponseTransferFilterDetails(@OutputCustomType.Parameter("include") @Nullable TransferFilterDetailsResponse include) {
        this.include = include;
    }

    /**
     * Details of the filtering the transfer of data.
     * 
    */
    public Optional<TransferFilterDetailsResponse> getInclude() {
        return Optional.ofNullable(this.include);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigurationResponseTransferFilterDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TransferFilterDetailsResponse include;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigurationResponseTransferFilterDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.include = defaults.include;
        }

        public Builder setInclude(@Nullable TransferFilterDetailsResponse include) {
            this.include = include;
            return this;
        }
        public TransferConfigurationResponseTransferFilterDetails build() {
            return new TransferConfigurationResponseTransferFilterDetails(include);
        }
    }
}
