// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.AwsCloudTrailDataConnectorDataTypesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAwsCloudTrailDataConnectorResult {
    /**
     * The Aws Role Arn (with CloudTrailReadOnly policy) that is used to access the Aws account.
     * 
     */
    private final @Nullable String awsRoleArn;
    /**
     * The available data types for the connector.
     * 
     */
    private final @Nullable AwsCloudTrailDataConnectorDataTypesResponse dataTypes;
    /**
     * Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * The kind of the data connector
     * Expected value is 'AmazonWebServicesCloudTrail'.
     * 
     */
    private final String kind;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetAwsCloudTrailDataConnectorResult(
        @OutputCustomType.Parameter("awsRoleArn") @Nullable String awsRoleArn,
        @OutputCustomType.Parameter("dataTypes") @Nullable AwsCloudTrailDataConnectorDataTypesResponse dataTypes,
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("type") String type) {
        this.awsRoleArn = awsRoleArn;
        this.dataTypes = dataTypes;
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.type = type;
    }

    /**
     * The Aws Role Arn (with CloudTrailReadOnly policy) that is used to access the Aws account.
     * 
    */
    public Optional<String> getAwsRoleArn() {
        return Optional.ofNullable(this.awsRoleArn);
    }
    /**
     * The available data types for the connector.
     * 
    */
    public Optional<AwsCloudTrailDataConnectorDataTypesResponse> getDataTypes() {
        return Optional.ofNullable(this.dataTypes);
    }
    /**
     * Etag of the azure resource
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The kind of the data connector
     * Expected value is 'AmazonWebServicesCloudTrail'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsCloudTrailDataConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsRoleArn;
        private @Nullable AwsCloudTrailDataConnectorDataTypesResponse dataTypes;
        private @Nullable String etag;
        private String id;
        private String kind;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAwsCloudTrailDataConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsRoleArn = defaults.awsRoleArn;
    	      this.dataTypes = defaults.dataTypes;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setAwsRoleArn(@Nullable String awsRoleArn) {
            this.awsRoleArn = awsRoleArn;
            return this;
        }

        public Builder setDataTypes(@Nullable AwsCloudTrailDataConnectorDataTypesResponse dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAwsCloudTrailDataConnectorResult build() {
            return new GetAwsCloudTrailDataConnectorResult(awsRoleArn, dataTypes, etag, id, kind, name, type);
        }
    }
}
