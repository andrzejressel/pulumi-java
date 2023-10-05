// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.myedgeorder.outputs.ConfigurationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListConfigurationsResult {
    /**
     * @return Link for the next set of configurations.
     * 
     */
    private @Nullable String nextLink;
    /**
     * @return List of configurations.
     * 
     */
    private List<ConfigurationResponse> value;

    private ListConfigurationsResult() {}
    /**
     * @return Link for the next set of configurations.
     * 
     */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * @return List of configurations.
     * 
     */
    public List<ConfigurationResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConfigurationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String nextLink;
        private List<ConfigurationResponse> value;
        public Builder() {}
        public Builder(ListConfigurationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        @CustomType.Setter
        public Builder value(List<ConfigurationResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(ConfigurationResponse... value) {
            return value(List.of(value));
        }
        public ListConfigurationsResult build() {
            final var _resultValue = new ListConfigurationsResult();
            _resultValue.nextLink = nextLink;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
