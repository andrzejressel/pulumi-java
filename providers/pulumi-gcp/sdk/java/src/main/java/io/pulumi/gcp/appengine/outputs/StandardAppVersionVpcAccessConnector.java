// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StandardAppVersionVpcAccessConnector {
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private StandardAppVersionVpcAccessConnector(String name) {
        this.name = Objects.requireNonNull(name);
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

    public static Builder builder(StandardAppVersionVpcAccessConnector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionVpcAccessConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public StandardAppVersionVpcAccessConnector build() {
            return new StandardAppVersionVpcAccessConnector(name);
        }
    }
}
