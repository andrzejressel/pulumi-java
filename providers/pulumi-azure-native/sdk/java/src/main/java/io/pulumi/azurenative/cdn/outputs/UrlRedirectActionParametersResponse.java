// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UrlRedirectActionParametersResponse {
    /**
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    private final @Nullable String customFragment;
    /**
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    private final @Nullable String customHostname;
    /**
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    private final @Nullable String customPath;
    /**
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in <key>=<value> format. ? and & will be added automatically so do not include them.
     * 
     */
    private final @Nullable String customQueryString;
    /**
     * Protocol to use for the redirect. The default value is MatchRequest
     * 
     */
    private final @Nullable String destinationProtocol;
    private final String odataType;
    /**
     * The redirect type the rule will use when redirecting traffic.
     * 
     */
    private final String redirectType;

    @OutputCustomType.Constructor
    private UrlRedirectActionParametersResponse(
        @OutputCustomType.Parameter("customFragment") @Nullable String customFragment,
        @OutputCustomType.Parameter("customHostname") @Nullable String customHostname,
        @OutputCustomType.Parameter("customPath") @Nullable String customPath,
        @OutputCustomType.Parameter("customQueryString") @Nullable String customQueryString,
        @OutputCustomType.Parameter("destinationProtocol") @Nullable String destinationProtocol,
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("redirectType") String redirectType) {
        this.customFragment = customFragment;
        this.customHostname = customHostname;
        this.customPath = customPath;
        this.customQueryString = customQueryString;
        this.destinationProtocol = destinationProtocol;
        this.odataType = odataType;
        this.redirectType = redirectType;
    }

    /**
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
    */
    public Optional<String> getCustomFragment() {
        return Optional.ofNullable(this.customFragment);
    }
    /**
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
    */
    public Optional<String> getCustomHostname() {
        return Optional.ofNullable(this.customHostname);
    }
    /**
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
    */
    public Optional<String> getCustomPath() {
        return Optional.ofNullable(this.customPath);
    }
    /**
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in <key>=<value> format. ? and & will be added automatically so do not include them.
     * 
    */
    public Optional<String> getCustomQueryString() {
        return Optional.ofNullable(this.customQueryString);
    }
    /**
     * Protocol to use for the redirect. The default value is MatchRequest
     * 
    */
    public Optional<String> getDestinationProtocol() {
        return Optional.ofNullable(this.destinationProtocol);
    }
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The redirect type the rule will use when redirecting traffic.
     * 
    */
    public String getRedirectType() {
        return this.redirectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRedirectActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customFragment;
        private @Nullable String customHostname;
        private @Nullable String customPath;
        private @Nullable String customQueryString;
        private @Nullable String destinationProtocol;
        private String odataType;
        private String redirectType;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRedirectActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFragment = defaults.customFragment;
    	      this.customHostname = defaults.customHostname;
    	      this.customPath = defaults.customPath;
    	      this.customQueryString = defaults.customQueryString;
    	      this.destinationProtocol = defaults.destinationProtocol;
    	      this.odataType = defaults.odataType;
    	      this.redirectType = defaults.redirectType;
        }

        public Builder setCustomFragment(@Nullable String customFragment) {
            this.customFragment = customFragment;
            return this;
        }

        public Builder setCustomHostname(@Nullable String customHostname) {
            this.customHostname = customHostname;
            return this;
        }

        public Builder setCustomPath(@Nullable String customPath) {
            this.customPath = customPath;
            return this;
        }

        public Builder setCustomQueryString(@Nullable String customQueryString) {
            this.customQueryString = customQueryString;
            return this;
        }

        public Builder setDestinationProtocol(@Nullable String destinationProtocol) {
            this.destinationProtocol = destinationProtocol;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setRedirectType(String redirectType) {
            this.redirectType = Objects.requireNonNull(redirectType);
            return this;
        }
        public UrlRedirectActionParametersResponse build() {
            return new UrlRedirectActionParametersResponse(customFragment, customHostname, customPath, customQueryString, destinationProtocol, odataType, redirectType);
        }
    }
}
