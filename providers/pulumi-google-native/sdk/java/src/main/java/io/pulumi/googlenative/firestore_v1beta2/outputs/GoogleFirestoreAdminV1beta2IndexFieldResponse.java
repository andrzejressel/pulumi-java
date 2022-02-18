// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleFirestoreAdminV1beta2IndexFieldResponse {
    /**
     * Indicates that this field supports operations on `array_value`s.
     * 
     */
    private final String arrayConfig;
    /**
     * Can be __name__. For single field indexes, this must match the name of the field or may be omitted.
     * 
     */
    private final String fieldPath;
    /**
     * Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
     * 
     */
    private final String order;

    @OutputCustomType.Constructor({"arrayConfig","fieldPath","order"})
    private GoogleFirestoreAdminV1beta2IndexFieldResponse(
        String arrayConfig,
        String fieldPath,
        String order) {
        this.arrayConfig = Objects.requireNonNull(arrayConfig);
        this.fieldPath = Objects.requireNonNull(fieldPath);
        this.order = Objects.requireNonNull(order);
    }

    /**
     * Indicates that this field supports operations on `array_value`s.
     * 
     */
    public String getArrayConfig() {
        return this.arrayConfig;
    }
    /**
     * Can be __name__. For single field indexes, this must match the name of the field or may be omitted.
     * 
     */
    public String getFieldPath() {
        return this.fieldPath;
    }
    /**
     * Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
     * 
     */
    public String getOrder() {
        return this.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleFirestoreAdminV1beta2IndexFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arrayConfig;
        private String fieldPath;
        private String order;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleFirestoreAdminV1beta2IndexFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayConfig = defaults.arrayConfig;
    	      this.fieldPath = defaults.fieldPath;
    	      this.order = defaults.order;
        }

        public Builder setArrayConfig(String arrayConfig) {
            this.arrayConfig = Objects.requireNonNull(arrayConfig);
            return this;
        }

        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = Objects.requireNonNull(fieldPath);
            return this;
        }

        public Builder setOrder(String order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }

        public GoogleFirestoreAdminV1beta2IndexFieldResponse build() {
            return new GoogleFirestoreAdminV1beta2IndexFieldResponse(arrayConfig, fieldPath, order);
        }
    }
}
