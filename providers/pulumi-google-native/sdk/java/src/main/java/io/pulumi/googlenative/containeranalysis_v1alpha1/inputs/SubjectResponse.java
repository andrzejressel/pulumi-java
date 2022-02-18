// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Subject refers to the subject of the intoto statement
 * 
 */
public final class SubjectResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubjectResponse Empty = new SubjectResponse();

    /**
     * "": "" Algorithms can be e.g. sha256, sha512 See https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * 
     */
    @InputImport(name="digest", required=true)
    private final Map<String,String> digest;

    public Map<String,String> getDigest() {
        return this.digest;
    }

    /**
     * name is the name of the Subject used here
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public SubjectResponse(
        Map<String,String> digest,
        String name) {
        this.digest = Objects.requireNonNull(digest, "expected parameter 'digest' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SubjectResponse() {
        this.digest = Map.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> digest;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.name = defaults.name;
        }

        public Builder setDigest(Map<String,String> digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public SubjectResponse build() {
            return new SubjectResponse(digest, name);
        }
    }
}
