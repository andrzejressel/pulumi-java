// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The device state, as reported by the device.
 * 
 */
public final class DeviceStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeviceStateResponse Empty = new DeviceStateResponse();

    /**
     * The device state data.
     * 
     */
    @InputImport(name="binaryData", required=true)
    private final String binaryData;

    public String getBinaryData() {
        return this.binaryData;
    }

    /**
     * [Output only] The time at which this state version was updated in Cloud IoT Core.
     * 
     */
    @InputImport(name="updateTime", required=true)
    private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public DeviceStateResponse(
        String binaryData,
        String updateTime) {
        this.binaryData = Objects.requireNonNull(binaryData, "expected parameter 'binaryData' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private DeviceStateResponse() {
        this.binaryData = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String binaryData;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryData = defaults.binaryData;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setBinaryData(String binaryData) {
            this.binaryData = Objects.requireNonNull(binaryData);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public DeviceStateResponse build() {
            return new DeviceStateResponse(binaryData, updateTime);
        }
    }
}
