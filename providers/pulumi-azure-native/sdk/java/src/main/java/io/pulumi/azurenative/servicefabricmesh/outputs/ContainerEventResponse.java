// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerEventResponse {
    /**
     * The count of the event.
     * 
     */
    private final @Nullable Integer count;
    /**
     * Date/time of the first event.
     * 
     */
    private final @Nullable String firstTimestamp;
    /**
     * Date/time of the last event.
     * 
     */
    private final @Nullable String lastTimestamp;
    /**
     * The event message
     * 
     */
    private final @Nullable String message;
    /**
     * The name of the container event.
     * 
     */
    private final @Nullable String name;
    /**
     * The event type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private ContainerEventResponse(
        @OutputCustomType.Parameter("count") @Nullable Integer count,
        @OutputCustomType.Parameter("firstTimestamp") @Nullable String firstTimestamp,
        @OutputCustomType.Parameter("lastTimestamp") @Nullable String lastTimestamp,
        @OutputCustomType.Parameter("message") @Nullable String message,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.count = count;
        this.firstTimestamp = firstTimestamp;
        this.lastTimestamp = lastTimestamp;
        this.message = message;
        this.name = name;
        this.type = type;
    }

    /**
     * The count of the event.
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    /**
     * Date/time of the first event.
     * 
    */
    public Optional<String> getFirstTimestamp() {
        return Optional.ofNullable(this.firstTimestamp);
    }
    /**
     * Date/time of the last event.
     * 
    */
    public Optional<String> getLastTimestamp() {
        return Optional.ofNullable(this.lastTimestamp);
    }
    /**
     * The event message
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * The name of the container event.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The event type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerEventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String firstTimestamp;
        private @Nullable String lastTimestamp;
        private @Nullable String message;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerEventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setFirstTimestamp(@Nullable String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }

        public Builder setLastTimestamp(@Nullable String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ContainerEventResponse build() {
            return new ContainerEventResponse(count, firstTimestamp, lastTimestamp, message, name, type);
        }
    }
}
