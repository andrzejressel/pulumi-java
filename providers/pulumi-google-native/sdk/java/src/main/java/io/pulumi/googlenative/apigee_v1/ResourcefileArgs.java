// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcefileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcefileArgs Empty = new ResourcefileArgs();

    /**
     * The HTTP Content-Type header value specifying the content type of the body.
     * 
     */
    @InputImport(name="contentType")
    private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * The HTTP request/response body as raw binary.
     * 
     */
    @InputImport(name="data")
    private final @Nullable Input<String> data;

    public Input<String> getData() {
        return this.data == null ? Input.empty() : this.data;
    }

    @InputImport(name="environmentId", required=true)
    private final Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * Application specific response metadata. Must be set in the first response for streaming APIs.
     * 
     */
    @InputImport(name="extensions")
    private final @Nullable Input<List<Map<String,String>>> extensions;

    public Input<List<Map<String,String>>> getExtensions() {
        return this.extensions == null ? Input.empty() : this.extensions;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
    private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ResourcefileArgs(
        @Nullable Input<String> contentType,
        @Nullable Input<String> data,
        Input<String> environmentId,
        @Nullable Input<List<Map<String,String>>> extensions,
        @Nullable Input<String> name,
        Input<String> organizationId,
        Input<String> type) {
        this.contentType = contentType;
        this.data = data;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.extensions = extensions;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ResourcefileArgs() {
        this.contentType = Input.empty();
        this.data = Input.empty();
        this.environmentId = Input.empty();
        this.extensions = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcefileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contentType;
        private @Nullable Input<String> data;
        private Input<String> environmentId;
        private @Nullable Input<List<Map<String,String>>> extensions;
        private @Nullable Input<String> name;
        private Input<String> organizationId;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcefileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.data = defaults.data;
    	      this.environmentId = defaults.environmentId;
    	      this.extensions = defaults.extensions;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.type = defaults.type;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setData(@Nullable Input<String> data) {
            this.data = data;
            return this;
        }

        public Builder setData(@Nullable String data) {
            this.data = Input.ofNullable(data);
            return this;
        }

        public Builder setEnvironmentId(Input<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder setEnvironmentId(String environmentId) {
            this.environmentId = Input.of(Objects.requireNonNull(environmentId));
            return this;
        }

        public Builder setExtensions(@Nullable Input<List<Map<String,String>>> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder setExtensions(@Nullable List<Map<String,String>> extensions) {
            this.extensions = Input.ofNullable(extensions);
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

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ResourcefileArgs build() {
            return new ResourcefileArgs(contentType, data, environmentId, extensions, name, organizationId, type);
        }
    }
}
