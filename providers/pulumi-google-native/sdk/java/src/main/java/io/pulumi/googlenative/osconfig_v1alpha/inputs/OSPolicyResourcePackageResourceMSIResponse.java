// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An MSI package. MSI packages only support INSTALLED state.
 * 
 */
public final class OSPolicyResourcePackageResourceMSIResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceMSIResponse Empty = new OSPolicyResourcePackageResourceMSIResponse();

    /**
     * Additional properties to use during installation. This should be in the format of Property=Setting. Appended to the defaults of `ACTION=INSTALL REBOOT=ReallySuppress`.
     * 
     */
    @InputImport(name="properties", required=true)
    private final List<String> properties;

    public List<String> getProperties() {
        return this.properties;
    }

    /**
     * The MSI package.
     * 
     */
    @InputImport(name="source", required=true)
    private final OSPolicyResourceFileResponse source;

    public OSPolicyResourceFileResponse getSource() {
        return this.source;
    }

    public OSPolicyResourcePackageResourceMSIResponse(
        List<String> properties,
        OSPolicyResourceFileResponse source) {
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OSPolicyResourcePackageResourceMSIResponse() {
        this.properties = List.of();
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceMSIResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> properties;
        private OSPolicyResourceFileResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceMSIResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.source = defaults.source;
        }

        public Builder setProperties(List<String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSource(OSPolicyResourceFileResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public OSPolicyResourcePackageResourceMSIResponse build() {
            return new OSPolicyResourcePackageResourceMSIResponse(properties, source);
        }
    }
}
