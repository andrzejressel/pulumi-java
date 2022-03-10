// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class TagsResponse {
    private final @Nullable Map<String,String> tags;

    @OutputCustomType.Constructor
    private TagsResponse(@OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.tags = tags;
    }

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public TagsResponse build() {
            return new TagsResponse(tags);
        }
    }
}
