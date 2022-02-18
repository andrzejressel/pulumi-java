// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetNodeTypesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A list of node types available in the given zone and project.
     * 
     */
    private final List<String> names;
    private final String project;
    private final String zone;

    @OutputCustomType.Constructor({"id","names","project","zone"})
    private GetNodeTypesResult(
        String id,
        List<String> names,
        String project,
        String zone) {
        this.id = Objects.requireNonNull(id);
        this.names = Objects.requireNonNull(names);
        this.project = Objects.requireNonNull(project);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * A list of node types available in the given zone and project.
     * 
     */
    public List<String> getNames() {
        return this.names;
    }
    public String getProject() {
        return this.project;
    }
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeTypesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> names;
        private String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.names = defaults.names;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetNodeTypesResult build() {
            return new GetNodeTypesResult(id, names, project, zone);
        }
    }
}
