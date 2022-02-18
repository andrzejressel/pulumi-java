// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1RoutineSpecArgumentResponse {
    /**
     * Specifies whether the argument is input or output.
     * 
     */
    private final String mode;
    /**
     * The name of the argument. A return argument of a function might not have a name.
     * 
     */
    private final String name;
    /**
     * Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"mode","name","type"})
    private GoogleCloudDatacatalogV1RoutineSpecArgumentResponse(
        String mode,
        String name,
        String type) {
        this.mode = Objects.requireNonNull(mode);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies whether the argument is input or output.
     * 
     */
    public String getMode() {
        return this.mode;
    }
    /**
     * The name of the argument. A return argument of a function might not have a name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
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

        public GoogleCloudDatacatalogV1RoutineSpecArgumentResponse build() {
            return new GoogleCloudDatacatalogV1RoutineSpecArgumentResponse(mode, name, type);
        }
    }
}
