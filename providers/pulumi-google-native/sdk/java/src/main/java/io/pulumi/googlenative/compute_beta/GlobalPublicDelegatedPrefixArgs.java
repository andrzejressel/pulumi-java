// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.PublicDelegatedPrefixPublicDelegatedSubPrefixArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalPublicDelegatedPrefixArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalPublicDelegatedPrefixArgs Empty = new GlobalPublicDelegatedPrefixArgs();

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
     * The IPv4 address range, in CIDR format, represented by this public delegated prefix.
     * 
     */
    @InputImport(name="ipCidrRange")
    private final @Nullable Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Input.empty() : this.ipCidrRange;
    }

    /**
     * If true, the prefix will be live migrated.
     * 
     */
    @InputImport(name="isLiveMigration")
    private final @Nullable Input<Boolean> isLiveMigration;

    public Input<Boolean> getIsLiveMigration() {
        return this.isLiveMigration == null ? Input.empty() : this.isLiveMigration;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
     * 
     */
    @InputImport(name="parentPrefix")
    private final @Nullable Input<String> parentPrefix;

    public Input<String> getParentPrefix() {
        return this.parentPrefix == null ? Input.empty() : this.parentPrefix;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The list of sub public delegated prefixes that exist for this public delegated prefix.
     * 
     */
    @InputImport(name="publicDelegatedSubPrefixs")
    private final @Nullable Input<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs;

    public Input<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> getPublicDelegatedSubPrefixs() {
        return this.publicDelegatedSubPrefixs == null ? Input.empty() : this.publicDelegatedSubPrefixs;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    public GlobalPublicDelegatedPrefixArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> ipCidrRange,
        @Nullable Input<Boolean> isLiveMigration,
        @Nullable Input<String> name,
        @Nullable Input<String> parentPrefix,
        @Nullable Input<String> project,
        @Nullable Input<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs,
        @Nullable Input<String> requestId) {
        this.description = description;
        this.ipCidrRange = ipCidrRange;
        this.isLiveMigration = isLiveMigration;
        this.name = name;
        this.parentPrefix = parentPrefix;
        this.project = project;
        this.publicDelegatedSubPrefixs = publicDelegatedSubPrefixs;
        this.requestId = requestId;
    }

    private GlobalPublicDelegatedPrefixArgs() {
        this.description = Input.empty();
        this.ipCidrRange = Input.empty();
        this.isLiveMigration = Input.empty();
        this.name = Input.empty();
        this.parentPrefix = Input.empty();
        this.project = Input.empty();
        this.publicDelegatedSubPrefixs = Input.empty();
        this.requestId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalPublicDelegatedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> ipCidrRange;
        private @Nullable Input<Boolean> isLiveMigration;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parentPrefix;
        private @Nullable Input<String> project;
        private @Nullable Input<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs;
        private @Nullable Input<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalPublicDelegatedPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isLiveMigration = defaults.isLiveMigration;
    	      this.name = defaults.name;
    	      this.parentPrefix = defaults.parentPrefix;
    	      this.project = defaults.project;
    	      this.publicDelegatedSubPrefixs = defaults.publicDelegatedSubPrefixs;
    	      this.requestId = defaults.requestId;
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

        public Builder setIsLiveMigration(@Nullable Input<Boolean> isLiveMigration) {
            this.isLiveMigration = isLiveMigration;
            return this;
        }

        public Builder setIsLiveMigration(@Nullable Boolean isLiveMigration) {
            this.isLiveMigration = Input.ofNullable(isLiveMigration);
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

        public Builder setParentPrefix(@Nullable Input<String> parentPrefix) {
            this.parentPrefix = parentPrefix;
            return this;
        }

        public Builder setParentPrefix(@Nullable String parentPrefix) {
            this.parentPrefix = Input.ofNullable(parentPrefix);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPublicDelegatedSubPrefixs(@Nullable Input<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs) {
            this.publicDelegatedSubPrefixs = publicDelegatedSubPrefixs;
            return this;
        }

        public Builder setPublicDelegatedSubPrefixs(@Nullable List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs> publicDelegatedSubPrefixs) {
            this.publicDelegatedSubPrefixs = Input.ofNullable(publicDelegatedSubPrefixs);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public GlobalPublicDelegatedPrefixArgs build() {
            return new GlobalPublicDelegatedPrefixArgs(description, ipCidrRange, isLiveMigration, name, parentPrefix, project, publicDelegatedSubPrefixs, requestId);
        }
    }
}
