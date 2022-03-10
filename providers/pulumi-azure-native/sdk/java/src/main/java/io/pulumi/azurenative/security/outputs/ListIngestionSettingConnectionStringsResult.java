// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.IngestionConnectionStringResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListIngestionSettingConnectionStringsResult {
    /**
     * Connection strings
     * 
     */
    private final List<IngestionConnectionStringResponse> value;

    @OutputCustomType.Constructor
    private ListIngestionSettingConnectionStringsResult(@OutputCustomType.Parameter("value") List<IngestionConnectionStringResponse> value) {
        this.value = value;
    }

    /**
     * Connection strings
     * 
    */
    public List<IngestionConnectionStringResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIngestionSettingConnectionStringsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<IngestionConnectionStringResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIngestionSettingConnectionStringsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(List<IngestionConnectionStringResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListIngestionSettingConnectionStringsResult build() {
            return new ListIngestionSettingConnectionStringsResult(value);
        }
    }
}
