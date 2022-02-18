// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.BasicAuthResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.ServiceAccountResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The credential used by Deployment Manager and TypeProvider. Only one of the options is permitted.
 * 
 */
public final class CredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final CredentialResponse Empty = new CredentialResponse();

    /**
     * Basic Auth Credential, only used by TypeProvider.
     * 
     */
    @InputImport(name="basicAuth", required=true)
    private final BasicAuthResponse basicAuth;

    public BasicAuthResponse getBasicAuth() {
        return this.basicAuth;
    }

    /**
     * Service Account Credential, only used by Deployment.
     * 
     */
    @InputImport(name="serviceAccount", required=true)
    private final ServiceAccountResponse serviceAccount;

    public ServiceAccountResponse getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * Specify to use the project default credential, only supported by Deployment.
     * 
     */
    @InputImport(name="useProjectDefault", required=true)
    private final Boolean useProjectDefault;

    public Boolean getUseProjectDefault() {
        return this.useProjectDefault;
    }

    public CredentialResponse(
        BasicAuthResponse basicAuth,
        ServiceAccountResponse serviceAccount,
        Boolean useProjectDefault) {
        this.basicAuth = Objects.requireNonNull(basicAuth, "expected parameter 'basicAuth' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.useProjectDefault = Objects.requireNonNull(useProjectDefault, "expected parameter 'useProjectDefault' to be non-null");
    }

    private CredentialResponse() {
        this.basicAuth = null;
        this.serviceAccount = null;
        this.useProjectDefault = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAuthResponse basicAuth;
        private ServiceAccountResponse serviceAccount;
        private Boolean useProjectDefault;

        public Builder() {
    	      // Empty
        }

        public Builder(CredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuth = defaults.basicAuth;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.useProjectDefault = defaults.useProjectDefault;
        }

        public Builder setBasicAuth(BasicAuthResponse basicAuth) {
            this.basicAuth = Objects.requireNonNull(basicAuth);
            return this;
        }

        public Builder setServiceAccount(ServiceAccountResponse serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setUseProjectDefault(Boolean useProjectDefault) {
            this.useProjectDefault = Objects.requireNonNull(useProjectDefault);
            return this;
        }

        public CredentialResponse build() {
            return new CredentialResponse(basicAuth, serviceAccount, useProjectDefault);
        }
    }
}
