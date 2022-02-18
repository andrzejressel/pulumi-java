// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class KnowledgeBaseResponse extends io.pulumi.resources.InvokeArgs {

    public static final KnowledgeBaseResponse Empty = new KnowledgeBaseResponse();

    /**
     * The KB name (generally of the form KB[0-9]+ (e.g., KB123456)).
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * A link to the KB in the [Windows update catalog] (https://www.catalog.update.microsoft.com/).
     * 
     */
    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    public KnowledgeBaseResponse(
        String name,
        String url) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private KnowledgeBaseResponse() {
        this.name = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public KnowledgeBaseResponse build() {
            return new KnowledgeBaseResponse(name, url);
        }
    }
}
