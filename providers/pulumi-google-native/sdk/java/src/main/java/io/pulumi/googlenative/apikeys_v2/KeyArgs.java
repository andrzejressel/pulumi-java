// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apikeys_v2.inputs.V2RestrictionsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * Human-readable display name of this key that you can modify. The maximum length is 63 characters.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="keyId")
    private final @Nullable Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId == null ? Input.empty() : this.keyId;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Key restrictions.
     * 
     */
    @InputImport(name="restrictions")
    private final @Nullable Input<V2RestrictionsArgs> restrictions;

    public Input<V2RestrictionsArgs> getRestrictions() {
        return this.restrictions == null ? Input.empty() : this.restrictions;
    }

    public KeyArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<String> keyId,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<V2RestrictionsArgs> restrictions) {
        this.displayName = displayName;
        this.keyId = keyId;
        this.location = location;
        this.project = project;
        this.restrictions = restrictions;
    }

    private KeyArgs() {
        this.displayName = Input.empty();
        this.keyId = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.restrictions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> keyId;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<V2RestrictionsArgs> restrictions;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.keyId = defaults.keyId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.restrictions = defaults.restrictions;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setKeyId(@Nullable Input<String> keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder setKeyId(@Nullable String keyId) {
            this.keyId = Input.ofNullable(keyId);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setRestrictions(@Nullable Input<V2RestrictionsArgs> restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        public Builder setRestrictions(@Nullable V2RestrictionsArgs restrictions) {
            this.restrictions = Input.ofNullable(restrictions);
            return this;
        }

        public KeyArgs build() {
            return new KeyArgs(displayName, keyId, location, project, restrictions);
        }
    }
}
