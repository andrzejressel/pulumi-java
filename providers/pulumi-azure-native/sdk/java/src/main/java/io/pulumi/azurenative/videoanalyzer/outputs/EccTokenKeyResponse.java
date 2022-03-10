// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EccTokenKeyResponse {
    /**
     * Elliptical curve algorithm to be used: ES256, ES384 or ES512.
     * 
     */
    private final String alg;
    /**
     * JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
     */
    private final String kid;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EccTokenKey'.
     * 
     */
    private final String type;
    /**
     * X coordinate.
     * 
     */
    private final String x;
    /**
     * Y coordinate.
     * 
     */
    private final String y;

    @OutputCustomType.Constructor
    private EccTokenKeyResponse(
        @OutputCustomType.Parameter("alg") String alg,
        @OutputCustomType.Parameter("kid") String kid,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("x") String x,
        @OutputCustomType.Parameter("y") String y) {
        this.alg = alg;
        this.kid = kid;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    /**
     * Elliptical curve algorithm to be used: ES256, ES384 or ES512.
     * 
    */
    public String getAlg() {
        return this.alg;
    }
    /**
     * JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
    */
    public String getKid() {
        return this.kid;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EccTokenKey'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * X coordinate.
     * 
    */
    public String getX() {
        return this.x;
    }
    /**
     * Y coordinate.
     * 
    */
    public String getY() {
        return this.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EccTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alg;
        private String kid;
        private String type;
        private String x;
        private String y;

        public Builder() {
    	      // Empty
        }

        public Builder(EccTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.kid = defaults.kid;
    	      this.type = defaults.type;
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder setAlg(String alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }

        public Builder setKid(String kid) {
            this.kid = Objects.requireNonNull(kid);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setX(String x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }

        public Builder setY(String y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }
        public EccTokenKeyResponse build() {
            return new EccTokenKeyResponse(alg, kid, type, x, y);
        }
    }
}
