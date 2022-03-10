// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LinkResponse {
    /**
     * Type of link
     * 
     */
    private final String linkType;
    /**
     * Url of the link
     * 
     */
    private final String linkUrl;

    @OutputCustomType.Constructor
    private LinkResponse(
        @OutputCustomType.Parameter("linkType") String linkType,
        @OutputCustomType.Parameter("linkUrl") String linkUrl) {
        this.linkType = linkType;
        this.linkUrl = linkUrl;
    }

    /**
     * Type of link
     * 
    */
    public String getLinkType() {
        return this.linkType;
    }
    /**
     * Url of the link
     * 
    */
    public String getLinkUrl() {
        return this.linkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String linkType;
        private String linkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkType = defaults.linkType;
    	      this.linkUrl = defaults.linkUrl;
        }

        public Builder setLinkType(String linkType) {
            this.linkType = Objects.requireNonNull(linkType);
            return this;
        }

        public Builder setLinkUrl(String linkUrl) {
            this.linkUrl = Objects.requireNonNull(linkUrl);
            return this;
        }
        public LinkResponse build() {
            return new LinkResponse(linkType, linkUrl);
        }
    }
}
