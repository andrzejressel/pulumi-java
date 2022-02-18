// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFoldersArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFoldersArgs Empty = new GetFoldersArgs();

    /**
     * A string parent as defined in the [REST API](https://cloud.google.com/resource-manager/reference/rest/v3/folders/list#query-parameters).
     * 
     */
    @InputImport(name="parentId", required=true)
    private final String parentId;

    public String getParentId() {
        return this.parentId;
    }

    public GetFoldersArgs(String parentId) {
        this.parentId = Objects.requireNonNull(parentId, "expected parameter 'parentId' to be non-null");
    }

    private GetFoldersArgs() {
        this.parentId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFoldersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFoldersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parentId = defaults.parentId;
        }

        public Builder setParentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }

        public GetFoldersArgs build() {
            return new GetFoldersArgs(parentId);
        }
    }
}
