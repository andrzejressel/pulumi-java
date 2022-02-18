// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HmacKeyState extends io.pulumi.resources.ResourceArgs {

    public static final HmacKeyState Empty = new HmacKeyState();

    /**
     * The access ID of the HMAC Key.
     * 
     */
    @InputImport(name="accessId")
    private final @Nullable Input<String> accessId;

    public Input<String> getAccessId() {
        return this.accessId == null ? Input.empty() : this.accessId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * HMAC secret key material.
     * 
     */
    @InputImport(name="secret")
    private final @Nullable Input<String> secret;

    public Input<String> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    /**
     * The email address of the key's associated service account.
     * 
     */
    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    /**
     * The state of the key. Can be set to one of ACTIVE, INACTIVE.
     * Default value is `ACTIVE`.
     * Possible values are `ACTIVE` and `INACTIVE`.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * 'The creation time of the HMAC key in RFC 3339 format. '
     * 
     */
    @InputImport(name="timeCreated")
    private final @Nullable Input<String> timeCreated;

    public Input<String> getTimeCreated() {
        return this.timeCreated == null ? Input.empty() : this.timeCreated;
    }

    /**
     * 'The last modification time of the HMAC key metadata in RFC 3339 format.'
     * 
     */
    @InputImport(name="updated")
    private final @Nullable Input<String> updated;

    public Input<String> getUpdated() {
        return this.updated == null ? Input.empty() : this.updated;
    }

    public HmacKeyState(
        @Nullable Input<String> accessId,
        @Nullable Input<String> project,
        @Nullable Input<String> secret,
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<String> state,
        @Nullable Input<String> timeCreated,
        @Nullable Input<String> updated) {
        this.accessId = accessId;
        this.project = project;
        this.secret = secret;
        this.serviceAccountEmail = serviceAccountEmail;
        this.state = state;
        this.timeCreated = timeCreated;
        this.updated = updated;
    }

    private HmacKeyState() {
        this.accessId = Input.empty();
        this.project = Input.empty();
        this.secret = Input.empty();
        this.serviceAccountEmail = Input.empty();
        this.state = Input.empty();
        this.timeCreated = Input.empty();
        this.updated = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HmacKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessId;
        private @Nullable Input<String> project;
        private @Nullable Input<String> secret;
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<String> state;
        private @Nullable Input<String> timeCreated;
        private @Nullable Input<String> updated;

        public Builder() {
    	      // Empty
        }

        public Builder(HmacKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessId = defaults.accessId;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.updated = defaults.updated;
        }

        public Builder setAccessId(@Nullable Input<String> accessId) {
            this.accessId = accessId;
            return this;
        }

        public Builder setAccessId(@Nullable String accessId) {
            this.accessId = Input.ofNullable(accessId);
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

        public Builder setSecret(@Nullable Input<String> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTimeCreated(@Nullable Input<String> timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        public Builder setTimeCreated(@Nullable String timeCreated) {
            this.timeCreated = Input.ofNullable(timeCreated);
            return this;
        }

        public Builder setUpdated(@Nullable Input<String> updated) {
            this.updated = updated;
            return this;
        }

        public Builder setUpdated(@Nullable String updated) {
            this.updated = Input.ofNullable(updated);
            return this;
        }

        public HmacKeyState build() {
            return new HmacKeyState(accessId, project, secret, serviceAccountEmail, state, timeCreated, updated);
        }
    }
}
