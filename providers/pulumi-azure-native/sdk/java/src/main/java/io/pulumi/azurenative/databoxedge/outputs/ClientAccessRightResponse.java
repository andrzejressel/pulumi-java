// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClientAccessRightResponse {
    /**
     * Type of access to be allowed for the client.
     * 
     */
    private final String accessPermission;
    /**
     * IP of the client.
     * 
     */
    private final String client;

    @OutputCustomType.Constructor
    private ClientAccessRightResponse(
        @OutputCustomType.Parameter("accessPermission") String accessPermission,
        @OutputCustomType.Parameter("client") String client) {
        this.accessPermission = accessPermission;
        this.client = client;
    }

    /**
     * Type of access to be allowed for the client.
     * 
    */
    public String getAccessPermission() {
        return this.accessPermission;
    }
    /**
     * IP of the client.
     * 
    */
    public String getClient() {
        return this.client;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAccessRightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessPermission;
        private String client;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientAccessRightResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPermission = defaults.accessPermission;
    	      this.client = defaults.client;
        }

        public Builder setAccessPermission(String accessPermission) {
            this.accessPermission = Objects.requireNonNull(accessPermission);
            return this;
        }

        public Builder setClient(String client) {
            this.client = Objects.requireNonNull(client);
            return this;
        }
        public ClientAccessRightResponse build() {
            return new ClientAccessRightResponse(accessPermission, client);
        }
    }
}
