// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ShareSettingsResponse {
    /**
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    private final Map<String,String> projectMap;
    /**
     * A List of Project names to specify consumer projects for this shared-reservation. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    private final List<String> projects;
    /**
     * Type of sharing for this shared-reservation
     * 
     */
    private final String shareType;

    @OutputCustomType.Constructor({"projectMap","projects","shareType"})
    private ShareSettingsResponse(
        Map<String,String> projectMap,
        List<String> projects,
        String shareType) {
        this.projectMap = Objects.requireNonNull(projectMap);
        this.projects = Objects.requireNonNull(projects);
        this.shareType = Objects.requireNonNull(shareType);
    }

    /**
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    public Map<String,String> getProjectMap() {
        return this.projectMap;
    }
    /**
     * A List of Project names to specify consumer projects for this shared-reservation. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    public List<String> getProjects() {
        return this.projects;
    }
    /**
     * Type of sharing for this shared-reservation
     * 
     */
    public String getShareType() {
        return this.shareType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> projectMap;
        private List<String> projects;
        private String shareType;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectMap = defaults.projectMap;
    	      this.projects = defaults.projects;
    	      this.shareType = defaults.shareType;
        }

        public Builder setProjectMap(Map<String,String> projectMap) {
            this.projectMap = Objects.requireNonNull(projectMap);
            return this;
        }

        public Builder setProjects(List<String> projects) {
            this.projects = Objects.requireNonNull(projects);
            return this;
        }

        public Builder setShareType(String shareType) {
            this.shareType = Objects.requireNonNull(shareType);
            return this;
        }

        public ShareSettingsResponse build() {
            return new ShareSettingsResponse(projectMap, projects, shareType);
        }
    }
}
