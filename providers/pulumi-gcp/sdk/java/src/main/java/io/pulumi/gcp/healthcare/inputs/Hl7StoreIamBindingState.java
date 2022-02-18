// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreIamBindingState Empty = new Hl7StoreIamBindingState();

    @InputImport(name="condition")
    private final @Nullable Input<Hl7StoreIamBindingConditionGetArgs> condition;

    public Input<Hl7StoreIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the HL7v2 store's IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="hl7V2StoreId")
    private final @Nullable Input<String> hl7V2StoreId;

    public Input<String> getHl7V2StoreId() {
        return this.hl7V2StoreId == null ? Input.empty() : this.hl7V2StoreId;
    }

    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public Hl7StoreIamBindingState(
        @Nullable Input<Hl7StoreIamBindingConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> hl7V2StoreId,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.hl7V2StoreId = hl7V2StoreId;
        this.members = members;
        this.role = role;
    }

    private Hl7StoreIamBindingState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.hl7V2StoreId = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Hl7StoreIamBindingConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> hl7V2StoreId;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<Hl7StoreIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable Hl7StoreIamBindingConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setHl7V2StoreId(@Nullable Input<String> hl7V2StoreId) {
            this.hl7V2StoreId = hl7V2StoreId;
            return this;
        }

        public Builder setHl7V2StoreId(@Nullable String hl7V2StoreId) {
            this.hl7V2StoreId = Input.ofNullable(hl7V2StoreId);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Hl7StoreIamBindingState build() {
            return new Hl7StoreIamBindingState(condition, etag, hl7V2StoreId, members, role);
        }
    }
}
