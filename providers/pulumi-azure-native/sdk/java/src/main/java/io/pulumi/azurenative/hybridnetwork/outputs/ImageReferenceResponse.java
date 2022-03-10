// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageReferenceResponse {
    /**
     * Specifies in decimal numbers, the exact version of image used to create the virtual machine.
     * 
     */
    private final @Nullable String exactVersion;
    /**
     * Specifies the offer of the image used to create the virtual machine.
     * 
     */
    private final @Nullable String offer;
    /**
     * The image publisher.
     * 
     */
    private final @Nullable String publisher;
    /**
     * The image SKU.
     * 
     */
    private final @Nullable String sku;
    /**
     * Specifies the version of the image used to create the virtual machine. The allowed formats are Major.Minor.Build or 'latest'. Major, Minor, and Build are decimal numbers. Specify 'latest' to use the latest version of an image available at deploy time. Even if you use 'latest', the VM image will not automatically update after deploy time even if a new version becomes available.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private ImageReferenceResponse(
        @OutputCustomType.Parameter("exactVersion") @Nullable String exactVersion,
        @OutputCustomType.Parameter("offer") @Nullable String offer,
        @OutputCustomType.Parameter("publisher") @Nullable String publisher,
        @OutputCustomType.Parameter("sku") @Nullable String sku,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.exactVersion = exactVersion;
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    /**
     * Specifies in decimal numbers, the exact version of image used to create the virtual machine.
     * 
    */
    public Optional<String> getExactVersion() {
        return Optional.ofNullable(this.exactVersion);
    }
    /**
     * Specifies the offer of the image used to create the virtual machine.
     * 
    */
    public Optional<String> getOffer() {
        return Optional.ofNullable(this.offer);
    }
    /**
     * The image publisher.
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * The image SKU.
     * 
    */
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Specifies the version of the image used to create the virtual machine. The allowed formats are Major.Minor.Build or 'latest'. Major, Minor, and Build are decimal numbers. Specify 'latest' to use the latest version of an image available at deploy time. Even if you use 'latest', the VM image will not automatically update after deploy time even if a new version becomes available.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exactVersion;
        private @Nullable String offer;
        private @Nullable String publisher;
        private @Nullable String sku;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactVersion = defaults.exactVersion;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder setExactVersion(@Nullable String exactVersion) {
            this.exactVersion = exactVersion;
            return this;
        }

        public Builder setOffer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ImageReferenceResponse build() {
            return new ImageReferenceResponse(exactVersion, offer, publisher, sku, version);
        }
    }
}
