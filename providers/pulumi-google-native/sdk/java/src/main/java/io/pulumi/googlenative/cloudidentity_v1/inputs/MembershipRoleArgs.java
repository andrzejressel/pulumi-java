// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudidentity_v1.inputs.ExpiryDetailArgs;
import io.pulumi.googlenative.cloudidentity_v1.inputs.RestrictionEvaluationsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A membership role within the Cloud Identity Groups API. A `MembershipRole` defines the privileges granted to a `Membership`.
 * 
 */
public final class MembershipRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipRoleArgs Empty = new MembershipRoleArgs();

    /**
     * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
     * 
     */
    @InputImport(name="expiryDetail")
    private final @Nullable Input<ExpiryDetailArgs> expiryDetail;

    public Input<ExpiryDetailArgs> getExpiryDetail() {
        return this.expiryDetail == null ? Input.empty() : this.expiryDetail;
    }

    /**
     * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Evaluations of restrictions applied to parent group on this membership.
     * 
     */
    @InputImport(name="restrictionEvaluations")
    private final @Nullable Input<RestrictionEvaluationsArgs> restrictionEvaluations;

    public Input<RestrictionEvaluationsArgs> getRestrictionEvaluations() {
        return this.restrictionEvaluations == null ? Input.empty() : this.restrictionEvaluations;
    }

    public MembershipRoleArgs(
        @Nullable Input<ExpiryDetailArgs> expiryDetail,
        @Nullable Input<String> name,
        @Nullable Input<RestrictionEvaluationsArgs> restrictionEvaluations) {
        this.expiryDetail = expiryDetail;
        this.name = name;
        this.restrictionEvaluations = restrictionEvaluations;
    }

    private MembershipRoleArgs() {
        this.expiryDetail = Input.empty();
        this.name = Input.empty();
        this.restrictionEvaluations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExpiryDetailArgs> expiryDetail;
        private @Nullable Input<String> name;
        private @Nullable Input<RestrictionEvaluationsArgs> restrictionEvaluations;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryDetail = defaults.expiryDetail;
    	      this.name = defaults.name;
    	      this.restrictionEvaluations = defaults.restrictionEvaluations;
        }

        public Builder setExpiryDetail(@Nullable Input<ExpiryDetailArgs> expiryDetail) {
            this.expiryDetail = expiryDetail;
            return this;
        }

        public Builder setExpiryDetail(@Nullable ExpiryDetailArgs expiryDetail) {
            this.expiryDetail = Input.ofNullable(expiryDetail);
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

        public Builder setRestrictionEvaluations(@Nullable Input<RestrictionEvaluationsArgs> restrictionEvaluations) {
            this.restrictionEvaluations = restrictionEvaluations;
            return this;
        }

        public Builder setRestrictionEvaluations(@Nullable RestrictionEvaluationsArgs restrictionEvaluations) {
            this.restrictionEvaluations = Input.ofNullable(restrictionEvaluations);
            return this;
        }

        public MembershipRoleArgs build() {
            return new MembershipRoleArgs(expiryDetail, name, restrictionEvaluations);
        }
    }
}
