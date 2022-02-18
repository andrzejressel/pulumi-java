// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomStoreIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreIamMemberState Empty = new DicomStoreIamMemberState();

    @InputImport(name="condition")
    private final @Nullable Input<DicomStoreIamMemberConditionGetArgs> condition;

    public Input<DicomStoreIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="dicomStoreId")
    private final @Nullable Input<String> dicomStoreId;

    public Input<String> getDicomStoreId() {
        return this.dicomStoreId == null ? Input.empty() : this.dicomStoreId;
    }

    /**
     * (Computed) The etag of the DICOM store's IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="member")
    private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public DicomStoreIamMemberState(
        @Nullable Input<DicomStoreIamMemberConditionGetArgs> condition,
        @Nullable Input<String> dicomStoreId,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.dicomStoreId = dicomStoreId;
        this.etag = etag;
        this.member = member;
        this.role = role;
    }

    private DicomStoreIamMemberState() {
        this.condition = Input.empty();
        this.dicomStoreId = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DicomStoreIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> dicomStoreId;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.dicomStoreId = defaults.dicomStoreId;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<DicomStoreIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable DicomStoreIamMemberConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setDicomStoreId(@Nullable Input<String> dicomStoreId) {
            this.dicomStoreId = dicomStoreId;
            return this;
        }

        public Builder setDicomStoreId(@Nullable String dicomStoreId) {
            this.dicomStoreId = Input.ofNullable(dicomStoreId);
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

        public Builder setMember(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder setMember(@Nullable String member) {
            this.member = Input.ofNullable(member);
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

        public DicomStoreIamMemberState build() {
            return new DicomStoreIamMemberState(condition, dicomStoreId, etag, member, role);
        }
    }
}
