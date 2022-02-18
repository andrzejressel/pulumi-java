// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a sub PublicDelegatedPrefix.
 * 
 */
public final class PublicDelegatedPrefixPublicDelegatedSubPrefixArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicDelegatedPrefixPublicDelegatedSubPrefixArgs Empty = new PublicDelegatedPrefixPublicDelegatedSubPrefixArgs();

    /**
     * Name of the project scoping this PublicDelegatedSubPrefix.
     * 
     */
    @InputImport(name="delegateeProject")
    private final @Nullable Input<String> delegateeProject;

    public Input<String> getDelegateeProject() {
        return this.delegateeProject == null ? Input.empty() : this.delegateeProject;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
     * 
     */
    @InputImport(name="ipCidrRange")
    private final @Nullable Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Input.empty() : this.ipCidrRange;
    }

    /**
     * Whether the sub prefix is delegated to create Address resources in the delegatee project.
     * 
     */
    @InputImport(name="isAddress")
    private final @Nullable Input<Boolean> isAddress;

    public Input<Boolean> getIsAddress() {
        return this.isAddress == null ? Input.empty() : this.isAddress;
    }

    /**
     * The name of the sub public delegated prefix.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public PublicDelegatedPrefixPublicDelegatedSubPrefixArgs(
        @Nullable Input<String> delegateeProject,
        @Nullable Input<String> description,
        @Nullable Input<String> ipCidrRange,
        @Nullable Input<Boolean> isAddress,
        @Nullable Input<String> name) {
        this.delegateeProject = delegateeProject;
        this.description = description;
        this.ipCidrRange = ipCidrRange;
        this.isAddress = isAddress;
        this.name = name;
    }

    private PublicDelegatedPrefixPublicDelegatedSubPrefixArgs() {
        this.delegateeProject = Input.empty();
        this.description = Input.empty();
        this.ipCidrRange = Input.empty();
        this.isAddress = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> delegateeProject;
        private @Nullable Input<String> description;
        private @Nullable Input<String> ipCidrRange;
        private @Nullable Input<Boolean> isAddress;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegateeProject = defaults.delegateeProject;
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isAddress = defaults.isAddress;
    	      this.name = defaults.name;
        }

        public Builder setDelegateeProject(@Nullable Input<String> delegateeProject) {
            this.delegateeProject = delegateeProject;
            return this;
        }

        public Builder setDelegateeProject(@Nullable String delegateeProject) {
            this.delegateeProject = Input.ofNullable(delegateeProject);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIpCidrRange(@Nullable Input<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder setIpCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Input.ofNullable(ipCidrRange);
            return this;
        }

        public Builder setIsAddress(@Nullable Input<Boolean> isAddress) {
            this.isAddress = isAddress;
            return this;
        }

        public Builder setIsAddress(@Nullable Boolean isAddress) {
            this.isAddress = Input.ofNullable(isAddress);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public PublicDelegatedPrefixPublicDelegatedSubPrefixArgs build() {
            return new PublicDelegatedPrefixPublicDelegatedSubPrefixArgs(delegateeProject, description, ipCidrRange, isAddress, name);
        }
    }
}
