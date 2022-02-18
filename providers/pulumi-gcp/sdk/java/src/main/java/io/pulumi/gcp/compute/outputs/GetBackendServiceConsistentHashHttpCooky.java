// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetBackendServiceConsistentHashHttpCookyTtl;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBackendServiceConsistentHashHttpCooky {
    /**
     * The name of the Backend Service.
     * 
     */
    private final String name;
    private final String path;
    private final List<GetBackendServiceConsistentHashHttpCookyTtl> ttls;

    @OutputCustomType.Constructor({"name","path","ttls"})
    private GetBackendServiceConsistentHashHttpCooky(
        String name,
        String path,
        List<GetBackendServiceConsistentHashHttpCookyTtl> ttls) {
        this.name = Objects.requireNonNull(name);
        this.path = Objects.requireNonNull(path);
        this.ttls = Objects.requireNonNull(ttls);
    }

    /**
     * The name of the Backend Service.
     * 
     */
    public String getName() {
        return this.name;
    }
    public String getPath() {
        return this.path;
    }
    public List<GetBackendServiceConsistentHashHttpCookyTtl> getTtls() {
        return this.ttls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceConsistentHashHttpCooky defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String path;
        private List<GetBackendServiceConsistentHashHttpCookyTtl> ttls;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceConsistentHashHttpCooky defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttls = defaults.ttls;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setTtls(List<GetBackendServiceConsistentHashHttpCookyTtl> ttls) {
            this.ttls = Objects.requireNonNull(ttls);
            return this;
        }

        public GetBackendServiceConsistentHashHttpCooky build() {
            return new GetBackendServiceConsistentHashHttpCooky(name, path, ttls);
        }
    }
}
