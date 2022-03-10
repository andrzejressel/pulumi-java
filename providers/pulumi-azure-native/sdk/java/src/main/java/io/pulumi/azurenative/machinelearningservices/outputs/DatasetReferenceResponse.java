// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetReferenceResponse {
    /**
     * The id of the dataset reference.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the dataset reference.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor
    private DatasetReferenceResponse(
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * The id of the dataset reference.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the dataset reference.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public DatasetReferenceResponse build() {
            return new DatasetReferenceResponse(id, name);
        }
    }
}
