// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.azurenative.datadog.outputs.DatadogHostResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListMonitorHostsResult {
    /**
     * Link to the next set of results, if any.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * Results of a list operation.
     * 
     */
    private final @Nullable List<DatadogHostResponse> value;

    @OutputCustomType.Constructor
    private ListMonitorHostsResult(
        @OutputCustomType.Parameter("nextLink") @Nullable String nextLink,
        @OutputCustomType.Parameter("value") @Nullable List<DatadogHostResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link to the next set of results, if any.
     * 
    */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * Results of a list operation.
     * 
    */
    public List<DatadogHostResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMonitorHostsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<DatadogHostResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMonitorHostsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<DatadogHostResponse> value) {
            this.value = value;
            return this;
        }
        public ListMonitorHostsResult build() {
            return new ListMonitorHostsResult(nextLink, value);
        }
    }
}
