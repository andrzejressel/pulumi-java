// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.AndroidDeviceListArgs;
import io.pulumi.googlenative.testing_v1.inputs.AndroidMatrixArgs;
import io.pulumi.googlenative.testing_v1.inputs.IosDeviceListArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The matrix of environments in which the test is to be executed.
 * 
 */
public final class EnvironmentMatrixArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentMatrixArgs Empty = new EnvironmentMatrixArgs();

    /**
     * A list of Android devices; the test will be run only on the specified devices.
     * 
     */
    @InputImport(name="androidDeviceList")
    private final @Nullable Input<AndroidDeviceListArgs> androidDeviceList;

    public Input<AndroidDeviceListArgs> getAndroidDeviceList() {
        return this.androidDeviceList == null ? Input.empty() : this.androidDeviceList;
    }

    /**
     * A matrix of Android devices.
     * 
     */
    @InputImport(name="androidMatrix")
    private final @Nullable Input<AndroidMatrixArgs> androidMatrix;

    public Input<AndroidMatrixArgs> getAndroidMatrix() {
        return this.androidMatrix == null ? Input.empty() : this.androidMatrix;
    }

    /**
     * A list of iOS devices.
     * 
     */
    @InputImport(name="iosDeviceList")
    private final @Nullable Input<IosDeviceListArgs> iosDeviceList;

    public Input<IosDeviceListArgs> getIosDeviceList() {
        return this.iosDeviceList == null ? Input.empty() : this.iosDeviceList;
    }

    public EnvironmentMatrixArgs(
        @Nullable Input<AndroidDeviceListArgs> androidDeviceList,
        @Nullable Input<AndroidMatrixArgs> androidMatrix,
        @Nullable Input<IosDeviceListArgs> iosDeviceList) {
        this.androidDeviceList = androidDeviceList;
        this.androidMatrix = androidMatrix;
        this.iosDeviceList = iosDeviceList;
    }

    private EnvironmentMatrixArgs() {
        this.androidDeviceList = Input.empty();
        this.androidMatrix = Input.empty();
        this.iosDeviceList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentMatrixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AndroidDeviceListArgs> androidDeviceList;
        private @Nullable Input<AndroidMatrixArgs> androidMatrix;
        private @Nullable Input<IosDeviceListArgs> iosDeviceList;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentMatrixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidDeviceList = defaults.androidDeviceList;
    	      this.androidMatrix = defaults.androidMatrix;
    	      this.iosDeviceList = defaults.iosDeviceList;
        }

        public Builder setAndroidDeviceList(@Nullable Input<AndroidDeviceListArgs> androidDeviceList) {
            this.androidDeviceList = androidDeviceList;
            return this;
        }

        public Builder setAndroidDeviceList(@Nullable AndroidDeviceListArgs androidDeviceList) {
            this.androidDeviceList = Input.ofNullable(androidDeviceList);
            return this;
        }

        public Builder setAndroidMatrix(@Nullable Input<AndroidMatrixArgs> androidMatrix) {
            this.androidMatrix = androidMatrix;
            return this;
        }

        public Builder setAndroidMatrix(@Nullable AndroidMatrixArgs androidMatrix) {
            this.androidMatrix = Input.ofNullable(androidMatrix);
            return this;
        }

        public Builder setIosDeviceList(@Nullable Input<IosDeviceListArgs> iosDeviceList) {
            this.iosDeviceList = iosDeviceList;
            return this;
        }

        public Builder setIosDeviceList(@Nullable IosDeviceListArgs iosDeviceList) {
            this.iosDeviceList = Input.ofNullable(iosDeviceList);
            return this;
        }

        public EnvironmentMatrixArgs build() {
            return new EnvironmentMatrixArgs(androidDeviceList, androidMatrix, iosDeviceList);
        }
    }
}
