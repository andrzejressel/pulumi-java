// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingSpecGetArgs Empty = new DomainMappingSpecGetArgs();

    /**
     * The mode of the certificate.
     * Default value is `AUTOMATIC`.
     * Possible values are `NONE` and `AUTOMATIC`.
     * 
     */
    @InputImport(name="certificateMode")
    private final @Nullable Input<String> certificateMode;

    public Input<String> getCertificateMode() {
        return this.certificateMode == null ? Input.empty() : this.certificateMode;
    }

    /**
     * If set, the mapping will override any mapping set before this spec was set.
     * It is recommended that the user leaves this empty to receive an error
     * warning about a potential conflict and only set it once the respective UI
     * has given such a warning.
     * 
     */
    @InputImport(name="forceOverride")
    private final @Nullable Input<Boolean> forceOverride;

    public Input<Boolean> getForceOverride() {
        return this.forceOverride == null ? Input.empty() : this.forceOverride;
    }

    /**
     * The name of the Cloud Run Service that this DomainMapping applies to.
     * The route must exist.
     * 
     */
    @InputImport(name="routeName", required=true)
    private final Input<String> routeName;

    public Input<String> getRouteName() {
        return this.routeName;
    }

    public DomainMappingSpecGetArgs(
        @Nullable Input<String> certificateMode,
        @Nullable Input<Boolean> forceOverride,
        Input<String> routeName) {
        this.certificateMode = certificateMode;
        this.forceOverride = forceOverride;
        this.routeName = Objects.requireNonNull(routeName, "expected parameter 'routeName' to be non-null");
    }

    private DomainMappingSpecGetArgs() {
        this.certificateMode = Input.empty();
        this.forceOverride = Input.empty();
        this.routeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateMode;
        private @Nullable Input<Boolean> forceOverride;
        private Input<String> routeName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMode = defaults.certificateMode;
    	      this.forceOverride = defaults.forceOverride;
    	      this.routeName = defaults.routeName;
        }

        public Builder setCertificateMode(@Nullable Input<String> certificateMode) {
            this.certificateMode = certificateMode;
            return this;
        }

        public Builder setCertificateMode(@Nullable String certificateMode) {
            this.certificateMode = Input.ofNullable(certificateMode);
            return this;
        }

        public Builder setForceOverride(@Nullable Input<Boolean> forceOverride) {
            this.forceOverride = forceOverride;
            return this;
        }

        public Builder setForceOverride(@Nullable Boolean forceOverride) {
            this.forceOverride = Input.ofNullable(forceOverride);
            return this;
        }

        public Builder setRouteName(Input<String> routeName) {
            this.routeName = Objects.requireNonNull(routeName);
            return this;
        }

        public Builder setRouteName(String routeName) {
            this.routeName = Input.of(Objects.requireNonNull(routeName));
            return this;
        }

        public DomainMappingSpecGetArgs build() {
            return new DomainMappingSpecGetArgs(certificateMode, forceOverride, routeName);
        }
    }
}
