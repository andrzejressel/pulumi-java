// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.azurenative.scheduler.outputs.JobPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetJobResult {
    /**
     * Gets the job resource identifier.
     * 
     */
    private final String id;
    /**
     * Gets the job resource name.
     * 
     */
    private final String name;
    /**
     * Gets or sets the job properties.
     * 
     */
    private final JobPropertiesResponse properties;
    /**
     * Gets the job resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetJobResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("properties") JobPropertiesResponse properties,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * Gets the job resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets the job resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the job properties.
     * 
    */
    public JobPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Gets the job resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private JobPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
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

        public Builder setProperties(JobPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetJobResult build() {
            return new GetJobResult(id, name, properties, type);
        }
    }
}
