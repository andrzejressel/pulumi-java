// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.DeploymentResourcePropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDeploymentResult {
    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    private final String id;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Properties of the Deployment resource
     * 
     */
    private final DeploymentResourcePropertiesResponse properties;
    /**
     * Sku of the Deployment resource
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetDeploymentResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("properties") DeploymentResourcePropertiesResponse properties,
        @OutputCustomType.Parameter("sku") @Nullable SkuResponse sku,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.sku = sku;
        this.type = type;
    }

    /**
     * Fully qualified resource Id for the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of the Deployment resource
     * 
    */
    public DeploymentResourcePropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Sku of the Deployment resource
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private DeploymentResourcePropertiesResponse properties;
        private @Nullable SkuResponse sku;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(DeploymentResourcePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDeploymentResult build() {
            return new GetDeploymentResult(id, name, properties, sku, type);
        }
    }
}
