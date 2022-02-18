// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderState extends io.pulumi.resources.ResourceArgs {

    public static final FolderState Empty = new FolderState();

    /**
     * Timestamp when the Folder was created. Assigned by the server.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * The folder’s display name.
     * A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The folder id from the name "folders/{folder_id}"
     * 
     */
    @InputImport(name="folderId")
    private final @Nullable Input<String> folderId;

    public Input<String> getFolderId() {
        return this.folderId == null ? Input.empty() : this.folderId;
    }

    /**
     * The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
     * 
     */
    @InputImport(name="lifecycleState")
    private final @Nullable Input<String> lifecycleState;

    public Input<String> getLifecycleState() {
        return this.lifecycleState == null ? Input.empty() : this.lifecycleState;
    }

    /**
     * The resource name of the Folder. Its format is folders/{folder_id}.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The resource name of the parent Folder or Organization.
     * Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     * 
     */
    @InputImport(name="parent")
    private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    public FolderState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> displayName,
        @Nullable Input<String> folderId,
        @Nullable Input<String> lifecycleState,
        @Nullable Input<String> name,
        @Nullable Input<String> parent) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.folderId = folderId;
        this.lifecycleState = lifecycleState;
        this.name = name;
        this.parent = parent;
    }

    private FolderState() {
        this.createTime = Input.empty();
        this.displayName = Input.empty();
        this.folderId = Input.empty();
        this.lifecycleState = Input.empty();
        this.name = Input.empty();
        this.parent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> folderId;
        private @Nullable Input<String> lifecycleState;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.folderId = defaults.folderId;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setFolderId(@Nullable Input<String> folderId) {
            this.folderId = folderId;
            return this;
        }

        public Builder setFolderId(@Nullable String folderId) {
            this.folderId = Input.ofNullable(folderId);
            return this;
        }

        public Builder setLifecycleState(@Nullable Input<String> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        public Builder setLifecycleState(@Nullable String lifecycleState) {
            this.lifecycleState = Input.ofNullable(lifecycleState);
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

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public FolderState build() {
            return new FolderState(createTime, displayName, folderId, lifecycleState, name, parent);
        }
    }
}
