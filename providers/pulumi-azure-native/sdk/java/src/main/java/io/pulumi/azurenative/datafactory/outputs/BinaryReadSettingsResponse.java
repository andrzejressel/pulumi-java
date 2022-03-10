// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.TarGZipReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.TarReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.ZipDeflateReadSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BinaryReadSettingsResponse {
    /**
     * Compression settings.
     * 
     */
    private final @Nullable Object compressionProperties;
    /**
     * The read setting type.
     * Expected value is 'BinaryReadSettings'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private BinaryReadSettingsResponse(
        @OutputCustomType.Parameter("compressionProperties") @Nullable Object compressionProperties,
        @OutputCustomType.Parameter("type") String type) {
        this.compressionProperties = compressionProperties;
        this.type = type;
    }

    /**
     * Compression settings.
     * 
    */
    public Optional<Object> getCompressionProperties() {
        return Optional.ofNullable(this.compressionProperties);
    }
    /**
     * The read setting type.
     * Expected value is 'BinaryReadSettings'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BinaryReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object compressionProperties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BinaryReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionProperties = defaults.compressionProperties;
    	      this.type = defaults.type;
        }

        public Builder setCompressionProperties(@Nullable Object compressionProperties) {
            this.compressionProperties = compressionProperties;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public BinaryReadSettingsResponse build() {
            return new BinaryReadSettingsResponse(compressionProperties, type);
        }
    }
}
