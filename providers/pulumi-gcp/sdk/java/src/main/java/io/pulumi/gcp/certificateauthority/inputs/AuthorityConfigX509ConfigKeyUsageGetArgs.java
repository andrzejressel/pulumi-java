// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigKeyUsageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigKeyUsageGetArgs Empty = new AuthorityConfigX509ConfigKeyUsageGetArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="baseKeyUsage", required=true)
    private final Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;

    public Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> getBaseKeyUsage() {
        return this.baseKeyUsage;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="extendedKeyUsage", required=true)
    private final Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;

    public Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> getExtendedKeyUsage() {
        return this.extendedKeyUsage;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    @InputImport(name="unknownExtendedKeyUsages")
    private final @Nullable Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

    public Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Input.empty() : this.unknownExtendedKeyUsages;
    }

    public AuthorityConfigX509ConfigKeyUsageGetArgs(
        Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage,
        Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage,
        @Nullable Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage, "expected parameter 'baseKeyUsage' to be non-null");
        this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage, "expected parameter 'extendedKeyUsage' to be non-null");
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private AuthorityConfigX509ConfigKeyUsageGetArgs() {
        this.baseKeyUsage = Input.empty();
        this.extendedKeyUsage = Input.empty();
        this.unknownExtendedKeyUsages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;
        private Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;
        private @Nullable Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigKeyUsageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsage(Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }

        public Builder setBaseKeyUsage(AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs baseKeyUsage) {
            this.baseKeyUsage = Input.of(Objects.requireNonNull(baseKeyUsage));
            return this;
        }

        public Builder setExtendedKeyUsage(Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }

        public Builder setExtendedKeyUsage(AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs extendedKeyUsage) {
            this.extendedKeyUsage = Input.of(Objects.requireNonNull(extendedKeyUsage));
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Input.ofNullable(unknownExtendedKeyUsages);
            return this;
        }

        public AuthorityConfigX509ConfigKeyUsageGetArgs build() {
            return new AuthorityConfigX509ConfigKeyUsageGetArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
