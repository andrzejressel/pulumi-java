// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.folder.inputs.IAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final IAMBindingArgs Empty = new IAMBindingArgs();

    @InputImport(name="condition")
    private final @Nullable Input<IAMBindingConditionArgs> condition;

    public Input<IAMBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     * 
     */
    @InputImport(name="folder", required=true)
    private final Input<String> folder;

    public Input<String> getFolder() {
        return this.folder;
    }

    /**
     * An array of identities that will be granted the privilege in the `role`.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that is associated with a specific Google account. For example, alice@gmail.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * * For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * 
     */
    @InputImport(name="members", required=true)
    private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public IAMBindingArgs(
        @Nullable Input<IAMBindingConditionArgs> condition,
        Input<String> folder,
        Input<List<String>> members,
        Input<String> role) {
        this.condition = condition;
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private IAMBindingArgs() {
        this.condition = Input.empty();
        this.folder = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IAMBindingConditionArgs> condition;
        private Input<String> folder;
        private Input<List<String>> members;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.folder = defaults.folder;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<IAMBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable IAMBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setFolder(Input<String> folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }

        public Builder setFolder(String folder) {
            this.folder = Input.of(Objects.requireNonNull(folder));
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public IAMBindingArgs build() {
            return new IAMBindingArgs(condition, folder, members, role);
        }
    }
}
