// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A unique identifier for a Cloud Repo.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse Empty = new GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse();

    /**
     * A combination of a project ID and a repo name.
     * 
     */
    @InputImport(name="projectRepoId", required=true)
    private final GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse projectRepoId;

    public GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse getProjectRepoId() {
        return this.projectRepoId;
    }

    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    @InputImport(name="uid", required=true)
    private final String uid;

    public String getUid() {
        return this.uid;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse(
        GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse projectRepoId,
        String uid) {
        this.projectRepoId = Objects.requireNonNull(projectRepoId, "expected parameter 'projectRepoId' to be non-null");
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
    }

    private GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse() {
        this.projectRepoId = null;
        this.uid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse projectRepoId;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectRepoId = defaults.projectRepoId;
    	      this.uid = defaults.uid;
        }

        public Builder setProjectRepoId(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse projectRepoId) {
            this.projectRepoId = Objects.requireNonNull(projectRepoId);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse(projectRepoId, uid);
        }
    }
}
