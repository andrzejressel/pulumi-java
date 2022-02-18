// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FlexibleAppVersionResourcesVolume {
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    private final String name;
    /**
     * Volume size in gigabytes.
     * 
     */
    private final Integer sizeGb;
    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
     */
    private final String volumeType;

    @OutputCustomType.Constructor({"name","sizeGb","volumeType"})
    private FlexibleAppVersionResourcesVolume(
        String name,
        Integer sizeGb,
        String volumeType) {
        this.name = Objects.requireNonNull(name);
        this.sizeGb = Objects.requireNonNull(sizeGb);
        this.volumeType = Objects.requireNonNull(volumeType);
    }

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Volume size in gigabytes.
     * 
     */
    public Integer getSizeGb() {
        return this.sizeGb;
    }
    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
     */
    public String getVolumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionResourcesVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer sizeGb;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionResourcesVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sizeGb = defaults.sizeGb;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSizeGb(Integer sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }

        public Builder setVolumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }

        public FlexibleAppVersionResourcesVolume build() {
            return new FlexibleAppVersionResourcesVolume(name, sizeGb, volumeType);
        }
    }
}
