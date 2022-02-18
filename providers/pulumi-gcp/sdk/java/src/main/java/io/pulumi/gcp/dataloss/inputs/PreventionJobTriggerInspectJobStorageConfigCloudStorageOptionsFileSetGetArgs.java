// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs();

    /**
     * The regex-filtered set of files to scan.
     * Structure is documented below.
     * 
     */
    @InputImport(name="regexFileSet")
    private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> regexFileSet;

    public Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> getRegexFileSet() {
        return this.regexFileSet == null ? Input.empty() : this.regexFileSet;
    }

    /**
     * The Cloud Storage url of the file(s) to scan, in the format `gs://<bucket>/<path>`. Trailing wildcard
     * in the path is allowed.
     * If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned
     * non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is
     * equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`.
     * 
     */
    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs(
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> regexFileSet,
        @Nullable Input<String> url) {
        this.regexFileSet = regexFileSet;
        this.url = url;
    }

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs() {
        this.regexFileSet = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> regexFileSet;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexFileSet = defaults.regexFileSet;
    	      this.url = defaults.url;
        }

        public Builder setRegexFileSet(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> regexFileSet) {
            this.regexFileSet = regexFileSet;
            return this;
        }

        public Builder setRegexFileSet(@Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs regexFileSet) {
            this.regexFileSet = Input.ofNullable(regexFileSet);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs(regexFileSet, url);
        }
    }
}
