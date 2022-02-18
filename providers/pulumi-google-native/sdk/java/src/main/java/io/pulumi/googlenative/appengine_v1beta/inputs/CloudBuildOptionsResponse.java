// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Options for the build operations performed as a part of the version deployment. Only applicable for App Engine flexible environment when creating a version using source code directly.
 * 
 */
public final class CloudBuildOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudBuildOptionsResponse Empty = new CloudBuildOptionsResponse();

    /**
     * Path to the yaml file used in deployment, used to determine runtime configuration details.Required for flexible environment builds.See https://cloud.google.com/appengine/docs/standard/python/config/appref for more details.
     * 
     */
    @InputImport(name="appYamlPath", required=true)
    private final String appYamlPath;

    public String getAppYamlPath() {
        return this.appYamlPath;
    }

    /**
     * The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
     * 
     */
    @InputImport(name="cloudBuildTimeout", required=true)
    private final String cloudBuildTimeout;

    public String getCloudBuildTimeout() {
        return this.cloudBuildTimeout;
    }

    public CloudBuildOptionsResponse(
        String appYamlPath,
        String cloudBuildTimeout) {
        this.appYamlPath = Objects.requireNonNull(appYamlPath, "expected parameter 'appYamlPath' to be non-null");
        this.cloudBuildTimeout = Objects.requireNonNull(cloudBuildTimeout, "expected parameter 'cloudBuildTimeout' to be non-null");
    }

    private CloudBuildOptionsResponse() {
        this.appYamlPath = null;
        this.cloudBuildTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudBuildOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appYamlPath;
        private String cloudBuildTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudBuildOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appYamlPath = defaults.appYamlPath;
    	      this.cloudBuildTimeout = defaults.cloudBuildTimeout;
        }

        public Builder setAppYamlPath(String appYamlPath) {
            this.appYamlPath = Objects.requireNonNull(appYamlPath);
            return this;
        }

        public Builder setCloudBuildTimeout(String cloudBuildTimeout) {
            this.cloudBuildTimeout = Objects.requireNonNull(cloudBuildTimeout);
            return this;
        }

        public CloudBuildOptionsResponse build() {
            return new CloudBuildOptionsResponse(appYamlPath, cloudBuildTimeout);
        }
    }
}
