// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceApiMethodArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceApiMethodArgs Empty = new ServiceApiMethodArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="requestType")
    private final @Nullable Input<String> requestType;

    public Input<String> getRequestType() {
        return this.requestType == null ? Input.empty() : this.requestType;
    }

    @InputImport(name="responseType")
    private final @Nullable Input<String> responseType;

    public Input<String> getResponseType() {
        return this.responseType == null ? Input.empty() : this.responseType;
    }

    @InputImport(name="syntax")
    private final @Nullable Input<String> syntax;

    public Input<String> getSyntax() {
        return this.syntax == null ? Input.empty() : this.syntax;
    }

    public ServiceApiMethodArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> requestType,
        @Nullable Input<String> responseType,
        @Nullable Input<String> syntax) {
        this.name = name;
        this.requestType = requestType;
        this.responseType = responseType;
        this.syntax = syntax;
    }

    private ServiceApiMethodArgs() {
        this.name = Input.empty();
        this.requestType = Input.empty();
        this.responseType = Input.empty();
        this.syntax = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceApiMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> requestType;
        private @Nullable Input<String> responseType;
        private @Nullable Input<String> syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceApiMethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.requestType = defaults.requestType;
    	      this.responseType = defaults.responseType;
    	      this.syntax = defaults.syntax;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRequestType(@Nullable Input<String> requestType) {
            this.requestType = requestType;
            return this;
        }

        public Builder setRequestType(@Nullable String requestType) {
            this.requestType = Input.ofNullable(requestType);
            return this;
        }

        public Builder setResponseType(@Nullable Input<String> responseType) {
            this.responseType = responseType;
            return this;
        }

        public Builder setResponseType(@Nullable String responseType) {
            this.responseType = Input.ofNullable(responseType);
            return this;
        }

        public Builder setSyntax(@Nullable Input<String> syntax) {
            this.syntax = syntax;
            return this;
        }

        public Builder setSyntax(@Nullable String syntax) {
            this.syntax = Input.ofNullable(syntax);
            return this;
        }

        public ServiceApiMethodArgs build() {
            return new ServiceApiMethodArgs(name, requestType, responseType, syntax);
        }
    }
}
