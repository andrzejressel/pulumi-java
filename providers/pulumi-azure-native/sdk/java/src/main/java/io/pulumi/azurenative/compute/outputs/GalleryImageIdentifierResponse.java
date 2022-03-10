// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GalleryImageIdentifierResponse {
    /**
     * The name of the gallery image definition offer.
     * 
     */
    private final String offer;
    /**
     * The name of the gallery image definition publisher.
     * 
     */
    private final String publisher;
    /**
     * The name of the gallery image definition SKU.
     * 
     */
    private final String sku;

    @OutputCustomType.Constructor
    private GalleryImageIdentifierResponse(
        @OutputCustomType.Parameter("offer") String offer,
        @OutputCustomType.Parameter("publisher") String publisher,
        @OutputCustomType.Parameter("sku") String sku) {
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
    }

    /**
     * The name of the gallery image definition offer.
     * 
    */
    public String getOffer() {
        return this.offer;
    }
    /**
     * The name of the gallery image definition publisher.
     * 
    */
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * The name of the gallery image definition SKU.
     * 
    */
    public String getSku() {
        return this.sku;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String offer;
        private String publisher;
        private String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
        }

        public Builder setOffer(String offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public GalleryImageIdentifierResponse build() {
            return new GalleryImageIdentifierResponse(offer, publisher, sku);
        }
    }
}
