// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.recaptchaenterprise_v1.inputs.GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs;
import io.pulumi.googlenative.recaptchaenterprise_v1.inputs.GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs;
import io.pulumi.googlenative.recaptchaenterprise_v1.inputs.GoogleCloudRecaptchaenterpriseV1TestingOptionsArgs;
import io.pulumi.googlenative.recaptchaenterprise_v1.inputs.GoogleCloudRecaptchaenterpriseV1WafSettingsArgs;
import io.pulumi.googlenative.recaptchaenterprise_v1.inputs.GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * Settings for keys that can be used by Android apps.
     * 
     */
    @InputImport(name="androidSettings")
    private final @Nullable Input<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs> androidSettings;

    public Input<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs> getAndroidSettings() {
        return this.androidSettings == null ? Input.empty() : this.androidSettings;
    }

    /**
     * The timestamp corresponding to the creation of this Key.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Human-readable display name of this key. Modifiable by user.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Settings for keys that can be used by iOS apps.
     * 
     */
    @InputImport(name="iosSettings")
    private final @Nullable Input<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs> iosSettings;

    public Input<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs> getIosSettings() {
        return this.iosSettings == null ? Input.empty() : this.iosSettings;
    }

    /**
     * See Creating and managing labels.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The resource name for the Key in the format "projects/{project}/keys/{key}".
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Options for user acceptance testing.
     * 
     */
    @InputImport(name="testingOptions")
    private final @Nullable Input<GoogleCloudRecaptchaenterpriseV1TestingOptionsArgs> testingOptions;

    public Input<GoogleCloudRecaptchaenterpriseV1TestingOptionsArgs> getTestingOptions() {
        return this.testingOptions == null ? Input.empty() : this.testingOptions;
    }

    /**
     * Settings for WAF
     * 
     */
    @InputImport(name="wafSettings")
    private final @Nullable Input<GoogleCloudRecaptchaenterpriseV1WafSettingsArgs> wafSettings;

    public Input<GoogleCloudRecaptchaenterpriseV1WafSettingsArgs> getWafSettings() {
        return this.wafSettings == null ? Input.empty() : this.wafSettings;
    }

    /**
     * Settings for keys that can be used by websites.
     * 
     */
    @InputImport(name="webSettings")
    private final @Nullable Input<GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs> webSettings;

    public Input<GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs> getWebSettings() {
        return this.webSettings == null ? Input.empty() : this.webSettings;
    }

    public KeyArgs(
        @Nullable Input<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs> androidSettings,
        @Nullable Input<String> createTime,
        @Nullable Input<String> displayName,
        @Nullable Input<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs> iosSettings,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<GoogleCloudRecaptchaenterpriseV1TestingOptionsArgs> testingOptions,
        @Nullable Input<GoogleCloudRecaptchaenterpriseV1WafSettingsArgs> wafSettings,
        @Nullable Input<GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs> webSettings) {
        this.androidSettings = androidSettings;
        this.createTime = createTime;
        this.displayName = displayName;
        this.iosSettings = iosSettings;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.testingOptions = testingOptions;
        this.wafSettings = wafSettings;
        this.webSettings = webSettings;
    }

    private KeyArgs() {
        this.androidSettings = Input.empty();
        this.createTime = Input.empty();
        this.displayName = Input.empty();
        this.iosSettings = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.testingOptions = Input.empty();
        this.wafSettings = Input.empty();
        this.webSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs> androidSettings;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> displayName;
        private @Nullable Input<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs> iosSettings;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<GoogleCloudRecaptchaenterpriseV1TestingOptionsArgs> testingOptions;
        private @Nullable Input<GoogleCloudRecaptchaenterpriseV1WafSettingsArgs> wafSettings;
        private @Nullable Input<GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs> webSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidSettings = defaults.androidSettings;
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.iosSettings = defaults.iosSettings;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.testingOptions = defaults.testingOptions;
    	      this.wafSettings = defaults.wafSettings;
    	      this.webSettings = defaults.webSettings;
        }

        public Builder setAndroidSettings(@Nullable Input<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs> androidSettings) {
            this.androidSettings = androidSettings;
            return this;
        }

        public Builder setAndroidSettings(@Nullable GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs androidSettings) {
            this.androidSettings = Input.ofNullable(androidSettings);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setIosSettings(@Nullable Input<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs> iosSettings) {
            this.iosSettings = iosSettings;
            return this;
        }

        public Builder setIosSettings(@Nullable GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs iosSettings) {
            this.iosSettings = Input.ofNullable(iosSettings);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTestingOptions(@Nullable Input<GoogleCloudRecaptchaenterpriseV1TestingOptionsArgs> testingOptions) {
            this.testingOptions = testingOptions;
            return this;
        }

        public Builder setTestingOptions(@Nullable GoogleCloudRecaptchaenterpriseV1TestingOptionsArgs testingOptions) {
            this.testingOptions = Input.ofNullable(testingOptions);
            return this;
        }

        public Builder setWafSettings(@Nullable Input<GoogleCloudRecaptchaenterpriseV1WafSettingsArgs> wafSettings) {
            this.wafSettings = wafSettings;
            return this;
        }

        public Builder setWafSettings(@Nullable GoogleCloudRecaptchaenterpriseV1WafSettingsArgs wafSettings) {
            this.wafSettings = Input.ofNullable(wafSettings);
            return this;
        }

        public Builder setWebSettings(@Nullable Input<GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs> webSettings) {
            this.webSettings = webSettings;
            return this;
        }

        public Builder setWebSettings(@Nullable GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs webSettings) {
            this.webSettings = Input.ofNullable(webSettings);
            return this;
        }

        public KeyArgs build() {
            return new KeyArgs(androidSettings, createTime, displayName, iosSettings, labels, name, project, testingOptions, wafSettings, webSettings);
        }
    }
}
