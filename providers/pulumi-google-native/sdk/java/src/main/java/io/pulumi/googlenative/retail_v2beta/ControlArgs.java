// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.retail_v2beta.enums.ControlSolutionTypesItem;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaSearchRequestFacetSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControlArgs Empty = new ControlArgs();

    @InputImport(name="catalogId", required=true)
    private final Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId;
    }

    @InputImport(name="controlId", required=true)
    private final Input<String> controlId;

    public Input<String> getControlId() {
        return this.controlId;
    }

    /**
     * The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * A facet specification to perform faceted search.
     * 
     */
    @InputImport(name="facetSpec")
    private final @Nullable Input<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> facetSpec;

    public Input<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> getFacetSpec() {
        return this.facetSpec == null ? Input.empty() : this.facetSpec;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}controls/*
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
     * A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost "gShoe" when query full matches "Running Shoes".
     * 
     */
    @InputImport(name="rule")
    private final @Nullable Input<GoogleCloudRetailV2betaRuleArgs> rule;

    public Input<GoogleCloudRetailV2betaRuleArgs> getRule() {
        return this.rule == null ? Input.empty() : this.rule;
    }

    /**
     * Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
     * 
     */
    @InputImport(name="solutionTypes", required=true)
    private final Input<List<ControlSolutionTypesItem>> solutionTypes;

    public Input<List<ControlSolutionTypesItem>> getSolutionTypes() {
        return this.solutionTypes;
    }

    public ControlArgs(
        Input<String> catalogId,
        Input<String> controlId,
        Input<String> displayName,
        @Nullable Input<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> facetSpec,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<GoogleCloudRetailV2betaRuleArgs> rule,
        Input<List<ControlSolutionTypesItem>> solutionTypes) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.controlId = Objects.requireNonNull(controlId, "expected parameter 'controlId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.facetSpec = facetSpec;
        this.location = location;
        this.name = name;
        this.project = project;
        this.rule = rule;
        this.solutionTypes = Objects.requireNonNull(solutionTypes, "expected parameter 'solutionTypes' to be non-null");
    }

    private ControlArgs() {
        this.catalogId = Input.empty();
        this.controlId = Input.empty();
        this.displayName = Input.empty();
        this.facetSpec = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.rule = Input.empty();
        this.solutionTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> catalogId;
        private Input<String> controlId;
        private Input<String> displayName;
        private @Nullable Input<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> facetSpec;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<GoogleCloudRetailV2betaRuleArgs> rule;
        private Input<List<ControlSolutionTypesItem>> solutionTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.controlId = defaults.controlId;
    	      this.displayName = defaults.displayName;
    	      this.facetSpec = defaults.facetSpec;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rule = defaults.rule;
    	      this.solutionTypes = defaults.solutionTypes;
        }

        public Builder setCatalogId(Input<String> catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder setCatalogId(String catalogId) {
            this.catalogId = Input.of(Objects.requireNonNull(catalogId));
            return this;
        }

        public Builder setControlId(Input<String> controlId) {
            this.controlId = Objects.requireNonNull(controlId);
            return this;
        }

        public Builder setControlId(String controlId) {
            this.controlId = Input.of(Objects.requireNonNull(controlId));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setFacetSpec(@Nullable Input<GoogleCloudRetailV2betaSearchRequestFacetSpecArgs> facetSpec) {
            this.facetSpec = facetSpec;
            return this;
        }

        public Builder setFacetSpec(@Nullable GoogleCloudRetailV2betaSearchRequestFacetSpecArgs facetSpec) {
            this.facetSpec = Input.ofNullable(facetSpec);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setRule(@Nullable Input<GoogleCloudRetailV2betaRuleArgs> rule) {
            this.rule = rule;
            return this;
        }

        public Builder setRule(@Nullable GoogleCloudRetailV2betaRuleArgs rule) {
            this.rule = Input.ofNullable(rule);
            return this;
        }

        public Builder setSolutionTypes(Input<List<ControlSolutionTypesItem>> solutionTypes) {
            this.solutionTypes = Objects.requireNonNull(solutionTypes);
            return this;
        }

        public Builder setSolutionTypes(List<ControlSolutionTypesItem> solutionTypes) {
            this.solutionTypes = Input.of(Objects.requireNonNull(solutionTypes));
            return this;
        }

        public ControlArgs build() {
            return new ControlArgs(catalogId, controlId, displayName, facetSpec, location, name, project, rule, solutionTypes);
        }
    }
}
