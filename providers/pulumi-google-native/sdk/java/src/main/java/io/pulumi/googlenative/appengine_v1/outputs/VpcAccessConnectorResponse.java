// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VpcAccessConnectorResponse {
    /**
     * The egress setting for the connector, controlling what traffic is diverted through it.
     * 
     */
    private final String egressSetting;
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"egressSetting","name"})
    private VpcAccessConnectorResponse(
        String egressSetting,
        String name) {
        this.egressSetting = Objects.requireNonNull(egressSetting);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The egress setting for the connector, controlling what traffic is diverted through it.
     * 
     */
    public String getEgressSetting() {
        return this.egressSetting;
    }
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAccessConnectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String egressSetting;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAccessConnectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressSetting = defaults.egressSetting;
    	      this.name = defaults.name;
        }

        public Builder setEgressSetting(String egressSetting) {
            this.egressSetting = Objects.requireNonNull(egressSetting);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public VpcAccessConnectorResponse build() {
            return new VpcAccessConnectorResponse(egressSetting, name);
        }
    }
}
