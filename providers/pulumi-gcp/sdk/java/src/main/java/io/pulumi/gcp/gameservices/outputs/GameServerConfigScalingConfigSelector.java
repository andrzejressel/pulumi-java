// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GameServerConfigScalingConfigSelector {
    /**
     * Set of labels to group by.
     * 
     */
    private final @Nullable Map<String,String> labels;

    @OutputCustomType.Constructor({"labels"})
    private GameServerConfigScalingConfigSelector(@Nullable Map<String,String> labels) {
        this.labels = labels;
    }

    /**
     * Set of labels to group by.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigScalingConfigSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigScalingConfigSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public GameServerConfigScalingConfigSelector build() {
            return new GameServerConfigScalingConfigSelector(labels);
        }
    }
}
