// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata for any related URL information.
 * 
 */
public final class RelatedUrlResponse extends io.pulumi.resources.InvokeArgs {

    public static final RelatedUrlResponse Empty = new RelatedUrlResponse();

    /**
     * Label to describe usage of the URL.
     * 
     */
    @InputImport(name="label", required=true)
    private final String label;

    public String getLabel() {
        return this.label;
    }

    /**
     * Specific URL associated with the resource.
     * 
     */
    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    public RelatedUrlResponse(
        String label,
        String url) {
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private RelatedUrlResponse() {
        this.label = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelatedUrlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String label;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(RelatedUrlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.url = defaults.url;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public RelatedUrlResponse build() {
            return new RelatedUrlResponse(label, url);
        }
    }
}
