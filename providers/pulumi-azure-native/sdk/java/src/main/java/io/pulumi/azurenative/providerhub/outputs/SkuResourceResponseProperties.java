// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.SkuSettingResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SkuResourceResponseProperties {
    private final @Nullable String provisioningState;
    private final List<SkuSettingResponse> skuSettings;

    @OutputCustomType.Constructor
    private SkuResourceResponseProperties(
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("skuSettings") List<SkuSettingResponse> skuSettings) {
        this.provisioningState = provisioningState;
        this.skuSettings = skuSettings;
    }

    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public List<SkuSettingResponse> getSkuSettings() {
        return this.skuSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResourceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String provisioningState;
        private List<SkuSettingResponse> skuSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResourceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.skuSettings = defaults.skuSettings;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSkuSettings(List<SkuSettingResponse> skuSettings) {
            this.skuSettings = Objects.requireNonNull(skuSettings);
            return this;
        }
        public SkuResourceResponseProperties build() {
            return new SkuResourceResponseProperties(provisioningState, skuSettings);
        }
    }
}
