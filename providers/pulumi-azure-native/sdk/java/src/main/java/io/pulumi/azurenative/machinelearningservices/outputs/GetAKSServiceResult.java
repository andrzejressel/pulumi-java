// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.AKSServiceResponseResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.AKSVariantResponseResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SkuResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAKSServiceResult {
    /**
     * Specifies the resource ID.
     * 
     */
    private final String id;
    /**
     * The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * Specifies the location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * Specifies the name of the resource.
     * 
     */
    private final String name;
    /**
     * Service properties
     * 
     */
    private final Object properties;
    /**
     * The sku of the workspace.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Specifies the type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetAKSServiceResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("properties") Object properties,
        @OutputCustomType.Parameter("sku") @Nullable SkuResponse sku,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Specifies the resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the resource.
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Specifies the location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Specifies the name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Service properties
     * 
    */
    public Object getProperties() {
        return this.properties;
    }
    /**
     * The sku of the workspace.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAKSServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String location;
        private String name;
        private Object properties;
        private @Nullable SkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAKSServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAKSServiceResult build() {
            return new GetAKSServiceResult(id, identity, location, name, properties, sku, systemData, tags, type);
        }
    }
}
