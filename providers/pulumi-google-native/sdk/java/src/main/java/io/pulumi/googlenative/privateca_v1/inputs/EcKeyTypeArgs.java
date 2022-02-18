// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.enums.EcKeyTypeSignatureAlgorithm;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an Elliptic Curve key that may be used in a Certificate issued from a CaPool.
 * 
 */
public final class EcKeyTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final EcKeyTypeArgs Empty = new EcKeyTypeArgs();

    /**
     * Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed.
     * 
     */
    @InputImport(name="signatureAlgorithm")
    private final @Nullable Input<EcKeyTypeSignatureAlgorithm> signatureAlgorithm;

    public Input<EcKeyTypeSignatureAlgorithm> getSignatureAlgorithm() {
        return this.signatureAlgorithm == null ? Input.empty() : this.signatureAlgorithm;
    }

    public EcKeyTypeArgs(@Nullable Input<EcKeyTypeSignatureAlgorithm> signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    private EcKeyTypeArgs() {
        this.signatureAlgorithm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcKeyTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EcKeyTypeSignatureAlgorithm> signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(EcKeyTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder setSignatureAlgorithm(@Nullable Input<EcKeyTypeSignatureAlgorithm> signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        public Builder setSignatureAlgorithm(@Nullable EcKeyTypeSignatureAlgorithm signatureAlgorithm) {
            this.signatureAlgorithm = Input.ofNullable(signatureAlgorithm);
            return this;
        }

        public EcKeyTypeArgs build() {
            return new EcKeyTypeArgs(signatureAlgorithm);
        }
    }
}
