// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ExtendedKeyUsageOptionsResponse;
import io.pulumi.googlenative.privateca_v1beta1.inputs.KeyUsageOptionsResponse;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ObjectIdResponse;
import java.util.List;
import java.util.Objects;


/**
 * A KeyUsage describes key usage values that may appear in an X.509 certificate.
 * 
 */
public final class KeyUsageResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyUsageResponse Empty = new KeyUsageResponse();

    /**
     * Describes high-level ways in which a key may be used.
     * 
     */
    @InputImport(name="baseKeyUsage", required=true)
    private final KeyUsageOptionsResponse baseKeyUsage;

    public KeyUsageOptionsResponse getBaseKeyUsage() {
        return this.baseKeyUsage;
    }

    /**
     * Detailed scenarios in which a key may be used.
     * 
     */
    @InputImport(name="extendedKeyUsage", required=true)
    private final ExtendedKeyUsageOptionsResponse extendedKeyUsage;

    public ExtendedKeyUsageOptionsResponse getExtendedKeyUsage() {
        return this.extendedKeyUsage;
    }

    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    @InputImport(name="unknownExtendedKeyUsages", required=true)
    private final List<ObjectIdResponse> unknownExtendedKeyUsages;

    public List<ObjectIdResponse> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages;
    }

    public KeyUsageResponse(
        KeyUsageOptionsResponse baseKeyUsage,
        ExtendedKeyUsageOptionsResponse extendedKeyUsage,
        List<ObjectIdResponse> unknownExtendedKeyUsages) {
        this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage, "expected parameter 'baseKeyUsage' to be non-null");
        this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage, "expected parameter 'extendedKeyUsage' to be non-null");
        this.unknownExtendedKeyUsages = Objects.requireNonNull(unknownExtendedKeyUsages, "expected parameter 'unknownExtendedKeyUsages' to be non-null");
    }

    private KeyUsageResponse() {
        this.baseKeyUsage = null;
        this.extendedKeyUsage = null;
        this.unknownExtendedKeyUsages = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyUsageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyUsageOptionsResponse baseKeyUsage;
        private ExtendedKeyUsageOptionsResponse extendedKeyUsage;
        private List<ObjectIdResponse> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyUsageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsage(KeyUsageOptionsResponse baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }

        public Builder setExtendedKeyUsage(ExtendedKeyUsageOptionsResponse extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(List<ObjectIdResponse> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Objects.requireNonNull(unknownExtendedKeyUsages);
            return this;
        }

        public KeyUsageResponse build() {
            return new KeyUsageResponse(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
