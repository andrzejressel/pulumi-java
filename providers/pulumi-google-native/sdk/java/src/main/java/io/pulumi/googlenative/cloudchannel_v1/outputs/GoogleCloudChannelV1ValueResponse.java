// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudChannelV1ValueResponse {
    /**
     * Represents a boolean value.
     * 
     */
    private final Boolean boolValue;
    /**
     * Represents a double value.
     * 
     */
    private final Double doubleValue;
    /**
     * Represents an int64 value.
     * 
     */
    private final String int64Value;
    /**
     * Represents an 'Any' proto value.
     * 
     */
    private final Map<String,String> protoValue;
    /**
     * Represents a string value.
     * 
     */
    private final String stringValue;

    @OutputCustomType.Constructor({"boolValue","doubleValue","int64Value","protoValue","stringValue"})
    private GoogleCloudChannelV1ValueResponse(
        Boolean boolValue,
        Double doubleValue,
        String int64Value,
        Map<String,String> protoValue,
        String stringValue) {
        this.boolValue = Objects.requireNonNull(boolValue);
        this.doubleValue = Objects.requireNonNull(doubleValue);
        this.int64Value = Objects.requireNonNull(int64Value);
        this.protoValue = Objects.requireNonNull(protoValue);
        this.stringValue = Objects.requireNonNull(stringValue);
    }

    /**
     * Represents a boolean value.
     * 
     */
    public Boolean getBoolValue() {
        return this.boolValue;
    }
    /**
     * Represents a double value.
     * 
     */
    public Double getDoubleValue() {
        return this.doubleValue;
    }
    /**
     * Represents an int64 value.
     * 
     */
    public String getInt64Value() {
        return this.int64Value;
    }
    /**
     * Represents an 'Any' proto value.
     * 
     */
    public Map<String,String> getProtoValue() {
        return this.protoValue;
    }
    /**
     * Represents a string value.
     * 
     */
    public String getStringValue() {
        return this.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1ValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean boolValue;
        private Double doubleValue;
        private String int64Value;
        private Map<String,String> protoValue;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1ValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.int64Value = defaults.int64Value;
    	      this.protoValue = defaults.protoValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setBoolValue(Boolean boolValue) {
            this.boolValue = Objects.requireNonNull(boolValue);
            return this;
        }

        public Builder setDoubleValue(Double doubleValue) {
            this.doubleValue = Objects.requireNonNull(doubleValue);
            return this;
        }

        public Builder setInt64Value(String int64Value) {
            this.int64Value = Objects.requireNonNull(int64Value);
            return this;
        }

        public Builder setProtoValue(Map<String,String> protoValue) {
            this.protoValue = Objects.requireNonNull(protoValue);
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }

        public GoogleCloudChannelV1ValueResponse build() {
            return new GoogleCloudChannelV1ValueResponse(boolValue, doubleValue, int64Value, protoValue, stringValue);
        }
    }
}
