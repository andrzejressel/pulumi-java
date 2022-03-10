// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TemplateLinkResponse {
    /**
     * If included, must match the ContentVersion in the template.
     * 
     */
    private final @Nullable String contentVersion;
    /**
     * The resource id of a Template Spec. Use either the id or uri property, but not both.
     * 
     */
    private final @Nullable String id;
    /**
     * The query string (for example, a SAS token) to be used with the templateLink URI.
     * 
     */
    private final @Nullable String queryString;
    /**
     * The relativePath property can be used to deploy a linked template at a location relative to the parent. If the parent template was linked with a TemplateSpec, this will reference an artifact in the TemplateSpec.  If the parent was linked with a URI, the child deployment will be a combination of the parent and relativePath URIs
     * 
     */
    private final @Nullable String relativePath;
    /**
     * The URI of the template to deploy. Use either the uri or id property, but not both.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor
    private TemplateLinkResponse(
        @OutputCustomType.Parameter("contentVersion") @Nullable String contentVersion,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("queryString") @Nullable String queryString,
        @OutputCustomType.Parameter("relativePath") @Nullable String relativePath,
        @OutputCustomType.Parameter("uri") @Nullable String uri) {
        this.contentVersion = contentVersion;
        this.id = id;
        this.queryString = queryString;
        this.relativePath = relativePath;
        this.uri = uri;
    }

    /**
     * If included, must match the ContentVersion in the template.
     * 
    */
    public Optional<String> getContentVersion() {
        return Optional.ofNullable(this.contentVersion);
    }
    /**
     * The resource id of a Template Spec. Use either the id or uri property, but not both.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The query string (for example, a SAS token) to be used with the templateLink URI.
     * 
    */
    public Optional<String> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * The relativePath property can be used to deploy a linked template at a location relative to the parent. If the parent template was linked with a TemplateSpec, this will reference an artifact in the TemplateSpec.  If the parent was linked with a URI, the child deployment will be a combination of the parent and relativePath URIs
     * 
    */
    public Optional<String> getRelativePath() {
        return Optional.ofNullable(this.relativePath);
    }
    /**
     * The URI of the template to deploy. Use either the uri or id property, but not both.
     * 
    */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentVersion;
        private @Nullable String id;
        private @Nullable String queryString;
        private @Nullable String relativePath;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentVersion = defaults.contentVersion;
    	      this.id = defaults.id;
    	      this.queryString = defaults.queryString;
    	      this.relativePath = defaults.relativePath;
    	      this.uri = defaults.uri;
        }

        public Builder setContentVersion(@Nullable String contentVersion) {
            this.contentVersion = contentVersion;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setQueryString(@Nullable String queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setRelativePath(@Nullable String relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public TemplateLinkResponse build() {
            return new TemplateLinkResponse(contentVersion, id, queryString, relativePath, uri);
        }
    }
}
