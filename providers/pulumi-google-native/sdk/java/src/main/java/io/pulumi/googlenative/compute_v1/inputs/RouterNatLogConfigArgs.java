// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.RouterNatLogConfigFilter;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of logging on a NAT.
 * 
 */
public final class RouterNatLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatLogConfigArgs Empty = new RouterNatLogConfigArgs();

    /**
     * Indicates whether or not to export logs. This is false by default.
     * 
     */
    @InputImport(name="enable")
    private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<RouterNatLogConfigFilter> filter;

    public Input<RouterNatLogConfigFilter> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    public RouterNatLogConfigArgs(
        @Nullable Input<Boolean> enable,
        @Nullable Input<RouterNatLogConfigFilter> filter) {
        this.enable = enable;
        this.filter = filter;
    }

    private RouterNatLogConfigArgs() {
        this.enable = Input.empty();
        this.filter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<RouterNatLogConfigFilter> filter;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setFilter(@Nullable Input<RouterNatLogConfigFilter> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable RouterNatLogConfigFilter filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public RouterNatLogConfigArgs build() {
            return new RouterNatLogConfigArgs(enable, filter);
        }
    }
}
