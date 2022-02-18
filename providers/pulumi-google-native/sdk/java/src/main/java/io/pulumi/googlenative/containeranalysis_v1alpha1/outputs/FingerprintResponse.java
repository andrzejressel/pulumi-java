// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FingerprintResponse {
    /**
     * The layer-id of the final layer in the Docker image's v1 representation. This field can be used as a filter in list requests.
     * 
     */
    private final String v1Name;
    /**
     * The ordered list of v2 blobs that represent a given image.
     * 
     */
    private final List<String> v2Blob;
    /**
     * The name of the image's v2 blobs computed via: [bottom] := v2_blobbottom := sha256(v2_blob[N] + " " + v2_name[N+1]) Only the name of the final blob is kept. This field can be used as a filter in list requests.
     * 
     */
    private final String v2Name;

    @OutputCustomType.Constructor({"v1Name","v2Blob","v2Name"})
    private FingerprintResponse(
        String v1Name,
        List<String> v2Blob,
        String v2Name) {
        this.v1Name = Objects.requireNonNull(v1Name);
        this.v2Blob = Objects.requireNonNull(v2Blob);
        this.v2Name = Objects.requireNonNull(v2Name);
    }

    /**
     * The layer-id of the final layer in the Docker image's v1 representation. This field can be used as a filter in list requests.
     * 
     */
    public String getV1Name() {
        return this.v1Name;
    }
    /**
     * The ordered list of v2 blobs that represent a given image.
     * 
     */
    public List<String> getV2Blob() {
        return this.v2Blob;
    }
    /**
     * The name of the image's v2 blobs computed via: [bottom] := v2_blobbottom := sha256(v2_blob[N] + " " + v2_name[N+1]) Only the name of the final blob is kept. This field can be used as a filter in list requests.
     * 
     */
    public String getV2Name() {
        return this.v2Name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FingerprintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String v1Name;
        private List<String> v2Blob;
        private String v2Name;

        public Builder() {
    	      // Empty
        }

        public Builder(FingerprintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.v1Name = defaults.v1Name;
    	      this.v2Blob = defaults.v2Blob;
    	      this.v2Name = defaults.v2Name;
        }

        public Builder setV1Name(String v1Name) {
            this.v1Name = Objects.requireNonNull(v1Name);
            return this;
        }

        public Builder setV2Blob(List<String> v2Blob) {
            this.v2Blob = Objects.requireNonNull(v2Blob);
            return this;
        }

        public Builder setV2Name(String v2Name) {
            this.v2Name = Objects.requireNonNull(v2Name);
            return this;
        }

        public FingerprintResponse build() {
            return new FingerprintResponse(v1Name, v2Blob, v2Name);
        }
    }
}
