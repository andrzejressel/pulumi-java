// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBucketWebsite extends io.pulumi.resources.InvokeArgs {

    public static final GetBucketWebsite Empty = new GetBucketWebsite();

    @InputImport(name="mainPageSuffix", required=true)
    private final String mainPageSuffix;

    public String getMainPageSuffix() {
        return this.mainPageSuffix;
    }

    @InputImport(name="notFoundPage", required=true)
    private final String notFoundPage;

    public String getNotFoundPage() {
        return this.notFoundPage;
    }

    public GetBucketWebsite(
        String mainPageSuffix,
        String notFoundPage) {
        this.mainPageSuffix = Objects.requireNonNull(mainPageSuffix, "expected parameter 'mainPageSuffix' to be non-null");
        this.notFoundPage = Objects.requireNonNull(notFoundPage, "expected parameter 'notFoundPage' to be non-null");
    }

    private GetBucketWebsite() {
        this.mainPageSuffix = null;
        this.notFoundPage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketWebsite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mainPageSuffix;
        private String notFoundPage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketWebsite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mainPageSuffix = defaults.mainPageSuffix;
    	      this.notFoundPage = defaults.notFoundPage;
        }

        public Builder setMainPageSuffix(String mainPageSuffix) {
            this.mainPageSuffix = Objects.requireNonNull(mainPageSuffix);
            return this;
        }

        public Builder setNotFoundPage(String notFoundPage) {
            this.notFoundPage = Objects.requireNonNull(notFoundPage);
            return this;
        }

        public GetBucketWebsite build() {
            return new GetBucketWebsite(mainPageSuffix, notFoundPage);
        }
    }
}
