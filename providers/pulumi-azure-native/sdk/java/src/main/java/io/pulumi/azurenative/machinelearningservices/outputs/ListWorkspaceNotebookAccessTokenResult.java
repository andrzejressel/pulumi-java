// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListWorkspaceNotebookAccessTokenResult {
    private final String accessToken;
    private final Integer expiresIn;
    private final String hostName;
    private final String notebookResourceId;
    private final String publicDns;
    private final String refreshToken;
    private final String scope;
    private final String tokenType;

    @OutputCustomType.Constructor
    private ListWorkspaceNotebookAccessTokenResult(
        @OutputCustomType.Parameter("accessToken") String accessToken,
        @OutputCustomType.Parameter("expiresIn") Integer expiresIn,
        @OutputCustomType.Parameter("hostName") String hostName,
        @OutputCustomType.Parameter("notebookResourceId") String notebookResourceId,
        @OutputCustomType.Parameter("publicDns") String publicDns,
        @OutputCustomType.Parameter("refreshToken") String refreshToken,
        @OutputCustomType.Parameter("scope") String scope,
        @OutputCustomType.Parameter("tokenType") String tokenType) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.hostName = hostName;
        this.notebookResourceId = notebookResourceId;
        this.publicDns = publicDns;
        this.refreshToken = refreshToken;
        this.scope = scope;
        this.tokenType = tokenType;
    }

    public String getAccessToken() {
        return this.accessToken;
    }
    public Integer getExpiresIn() {
        return this.expiresIn;
    }
    public String getHostName() {
        return this.hostName;
    }
    public String getNotebookResourceId() {
        return this.notebookResourceId;
    }
    public String getPublicDns() {
        return this.publicDns;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }
    public String getScope() {
        return this.scope;
    }
    public String getTokenType() {
        return this.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkspaceNotebookAccessTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessToken;
        private Integer expiresIn;
        private String hostName;
        private String notebookResourceId;
        private String publicDns;
        private String refreshToken;
        private String scope;
        private String tokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkspaceNotebookAccessTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.expiresIn = defaults.expiresIn;
    	      this.hostName = defaults.hostName;
    	      this.notebookResourceId = defaults.notebookResourceId;
    	      this.publicDns = defaults.publicDns;
    	      this.refreshToken = defaults.refreshToken;
    	      this.scope = defaults.scope;
    	      this.tokenType = defaults.tokenType;
        }

        public Builder setAccessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
            return this;
        }

        public Builder setExpiresIn(Integer expiresIn) {
            this.expiresIn = Objects.requireNonNull(expiresIn);
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setNotebookResourceId(String notebookResourceId) {
            this.notebookResourceId = Objects.requireNonNull(notebookResourceId);
            return this;
        }

        public Builder setPublicDns(String publicDns) {
            this.publicDns = Objects.requireNonNull(publicDns);
            return this;
        }

        public Builder setRefreshToken(String refreshToken) {
            this.refreshToken = Objects.requireNonNull(refreshToken);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setTokenType(String tokenType) {
            this.tokenType = Objects.requireNonNull(tokenType);
            return this;
        }
        public ListWorkspaceNotebookAccessTokenResult build() {
            return new ListWorkspaceNotebookAccessTokenResult(accessToken, expiresIn, hostName, notebookResourceId, publicDns, refreshToken, scope, tokenType);
        }
    }
}
