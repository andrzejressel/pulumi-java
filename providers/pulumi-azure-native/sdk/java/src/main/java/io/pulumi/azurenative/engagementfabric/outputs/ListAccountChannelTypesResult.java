// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric.outputs;

import io.pulumi.azurenative.engagementfabric.outputs.ChannelTypeDescriptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListAccountChannelTypesResult {
    /**
     * Channel descriptions
     * 
     */
    private final @Nullable List<ChannelTypeDescriptionResponse> value;

    @OutputCustomType.Constructor
    private ListAccountChannelTypesResult(@OutputCustomType.Parameter("value") @Nullable List<ChannelTypeDescriptionResponse> value) {
        this.value = value;
    }

    /**
     * Channel descriptions
     * 
    */
    public List<ChannelTypeDescriptionResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAccountChannelTypesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ChannelTypeDescriptionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAccountChannelTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable List<ChannelTypeDescriptionResponse> value) {
            this.value = value;
            return this;
        }
        public ListAccountChannelTypesResult build() {
            return new ListAccountChannelTypesResult(value);
        }
    }
}
