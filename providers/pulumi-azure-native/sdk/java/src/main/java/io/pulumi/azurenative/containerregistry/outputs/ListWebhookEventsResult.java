// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.EventResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWebhookEventsResult {
    /**
     * The URI that can be used to request the next list of events.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * The list of events. Since this list may be incomplete, the nextLink field should be used to request the next list of events.
     * 
     */
    private final @Nullable List<EventResponse> value;

    @OutputCustomType.Constructor
    private ListWebhookEventsResult(
        @OutputCustomType.Parameter("nextLink") @Nullable String nextLink,
        @OutputCustomType.Parameter("value") @Nullable List<EventResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * The URI that can be used to request the next list of events.
     * 
    */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * The list of events. Since this list may be incomplete, the nextLink field should be used to request the next list of events.
     * 
    */
    public List<EventResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebhookEventsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<EventResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebhookEventsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<EventResponse> value) {
            this.value = value;
            return this;
        }
        public ListWebhookEventsResult build() {
            return new ListWebhookEventsResult(nextLink, value);
        }
    }
}
