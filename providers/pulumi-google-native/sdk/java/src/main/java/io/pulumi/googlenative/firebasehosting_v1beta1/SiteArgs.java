// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteArgs Empty = new SiteArgs();

    /**
     * Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id) associated with the Hosting site.
     * 
     */
    @InputImport(name="appId")
    private final @Nullable Input<String> appId;

    public Input<String> getAppId() {
        return this.appId == null ? Input.empty() : this.appId;
    }

    /**
     * Optional. User-specified labels for the Hosting site.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="siteId", required=true)
    private final Input<String> siteId;

    public Input<String> getSiteId() {
        return this.siteId;
    }

    public SiteArgs(
        @Nullable Input<String> appId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> project,
        Input<String> siteId) {
        this.appId = appId;
        this.labels = labels;
        this.project = project;
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
    }

    private SiteArgs() {
        this.appId = Input.empty();
        this.labels = Input.empty();
        this.project = Input.empty();
        this.siteId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> project;
        private Input<String> siteId;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.siteId = defaults.siteId;
        }

        public Builder setAppId(@Nullable Input<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = Input.ofNullable(appId);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSiteId(Input<String> siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }

        public Builder setSiteId(String siteId) {
            this.siteId = Input.of(Objects.requireNonNull(siteId));
            return this;
        }

        public SiteArgs build() {
            return new SiteArgs(appId, labels, project, siteId);
        }
    }
}
