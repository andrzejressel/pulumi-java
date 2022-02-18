// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Settings specific to the Key Management Service.
 * 
 */
public final class GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse Empty = new GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse();

    /**
     * Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
     * 
     */
    @InputImport(name="nextRotationTime", required=true)
    private final String nextRotationTime;

    public String getNextRotationTime() {
        return this.nextRotationTime;
    }

    /**
     * Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
     * 
     */
    @InputImport(name="rotationPeriod", required=true)
    private final String rotationPeriod;

    public String getRotationPeriod() {
        return this.rotationPeriod;
    }

    public GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse(
        String nextRotationTime,
        String rotationPeriod) {
        this.nextRotationTime = Objects.requireNonNull(nextRotationTime, "expected parameter 'nextRotationTime' to be non-null");
        this.rotationPeriod = Objects.requireNonNull(rotationPeriod, "expected parameter 'rotationPeriod' to be non-null");
    }

    private GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse() {
        this.nextRotationTime = null;
        this.rotationPeriod = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextRotationTime;
        private String rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder setNextRotationTime(String nextRotationTime) {
            this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
            return this;
        }

        public Builder setRotationPeriod(String rotationPeriod) {
            this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
            return this;
        }

        public GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse(nextRotationTime, rotationPeriod);
        }
    }
}
