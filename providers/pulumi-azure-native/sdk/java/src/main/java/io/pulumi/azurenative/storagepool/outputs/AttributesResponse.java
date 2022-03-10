// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class AttributesResponse {
    /**
     * Indicates whether or not authentication is enabled on the ACL.
     * 
     */
    private final Boolean authentication;
    /**
     * Indicates whether or not write protect is enabled on the LUNs.
     * 
     */
    private final Boolean prodModeWriteProtect;

    @OutputCustomType.Constructor
    private AttributesResponse(
        @OutputCustomType.Parameter("authentication") Boolean authentication,
        @OutputCustomType.Parameter("prodModeWriteProtect") Boolean prodModeWriteProtect) {
        this.authentication = authentication;
        this.prodModeWriteProtect = prodModeWriteProtect;
    }

    /**
     * Indicates whether or not authentication is enabled on the ACL.
     * 
    */
    public Boolean getAuthentication() {
        return this.authentication;
    }
    /**
     * Indicates whether or not write protect is enabled on the LUNs.
     * 
    */
    public Boolean getProdModeWriteProtect() {
        return this.prodModeWriteProtect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean authentication;
        private Boolean prodModeWriteProtect;

        public Builder() {
    	      // Empty
        }

        public Builder(AttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.prodModeWriteProtect = defaults.prodModeWriteProtect;
        }

        public Builder setAuthentication(Boolean authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder setProdModeWriteProtect(Boolean prodModeWriteProtect) {
            this.prodModeWriteProtect = Objects.requireNonNull(prodModeWriteProtect);
            return this;
        }
        public AttributesResponse build() {
            return new AttributesResponse(authentication, prodModeWriteProtect);
        }
    }
}
