// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.DatasetAccessEntryArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.RoutineReferenceArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetAccessItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetAccessItemArgs Empty = new DatasetAccessItemArgs();

    /**
     * [Pick one] A grant authorizing all resources of a particular type in a particular dataset access to this dataset. Only views are supported for now. The role field is not required when this field is set. If that dataset is deleted and re-created, its access needs to be granted again via an update operation.
     * 
     */
    @InputImport(name="dataset")
    private final @Nullable Input<DatasetAccessEntryArgs> dataset;

    public Input<DatasetAccessEntryArgs> getDataset() {
        return this.dataset == null ? Input.empty() : this.dataset;
    }

    /**
     * [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: "example.com". Maps to IAM policy member "domain:DOMAIN".
     * 
     */
    @InputImport(name="domain")
    private final @Nullable Input<String> domain;

    public Input<String> getDomain() {
        return this.domain == null ? Input.empty() : this.domain;
    }

    /**
     * [Pick one] An email address of a Google Group to grant access to. Maps to IAM policy member "group:GROUP".
     * 
     */
    @InputImport(name="groupByEmail")
    private final @Nullable Input<String> groupByEmail;

    public Input<String> getGroupByEmail() {
        return this.groupByEmail == null ? Input.empty() : this.groupByEmail;
    }

    /**
     * [Pick one] Some other type of member that appears in the IAM Policy but isn't a user, group, domain, or special group.
     * 
     */
    @InputImport(name="iamMember")
    private final @Nullable Input<String> iamMember;

    public Input<String> getIamMember() {
        return this.iamMember == null ? Input.empty() : this.iamMember;
    }

    /**
     * [Required] An IAM role ID that should be granted to the user, group, or domain specified in this access entry. The following legacy mappings will be applied: OWNER  roles/bigquery.dataOwner WRITER  roles/bigquery.dataEditor READER  roles/bigquery.dataViewer This field will accept any of the above formats, but will return only the legacy format. For example, if you set this field to "roles/bigquery.dataOwner", it will be returned back as "OWNER".
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * [Pick one] A routine from a different dataset to grant access to. Queries executed against that routine will have read access to views/tables/routines in this dataset. Only UDF is supported for now. The role field is not required when this field is set. If that routine is updated by any user, access to the routine needs to be granted again via an update operation.
     * 
     */
    @InputImport(name="routine")
    private final @Nullable Input<RoutineReferenceArgs> routine;

    public Input<RoutineReferenceArgs> getRoutine() {
        return this.routine == null ? Input.empty() : this.routine;
    }

    /**
     * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users. Maps to similarly-named IAM members.
     * 
     */
    @InputImport(name="specialGroup")
    private final @Nullable Input<String> specialGroup;

    public Input<String> getSpecialGroup() {
        return this.specialGroup == null ? Input.empty() : this.specialGroup;
    }

    /**
     * [Pick one] An email address of a user to grant access to. For example: fred@example.com. Maps to IAM policy member "user:EMAIL" or "serviceAccount:EMAIL".
     * 
     */
    @InputImport(name="userByEmail")
    private final @Nullable Input<String> userByEmail;

    public Input<String> getUserByEmail() {
        return this.userByEmail == null ? Input.empty() : this.userByEmail;
    }

    /**
     * [Pick one] A view from a different dataset to grant access to. Queries executed against that view will have read access to tables in this dataset. The role field is not required when this field is set. If that view is updated by any user, access to the view needs to be granted again via an update operation.
     * 
     */
    @InputImport(name="view")
    private final @Nullable Input<TableReferenceArgs> view;

    public Input<TableReferenceArgs> getView() {
        return this.view == null ? Input.empty() : this.view;
    }

    public DatasetAccessItemArgs(
        @Nullable Input<DatasetAccessEntryArgs> dataset,
        @Nullable Input<String> domain,
        @Nullable Input<String> groupByEmail,
        @Nullable Input<String> iamMember,
        @Nullable Input<String> role,
        @Nullable Input<RoutineReferenceArgs> routine,
        @Nullable Input<String> specialGroup,
        @Nullable Input<String> userByEmail,
        @Nullable Input<TableReferenceArgs> view) {
        this.dataset = dataset;
        this.domain = domain;
        this.groupByEmail = groupByEmail;
        this.iamMember = iamMember;
        this.role = role;
        this.routine = routine;
        this.specialGroup = specialGroup;
        this.userByEmail = userByEmail;
        this.view = view;
    }

    private DatasetAccessItemArgs() {
        this.dataset = Input.empty();
        this.domain = Input.empty();
        this.groupByEmail = Input.empty();
        this.iamMember = Input.empty();
        this.role = Input.empty();
        this.routine = Input.empty();
        this.specialGroup = Input.empty();
        this.userByEmail = Input.empty();
        this.view = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccessItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetAccessEntryArgs> dataset;
        private @Nullable Input<String> domain;
        private @Nullable Input<String> groupByEmail;
        private @Nullable Input<String> iamMember;
        private @Nullable Input<String> role;
        private @Nullable Input<RoutineReferenceArgs> routine;
        private @Nullable Input<String> specialGroup;
        private @Nullable Input<String> userByEmail;
        private @Nullable Input<TableReferenceArgs> view;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccessItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.domain = defaults.domain;
    	      this.groupByEmail = defaults.groupByEmail;
    	      this.iamMember = defaults.iamMember;
    	      this.role = defaults.role;
    	      this.routine = defaults.routine;
    	      this.specialGroup = defaults.specialGroup;
    	      this.userByEmail = defaults.userByEmail;
    	      this.view = defaults.view;
        }

        public Builder setDataset(@Nullable Input<DatasetAccessEntryArgs> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder setDataset(@Nullable DatasetAccessEntryArgs dataset) {
            this.dataset = Input.ofNullable(dataset);
            return this;
        }

        public Builder setDomain(@Nullable Input<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = Input.ofNullable(domain);
            return this;
        }

        public Builder setGroupByEmail(@Nullable Input<String> groupByEmail) {
            this.groupByEmail = groupByEmail;
            return this;
        }

        public Builder setGroupByEmail(@Nullable String groupByEmail) {
            this.groupByEmail = Input.ofNullable(groupByEmail);
            return this;
        }

        public Builder setIamMember(@Nullable Input<String> iamMember) {
            this.iamMember = iamMember;
            return this;
        }

        public Builder setIamMember(@Nullable String iamMember) {
            this.iamMember = Input.ofNullable(iamMember);
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

        public Builder setRoutine(@Nullable Input<RoutineReferenceArgs> routine) {
            this.routine = routine;
            return this;
        }

        public Builder setRoutine(@Nullable RoutineReferenceArgs routine) {
            this.routine = Input.ofNullable(routine);
            return this;
        }

        public Builder setSpecialGroup(@Nullable Input<String> specialGroup) {
            this.specialGroup = specialGroup;
            return this;
        }

        public Builder setSpecialGroup(@Nullable String specialGroup) {
            this.specialGroup = Input.ofNullable(specialGroup);
            return this;
        }

        public Builder setUserByEmail(@Nullable Input<String> userByEmail) {
            this.userByEmail = userByEmail;
            return this;
        }

        public Builder setUserByEmail(@Nullable String userByEmail) {
            this.userByEmail = Input.ofNullable(userByEmail);
            return this;
        }

        public Builder setView(@Nullable Input<TableReferenceArgs> view) {
            this.view = view;
            return this;
        }

        public Builder setView(@Nullable TableReferenceArgs view) {
            this.view = Input.ofNullable(view);
            return this;
        }

        public DatasetAccessItemArgs build() {
            return new DatasetAccessItemArgs(dataset, domain, groupByEmail, iamMember, role, routine, specialGroup, userByEmail, view);
        }
    }
}
