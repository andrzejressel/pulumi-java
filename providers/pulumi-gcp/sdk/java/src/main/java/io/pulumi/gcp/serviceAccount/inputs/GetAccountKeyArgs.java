// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccountKeyArgs Empty = new GetAccountKeyArgs();

    /**
     * The name of the service account key. This must have format
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{KEYID}`, where `{ACCOUNT}`
     * is the email address or unique id of the service account.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     * 
     */
    @InputImport(name="publicKeyType")
    private final @Nullable String publicKeyType;

    public Optional<String> getPublicKeyType() {
        return this.publicKeyType == null ? Optional.empty() : Optional.ofNullable(this.publicKeyType);
    }

    public GetAccountKeyArgs(
        String name,
        @Nullable String project,
        @Nullable String publicKeyType) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.project = project;
        this.publicKeyType = publicKeyType;
    }

    private GetAccountKeyArgs() {
        this.name = null;
        this.project = null;
        this.publicKeyType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String project;
        private @Nullable String publicKeyType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.publicKeyType = defaults.publicKeyType;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setPublicKeyType(@Nullable String publicKeyType) {
            this.publicKeyType = publicKeyType;
            return this;
        }

        public GetAccountKeyArgs build() {
            return new GetAccountKeyArgs(name, project, publicKeyType);
        }
    }
}
