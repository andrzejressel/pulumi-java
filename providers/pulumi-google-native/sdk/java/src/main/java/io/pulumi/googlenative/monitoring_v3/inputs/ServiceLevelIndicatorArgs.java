// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.BasicSliArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.RequestBasedSliArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.WindowsBasedSliArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Service-Level Indicator (SLI) describes the "performance" of a service. For some services, the SLI is well-defined. In such cases, the SLI can be described easily by referencing the well-known SLI and providing the needed parameters. Alternatively, a "custom" SLI can be defined with a query to the underlying metric store. An SLI is defined to be good_service / total_service over any queried time interval. The value of performance always falls into the range 0 <= performance <= 1. A custom SLI describes how to compute this ratio, whether this is by dividing values from a pair of time series, cutting a Distribution into good and bad counts, or counting time windows in which the service complies with a criterion. For separation of concerns, a single Service-Level Indicator measures performance for only one aspect of service quality, such as fraction of successful queries or fast-enough queries.
 * 
 */
public final class ServiceLevelIndicatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceLevelIndicatorArgs Empty = new ServiceLevelIndicatorArgs();

    /**
     * Basic SLI on a well-known service type.
     * 
     */
    @InputImport(name="basicSli")
    private final @Nullable Input<BasicSliArgs> basicSli;

    public Input<BasicSliArgs> getBasicSli() {
        return this.basicSli == null ? Input.empty() : this.basicSli;
    }

    /**
     * Request-based SLIs
     * 
     */
    @InputImport(name="requestBased")
    private final @Nullable Input<RequestBasedSliArgs> requestBased;

    public Input<RequestBasedSliArgs> getRequestBased() {
        return this.requestBased == null ? Input.empty() : this.requestBased;
    }

    /**
     * Windows-based SLIs
     * 
     */
    @InputImport(name="windowsBased")
    private final @Nullable Input<WindowsBasedSliArgs> windowsBased;

    public Input<WindowsBasedSliArgs> getWindowsBased() {
        return this.windowsBased == null ? Input.empty() : this.windowsBased;
    }

    public ServiceLevelIndicatorArgs(
        @Nullable Input<BasicSliArgs> basicSli,
        @Nullable Input<RequestBasedSliArgs> requestBased,
        @Nullable Input<WindowsBasedSliArgs> windowsBased) {
        this.basicSli = basicSli;
        this.requestBased = requestBased;
        this.windowsBased = windowsBased;
    }

    private ServiceLevelIndicatorArgs() {
        this.basicSli = Input.empty();
        this.requestBased = Input.empty();
        this.windowsBased = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLevelIndicatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BasicSliArgs> basicSli;
        private @Nullable Input<RequestBasedSliArgs> requestBased;
        private @Nullable Input<WindowsBasedSliArgs> windowsBased;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLevelIndicatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicSli = defaults.basicSli;
    	      this.requestBased = defaults.requestBased;
    	      this.windowsBased = defaults.windowsBased;
        }

        public Builder setBasicSli(@Nullable Input<BasicSliArgs> basicSli) {
            this.basicSli = basicSli;
            return this;
        }

        public Builder setBasicSli(@Nullable BasicSliArgs basicSli) {
            this.basicSli = Input.ofNullable(basicSli);
            return this;
        }

        public Builder setRequestBased(@Nullable Input<RequestBasedSliArgs> requestBased) {
            this.requestBased = requestBased;
            return this;
        }

        public Builder setRequestBased(@Nullable RequestBasedSliArgs requestBased) {
            this.requestBased = Input.ofNullable(requestBased);
            return this;
        }

        public Builder setWindowsBased(@Nullable Input<WindowsBasedSliArgs> windowsBased) {
            this.windowsBased = windowsBased;
            return this;
        }

        public Builder setWindowsBased(@Nullable WindowsBasedSliArgs windowsBased) {
            this.windowsBased = Input.ofNullable(windowsBased);
            return this;
        }

        public ServiceLevelIndicatorArgs build() {
            return new ServiceLevelIndicatorArgs(basicSli, requestBased, windowsBased);
        }
    }
}
