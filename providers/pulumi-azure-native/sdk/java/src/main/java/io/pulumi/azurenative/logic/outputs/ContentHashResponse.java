// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentHashResponse {
    /**
     * The algorithm of the content hash.
     * 
     */
    private final @Nullable String algorithm;
    /**
     * The value of the content hash.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private ContentHashResponse(
        @OutputCustomType.Parameter("algorithm") @Nullable String algorithm,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.algorithm = algorithm;
        this.value = value;
    }

    /**
     * The algorithm of the content hash.
     * 
    */
    public Optional<String> getAlgorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    /**
     * The value of the content hash.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentHashResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentHashResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.value = defaults.value;
        }

        public Builder setAlgorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ContentHashResponse build() {
            return new ContentHashResponse(algorithm, value);
        }
    }
}
