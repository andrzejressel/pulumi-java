// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketAccessControlProjectTeamResponse {
    /**
     * The project number.
     * 
     */
    private final String projectNumber;
    /**
     * The team.
     * 
     */
    private final String team;

    @OutputCustomType.Constructor({"projectNumber","team"})
    private BucketAccessControlProjectTeamResponse(
        String projectNumber,
        String team) {
        this.projectNumber = Objects.requireNonNull(projectNumber);
        this.team = Objects.requireNonNull(team);
    }

    /**
     * The project number.
     * 
     */
    public String getProjectNumber() {
        return this.projectNumber;
    }
    /**
     * The team.
     * 
     */
    public String getTeam() {
        return this.team;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessControlProjectTeamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String projectNumber;
        private String team;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessControlProjectTeamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectNumber = defaults.projectNumber;
    	      this.team = defaults.team;
        }

        public Builder setProjectNumber(String projectNumber) {
            this.projectNumber = Objects.requireNonNull(projectNumber);
            return this;
        }

        public Builder setTeam(String team) {
            this.team = Objects.requireNonNull(team);
            return this;
        }

        public BucketAccessControlProjectTeamResponse build() {
            return new BucketAccessControlProjectTeamResponse(projectNumber, team);
        }
    }
}
