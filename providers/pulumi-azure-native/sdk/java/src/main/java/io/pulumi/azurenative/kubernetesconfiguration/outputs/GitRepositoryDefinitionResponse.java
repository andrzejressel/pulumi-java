// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.azurenative.kubernetesconfiguration.outputs.RepositoryRefDefinitionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GitRepositoryDefinitionResponse {
    /**
     * Base64-encoded HTTPS certificate authority contents used to access git private git repositories over HTTPS
     * 
     */
    private final @Nullable String httpsCAFile;
    /**
     * Base64-encoded HTTPS username used to access private git repositories over HTTPS
     * 
     */
    private final @Nullable String httpsUser;
    /**
     * Name of a local secret on the Kubernetes cluster to use as the authentication secret rather than the managed or user-provided configuration secrets.
     * 
     */
    private final @Nullable String localAuthRef;
    /**
     * The source reference for the GitRepository object.
     * 
     */
    private final @Nullable RepositoryRefDefinitionResponse repositoryRef;
    /**
     * Base64-encoded known_hosts value containing public SSH keys required to access private git repositories over SSH
     * 
     */
    private final @Nullable String sshKnownHosts;
    /**
     * The interval at which to re-reconcile the cluster git repository source with the remote.
     * 
     */
    private final @Nullable Double syncIntervalInSeconds;
    /**
     * The maximum time to attempt to reconcile the cluster git repository source with the remote.
     * 
     */
    private final @Nullable Double timeoutInSeconds;
    /**
     * The URL to sync for the flux configuration git repository.
     * 
     */
    private final @Nullable String url;

    @OutputCustomType.Constructor
    private GitRepositoryDefinitionResponse(
        @OutputCustomType.Parameter("httpsCAFile") @Nullable String httpsCAFile,
        @OutputCustomType.Parameter("httpsUser") @Nullable String httpsUser,
        @OutputCustomType.Parameter("localAuthRef") @Nullable String localAuthRef,
        @OutputCustomType.Parameter("repositoryRef") @Nullable RepositoryRefDefinitionResponse repositoryRef,
        @OutputCustomType.Parameter("sshKnownHosts") @Nullable String sshKnownHosts,
        @OutputCustomType.Parameter("syncIntervalInSeconds") @Nullable Double syncIntervalInSeconds,
        @OutputCustomType.Parameter("timeoutInSeconds") @Nullable Double timeoutInSeconds,
        @OutputCustomType.Parameter("url") @Nullable String url) {
        this.httpsCAFile = httpsCAFile;
        this.httpsUser = httpsUser;
        this.localAuthRef = localAuthRef;
        this.repositoryRef = repositoryRef;
        this.sshKnownHosts = sshKnownHosts;
        this.syncIntervalInSeconds = syncIntervalInSeconds;
        this.timeoutInSeconds = timeoutInSeconds;
        this.url = url;
    }

    /**
     * Base64-encoded HTTPS certificate authority contents used to access git private git repositories over HTTPS
     * 
    */
    public Optional<String> getHttpsCAFile() {
        return Optional.ofNullable(this.httpsCAFile);
    }
    /**
     * Base64-encoded HTTPS username used to access private git repositories over HTTPS
     * 
    */
    public Optional<String> getHttpsUser() {
        return Optional.ofNullable(this.httpsUser);
    }
    /**
     * Name of a local secret on the Kubernetes cluster to use as the authentication secret rather than the managed or user-provided configuration secrets.
     * 
    */
    public Optional<String> getLocalAuthRef() {
        return Optional.ofNullable(this.localAuthRef);
    }
    /**
     * The source reference for the GitRepository object.
     * 
    */
    public Optional<RepositoryRefDefinitionResponse> getRepositoryRef() {
        return Optional.ofNullable(this.repositoryRef);
    }
    /**
     * Base64-encoded known_hosts value containing public SSH keys required to access private git repositories over SSH
     * 
    */
    public Optional<String> getSshKnownHosts() {
        return Optional.ofNullable(this.sshKnownHosts);
    }
    /**
     * The interval at which to re-reconcile the cluster git repository source with the remote.
     * 
    */
    public Optional<Double> getSyncIntervalInSeconds() {
        return Optional.ofNullable(this.syncIntervalInSeconds);
    }
    /**
     * The maximum time to attempt to reconcile the cluster git repository source with the remote.
     * 
    */
    public Optional<Double> getTimeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }
    /**
     * The URL to sync for the flux configuration git repository.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepositoryDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String httpsCAFile;
        private @Nullable String httpsUser;
        private @Nullable String localAuthRef;
        private @Nullable RepositoryRefDefinitionResponse repositoryRef;
        private @Nullable String sshKnownHosts;
        private @Nullable Double syncIntervalInSeconds;
        private @Nullable Double timeoutInSeconds;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepositoryDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpsCAFile = defaults.httpsCAFile;
    	      this.httpsUser = defaults.httpsUser;
    	      this.localAuthRef = defaults.localAuthRef;
    	      this.repositoryRef = defaults.repositoryRef;
    	      this.sshKnownHosts = defaults.sshKnownHosts;
    	      this.syncIntervalInSeconds = defaults.syncIntervalInSeconds;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.url = defaults.url;
        }

        public Builder setHttpsCAFile(@Nullable String httpsCAFile) {
            this.httpsCAFile = httpsCAFile;
            return this;
        }

        public Builder setHttpsUser(@Nullable String httpsUser) {
            this.httpsUser = httpsUser;
            return this;
        }

        public Builder setLocalAuthRef(@Nullable String localAuthRef) {
            this.localAuthRef = localAuthRef;
            return this;
        }

        public Builder setRepositoryRef(@Nullable RepositoryRefDefinitionResponse repositoryRef) {
            this.repositoryRef = repositoryRef;
            return this;
        }

        public Builder setSshKnownHosts(@Nullable String sshKnownHosts) {
            this.sshKnownHosts = sshKnownHosts;
            return this;
        }

        public Builder setSyncIntervalInSeconds(@Nullable Double syncIntervalInSeconds) {
            this.syncIntervalInSeconds = syncIntervalInSeconds;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public GitRepositoryDefinitionResponse build() {
            return new GitRepositoryDefinitionResponse(httpsCAFile, httpsUser, localAuthRef, repositoryRef, sshKnownHosts, syncIntervalInSeconds, timeoutInSeconds, url);
        }
    }
}
