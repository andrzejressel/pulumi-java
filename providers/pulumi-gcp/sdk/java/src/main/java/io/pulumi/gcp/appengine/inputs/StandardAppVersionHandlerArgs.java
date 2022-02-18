// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerScriptArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerStaticFilesArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardAppVersionHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionHandlerArgs Empty = new StandardAppVersionHandlerArgs();

    /**
     * Actions to take when the user is not logged in.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    @InputImport(name="authFailAction")
    private final @Nullable Input<String> authFailAction;

    public Input<String> getAuthFailAction() {
        return this.authFailAction == null ? Input.empty() : this.authFailAction;
    }

    /**
     * Methods to restrict access to a URL based on login status.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    @InputImport(name="login")
    private final @Nullable Input<String> login;

    public Input<String> getLogin() {
        return this.login == null ? Input.empty() : this.login;
    }

    /**
     * 30x code to use when performing redirects for the secure field.
     * Possible values are `REDIRECT_HTTP_RESPONSE_CODE_301`, `REDIRECT_HTTP_RESPONSE_CODE_302`, `REDIRECT_HTTP_RESPONSE_CODE_303`, and `REDIRECT_HTTP_RESPONSE_CODE_307`.
     * 
     */
    @InputImport(name="redirectHttpResponseCode")
    private final @Nullable Input<String> redirectHttpResponseCode;

    public Input<String> getRedirectHttpResponseCode() {
        return this.redirectHttpResponseCode == null ? Input.empty() : this.redirectHttpResponseCode;
    }

    /**
     * Executes a script to handle the requests that match this URL pattern.
     * Only the auto value is supported for Node.js in the App Engine standard environment, for example "script:" "auto".
     * Structure is documented below.
     * 
     */
    @InputImport(name="script")
    private final @Nullable Input<StandardAppVersionHandlerScriptArgs> script;

    public Input<StandardAppVersionHandlerScriptArgs> getScript() {
        return this.script == null ? Input.empty() : this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    @InputImport(name="securityLevel")
    private final @Nullable Input<String> securityLevel;

    public Input<String> getSecurityLevel() {
        return this.securityLevel == null ? Input.empty() : this.securityLevel;
    }

    /**
     * Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
     * Structure is documented below.
     * 
     */
    @InputImport(name="staticFiles")
    private final @Nullable Input<StandardAppVersionHandlerStaticFilesArgs> staticFiles;

    public Input<StandardAppVersionHandlerStaticFilesArgs> getStaticFiles() {
        return this.staticFiles == null ? Input.empty() : this.staticFiles;
    }

    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings.
     * All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    @InputImport(name="urlRegex")
    private final @Nullable Input<String> urlRegex;

    public Input<String> getUrlRegex() {
        return this.urlRegex == null ? Input.empty() : this.urlRegex;
    }

    public StandardAppVersionHandlerArgs(
        @Nullable Input<String> authFailAction,
        @Nullable Input<String> login,
        @Nullable Input<String> redirectHttpResponseCode,
        @Nullable Input<StandardAppVersionHandlerScriptArgs> script,
        @Nullable Input<String> securityLevel,
        @Nullable Input<StandardAppVersionHandlerStaticFilesArgs> staticFiles,
        @Nullable Input<String> urlRegex) {
        this.authFailAction = authFailAction;
        this.login = login;
        this.redirectHttpResponseCode = redirectHttpResponseCode;
        this.script = script;
        this.securityLevel = securityLevel;
        this.staticFiles = staticFiles;
        this.urlRegex = urlRegex;
    }

    private StandardAppVersionHandlerArgs() {
        this.authFailAction = Input.empty();
        this.login = Input.empty();
        this.redirectHttpResponseCode = Input.empty();
        this.script = Input.empty();
        this.securityLevel = Input.empty();
        this.staticFiles = Input.empty();
        this.urlRegex = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authFailAction;
        private @Nullable Input<String> login;
        private @Nullable Input<String> redirectHttpResponseCode;
        private @Nullable Input<StandardAppVersionHandlerScriptArgs> script;
        private @Nullable Input<String> securityLevel;
        private @Nullable Input<StandardAppVersionHandlerStaticFilesArgs> staticFiles;
        private @Nullable Input<String> urlRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.redirectHttpResponseCode = defaults.redirectHttpResponseCode;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.staticFiles = defaults.staticFiles;
    	      this.urlRegex = defaults.urlRegex;
        }

        public Builder setAuthFailAction(@Nullable Input<String> authFailAction) {
            this.authFailAction = authFailAction;
            return this;
        }

        public Builder setAuthFailAction(@Nullable String authFailAction) {
            this.authFailAction = Input.ofNullable(authFailAction);
            return this;
        }

        public Builder setLogin(@Nullable Input<String> login) {
            this.login = login;
            return this;
        }

        public Builder setLogin(@Nullable String login) {
            this.login = Input.ofNullable(login);
            return this;
        }

        public Builder setRedirectHttpResponseCode(@Nullable Input<String> redirectHttpResponseCode) {
            this.redirectHttpResponseCode = redirectHttpResponseCode;
            return this;
        }

        public Builder setRedirectHttpResponseCode(@Nullable String redirectHttpResponseCode) {
            this.redirectHttpResponseCode = Input.ofNullable(redirectHttpResponseCode);
            return this;
        }

        public Builder setScript(@Nullable Input<StandardAppVersionHandlerScriptArgs> script) {
            this.script = script;
            return this;
        }

        public Builder setScript(@Nullable StandardAppVersionHandlerScriptArgs script) {
            this.script = Input.ofNullable(script);
            return this;
        }

        public Builder setSecurityLevel(@Nullable Input<String> securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        public Builder setSecurityLevel(@Nullable String securityLevel) {
            this.securityLevel = Input.ofNullable(securityLevel);
            return this;
        }

        public Builder setStaticFiles(@Nullable Input<StandardAppVersionHandlerStaticFilesArgs> staticFiles) {
            this.staticFiles = staticFiles;
            return this;
        }

        public Builder setStaticFiles(@Nullable StandardAppVersionHandlerStaticFilesArgs staticFiles) {
            this.staticFiles = Input.ofNullable(staticFiles);
            return this;
        }

        public Builder setUrlRegex(@Nullable Input<String> urlRegex) {
            this.urlRegex = urlRegex;
            return this;
        }

        public Builder setUrlRegex(@Nullable String urlRegex) {
            this.urlRegex = Input.ofNullable(urlRegex);
            return this;
        }

        public StandardAppVersionHandlerArgs build() {
            return new StandardAppVersionHandlerArgs(authFailAction, login, redirectHttpResponseCode, script, securityLevel, staticFiles, urlRegex);
        }
    }
}
