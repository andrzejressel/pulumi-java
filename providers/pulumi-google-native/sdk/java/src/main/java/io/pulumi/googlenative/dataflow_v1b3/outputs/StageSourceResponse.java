// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StageSourceResponse {
    /**
     * Dataflow service generated name for this source.
     * 
     */
    private final String name;
    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    private final String originalTransformOrCollection;
    /**
     * Size of the source, if measurable.
     * 
     */
    private final String sizeBytes;
    /**
     * Human-readable name for this source; may be user or system generated.
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"name","originalTransformOrCollection","sizeBytes","userName"})
    private StageSourceResponse(
        String name,
        String originalTransformOrCollection,
        String sizeBytes,
        String userName) {
        this.name = Objects.requireNonNull(name);
        this.originalTransformOrCollection = Objects.requireNonNull(originalTransformOrCollection);
        this.sizeBytes = Objects.requireNonNull(sizeBytes);
        this.userName = Objects.requireNonNull(userName);
    }

    /**
     * Dataflow service generated name for this source.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    public String getOriginalTransformOrCollection() {
        return this.originalTransformOrCollection;
    }
    /**
     * Size of the source, if measurable.
     * 
     */
    public String getSizeBytes() {
        return this.sizeBytes;
    }
    /**
     * Human-readable name for this source; may be user or system generated.
     * 
     */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String originalTransformOrCollection;
        private String sizeBytes;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(StageSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransformOrCollection = defaults.originalTransformOrCollection;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.userName = defaults.userName;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOriginalTransformOrCollection(String originalTransformOrCollection) {
            this.originalTransformOrCollection = Objects.requireNonNull(originalTransformOrCollection);
            return this;
        }

        public Builder setSizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public StageSourceResponse build() {
            return new StageSourceResponse(name, originalTransformOrCollection, sizeBytes, userName);
        }
    }
}
