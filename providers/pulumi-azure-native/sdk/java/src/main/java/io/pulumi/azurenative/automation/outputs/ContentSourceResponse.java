// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.ContentHashResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentSourceResponse {
    /**
     * Gets or sets the hash.
     * 
     */
    private final @Nullable ContentHashResponse hash;
    /**
     * Gets or sets the content source type.
     * 
     */
    private final @Nullable String type;
    /**
     * Gets or sets the value of the content. This is based on the content source type.
     * 
     */
    private final @Nullable String value;
    /**
     * Gets or sets the version of the content.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private ContentSourceResponse(
        @OutputCustomType.Parameter("hash") @Nullable ContentHashResponse hash,
        @OutputCustomType.Parameter("type") @Nullable String type,
        @OutputCustomType.Parameter("value") @Nullable String value,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.hash = hash;
        this.type = type;
        this.value = value;
        this.version = version;
    }

    /**
     * Gets or sets the hash.
     * 
    */
    public Optional<ContentHashResponse> getHash() {
        return Optional.ofNullable(this.hash);
    }
    /**
     * Gets or sets the content source type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Gets or sets the value of the content. This is based on the content source type.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }
    /**
     * Gets or sets the version of the content.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContentHashResponse hash;
        private @Nullable String type;
        private @Nullable String value;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hash = defaults.hash;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
    	      this.version = defaults.version;
        }

        public Builder setHash(@Nullable ContentHashResponse hash) {
            this.hash = hash;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ContentSourceResponse build() {
            return new ContentSourceResponse(hash, type, value, version);
        }
    }
}
