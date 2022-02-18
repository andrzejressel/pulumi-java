// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.enums.EgressFromIdentityType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the conditions under which an EgressPolicy matches a request. Conditions based on information about the source of the request. Note that if the destination of the request is also protected by a ServicePerimeter, then that ServicePerimeter must have an IngressPolicy which allows access in order for this request to succeed.
 * 
 */
public final class EgressFromArgs extends io.pulumi.resources.ResourceArgs {

    public static final EgressFromArgs Empty = new EgressFromArgs();

    /**
     * A list of identities that are allowed access through this [EgressPolicy]. Should be in the format of email address. The email address should represent individual user or service account only.
     * 
     */
    @InputImport(name="identities")
    private final @Nullable Input<List<String>> identities;

    public Input<List<String>> getIdentities() {
        return this.identities == null ? Input.empty() : this.identities;
    }

    /**
     * Specifies the type of identities that are allowed access to outside the perimeter. If left unspecified, then members of `identities` field will be allowed access.
     * 
     */
    @InputImport(name="identityType")
    private final @Nullable Input<EgressFromIdentityType> identityType;

    public Input<EgressFromIdentityType> getIdentityType() {
        return this.identityType == null ? Input.empty() : this.identityType;
    }

    public EgressFromArgs(
        @Nullable Input<List<String>> identities,
        @Nullable Input<EgressFromIdentityType> identityType) {
        this.identities = identities;
        this.identityType = identityType;
    }

    private EgressFromArgs() {
        this.identities = Input.empty();
        this.identityType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EgressFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> identities;
        private @Nullable Input<EgressFromIdentityType> identityType;

        public Builder() {
    	      // Empty
        }

        public Builder(EgressFromArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
        }

        public Builder setIdentities(@Nullable Input<List<String>> identities) {
            this.identities = identities;
            return this;
        }

        public Builder setIdentities(@Nullable List<String> identities) {
            this.identities = Input.ofNullable(identities);
            return this;
        }

        public Builder setIdentityType(@Nullable Input<EgressFromIdentityType> identityType) {
            this.identityType = identityType;
            return this;
        }

        public Builder setIdentityType(@Nullable EgressFromIdentityType identityType) {
            this.identityType = Input.ofNullable(identityType);
            return this;
        }

        public EgressFromArgs build() {
            return new EgressFromArgs(identities, identityType);
        }
    }
}
