// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapHostRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapHostRuleGetArgs Empty = new URLMapHostRuleGetArgs();

    /**
     * Description of this test case.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The list of host patterns to match. They must be valid hostnames, except * will
     * match any string of ([a-z0-9-.]*). In that case, * must be the first character
     * and must be followed in the pattern by either - or ..
     * 
     */
    @InputImport(name="hosts", required=true)
    private final Input<List<String>> hosts;

    public Input<List<String>> getHosts() {
        return this.hosts;
    }

    /**
     * The name of the PathMatcher to use to match the path portion of the URL if the
     * hostRule matches the URL's host portion.
     * 
     */
    @InputImport(name="pathMatcher", required=true)
    private final Input<String> pathMatcher;

    public Input<String> getPathMatcher() {
        return this.pathMatcher;
    }

    public URLMapHostRuleGetArgs(
        @Nullable Input<String> description,
        Input<List<String>> hosts,
        Input<String> pathMatcher) {
        this.description = description;
        this.hosts = Objects.requireNonNull(hosts, "expected parameter 'hosts' to be non-null");
        this.pathMatcher = Objects.requireNonNull(pathMatcher, "expected parameter 'pathMatcher' to be non-null");
    }

    private URLMapHostRuleGetArgs() {
        this.description = Input.empty();
        this.hosts = Input.empty();
        this.pathMatcher = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapHostRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<List<String>> hosts;
        private Input<String> pathMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapHostRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hosts = defaults.hosts;
    	      this.pathMatcher = defaults.pathMatcher;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHosts(Input<List<String>> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder setHosts(List<String> hosts) {
            this.hosts = Input.of(Objects.requireNonNull(hosts));
            return this;
        }

        public Builder setPathMatcher(Input<String> pathMatcher) {
            this.pathMatcher = Objects.requireNonNull(pathMatcher);
            return this;
        }

        public Builder setPathMatcher(String pathMatcher) {
            this.pathMatcher = Input.of(Objects.requireNonNull(pathMatcher));
            return this;
        }

        public URLMapHostRuleGetArgs build() {
            return new URLMapHostRuleGetArgs(description, hosts, pathMatcher);
        }
    }
}
