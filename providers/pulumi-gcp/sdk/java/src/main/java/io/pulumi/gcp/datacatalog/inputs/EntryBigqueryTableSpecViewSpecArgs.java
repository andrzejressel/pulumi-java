// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryBigqueryTableSpecViewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryTableSpecViewSpecArgs Empty = new EntryBigqueryTableSpecViewSpecArgs();

    @InputImport(name="viewQuery")
    private final @Nullable Input<String> viewQuery;

    public Input<String> getViewQuery() {
        return this.viewQuery == null ? Input.empty() : this.viewQuery;
    }

    public EntryBigqueryTableSpecViewSpecArgs(@Nullable Input<String> viewQuery) {
        this.viewQuery = viewQuery;
    }

    private EntryBigqueryTableSpecViewSpecArgs() {
        this.viewQuery = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecViewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> viewQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryTableSpecViewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewQuery = defaults.viewQuery;
        }

        public Builder setViewQuery(@Nullable Input<String> viewQuery) {
            this.viewQuery = viewQuery;
            return this;
        }

        public Builder setViewQuery(@Nullable String viewQuery) {
            this.viewQuery = Input.ofNullable(viewQuery);
            return this;
        }

        public EntryBigqueryTableSpecViewSpecArgs build() {
            return new EntryBigqueryTableSpecViewSpecArgs(viewQuery);
        }
    }
}
