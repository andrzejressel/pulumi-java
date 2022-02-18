// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1GraphQLOperationConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1GraphQLOperationGroupResponse {
    /**
     * Flag that specifies whether the configuration is for Apigee API proxy or a remote service. Valid values include `proxy` or `remoteservice`. Defaults to `proxy`. Set to `proxy` when Apigee API proxies are associated with the API product. Set to `remoteservice` when non-Apigee proxies like Istio-Envoy are associated with the API product.
     * 
     */
    private final String operationConfigType;
    /**
     * List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
     * 
     */
    private final List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> operationConfigs;

    @OutputCustomType.Constructor({"operationConfigType","operationConfigs"})
    private GoogleCloudApigeeV1GraphQLOperationGroupResponse(
        String operationConfigType,
        List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> operationConfigs) {
        this.operationConfigType = Objects.requireNonNull(operationConfigType);
        this.operationConfigs = Objects.requireNonNull(operationConfigs);
    }

    /**
     * Flag that specifies whether the configuration is for Apigee API proxy or a remote service. Valid values include `proxy` or `remoteservice`. Defaults to `proxy`. Set to `proxy` when Apigee API proxies are associated with the API product. Set to `remoteservice` when non-Apigee proxies like Istio-Envoy are associated with the API product.
     * 
     */
    public String getOperationConfigType() {
        return this.operationConfigType;
    }
    /**
     * List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
     * 
     */
    public List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> getOperationConfigs() {
        return this.operationConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1GraphQLOperationGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operationConfigType;
        private List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> operationConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1GraphQLOperationGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationConfigType = defaults.operationConfigType;
    	      this.operationConfigs = defaults.operationConfigs;
        }

        public Builder setOperationConfigType(String operationConfigType) {
            this.operationConfigType = Objects.requireNonNull(operationConfigType);
            return this;
        }

        public Builder setOperationConfigs(List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> operationConfigs) {
            this.operationConfigs = Objects.requireNonNull(operationConfigs);
            return this;
        }

        public GoogleCloudApigeeV1GraphQLOperationGroupResponse build() {
            return new GoogleCloudApigeeV1GraphQLOperationGroupResponse(operationConfigType, operationConfigs);
        }
    }
}
