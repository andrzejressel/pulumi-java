// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.LauncherActivityIntentResponse;
import io.pulumi.googlenative.testing_v1.outputs.StartActivityIntentResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RoboStartingIntentResponse {
    /**
     * An intent that starts the main launcher activity.
     * 
     */
    private final LauncherActivityIntentResponse launcherActivity;
    /**
     * An intent that starts an activity with specific details.
     * 
     */
    private final StartActivityIntentResponse startActivity;
    /**
     * Timeout in seconds for each intent.
     * 
     */
    private final String timeout;

    @OutputCustomType.Constructor({"launcherActivity","startActivity","timeout"})
    private RoboStartingIntentResponse(
        LauncherActivityIntentResponse launcherActivity,
        StartActivityIntentResponse startActivity,
        String timeout) {
        this.launcherActivity = Objects.requireNonNull(launcherActivity);
        this.startActivity = Objects.requireNonNull(startActivity);
        this.timeout = Objects.requireNonNull(timeout);
    }

    /**
     * An intent that starts the main launcher activity.
     * 
     */
    public LauncherActivityIntentResponse getLauncherActivity() {
        return this.launcherActivity;
    }
    /**
     * An intent that starts an activity with specific details.
     * 
     */
    public StartActivityIntentResponse getStartActivity() {
        return this.startActivity;
    }
    /**
     * Timeout in seconds for each intent.
     * 
     */
    public String getTimeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoboStartingIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LauncherActivityIntentResponse launcherActivity;
        private StartActivityIntentResponse startActivity;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RoboStartingIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launcherActivity = defaults.launcherActivity;
    	      this.startActivity = defaults.startActivity;
    	      this.timeout = defaults.timeout;
        }

        public Builder setLauncherActivity(LauncherActivityIntentResponse launcherActivity) {
            this.launcherActivity = Objects.requireNonNull(launcherActivity);
            return this;
        }

        public Builder setStartActivity(StartActivityIntentResponse startActivity) {
            this.startActivity = Objects.requireNonNull(startActivity);
            return this;
        }

        public Builder setTimeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public RoboStartingIntentResponse build() {
            return new RoboStartingIntentResponse(launcherActivity, startActivity, timeout);
        }
    }
}
