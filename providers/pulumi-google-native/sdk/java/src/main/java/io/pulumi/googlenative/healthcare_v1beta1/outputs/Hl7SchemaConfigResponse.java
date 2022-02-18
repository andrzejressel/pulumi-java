// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.VersionSourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class Hl7SchemaConfigResponse {
    /**
     * Map from each HL7v2 message type and trigger event pair, such as ADT_A04, to its schema configuration root group.
     * 
     */
    private final Map<String,String> messageSchemaConfigs;
    /**
     * Each VersionSource is tested and only if they all match is the schema used for the message.
     * 
     */
    private final List<VersionSourceResponse> version;

    @OutputCustomType.Constructor({"messageSchemaConfigs","version"})
    private Hl7SchemaConfigResponse(
        Map<String,String> messageSchemaConfigs,
        List<VersionSourceResponse> version) {
        this.messageSchemaConfigs = Objects.requireNonNull(messageSchemaConfigs);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Map from each HL7v2 message type and trigger event pair, such as ADT_A04, to its schema configuration root group.
     * 
     */
    public Map<String,String> getMessageSchemaConfigs() {
        return this.messageSchemaConfigs;
    }
    /**
     * Each VersionSource is tested and only if they all match is the schema used for the message.
     * 
     */
    public List<VersionSourceResponse> getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7SchemaConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> messageSchemaConfigs;
        private List<VersionSourceResponse> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7SchemaConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageSchemaConfigs = defaults.messageSchemaConfigs;
    	      this.version = defaults.version;
        }

        public Builder setMessageSchemaConfigs(Map<String,String> messageSchemaConfigs) {
            this.messageSchemaConfigs = Objects.requireNonNull(messageSchemaConfigs);
            return this;
        }

        public Builder setVersion(List<VersionSourceResponse> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Hl7SchemaConfigResponse build() {
            return new Hl7SchemaConfigResponse(messageSchemaConfigs, version);
        }
    }
}
