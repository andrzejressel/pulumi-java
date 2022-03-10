// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SSISChildPackageResponse {
    /**
     * Content for embedded child package. Type: string (or Expression with resultType string).
     * 
     */
    private final Object packageContent;
    /**
     * Last modified date for embedded child package.
     * 
     */
    private final @Nullable String packageLastModifiedDate;
    /**
     * Name for embedded child package.
     * 
     */
    private final @Nullable String packageName;
    /**
     * Path for embedded child package. Type: string (or Expression with resultType string).
     * 
     */
    private final Object packagePath;

    @OutputCustomType.Constructor
    private SSISChildPackageResponse(
        @OutputCustomType.Parameter("packageContent") Object packageContent,
        @OutputCustomType.Parameter("packageLastModifiedDate") @Nullable String packageLastModifiedDate,
        @OutputCustomType.Parameter("packageName") @Nullable String packageName,
        @OutputCustomType.Parameter("packagePath") Object packagePath) {
        this.packageContent = packageContent;
        this.packageLastModifiedDate = packageLastModifiedDate;
        this.packageName = packageName;
        this.packagePath = packagePath;
    }

    /**
     * Content for embedded child package. Type: string (or Expression with resultType string).
     * 
    */
    public Object getPackageContent() {
        return this.packageContent;
    }
    /**
     * Last modified date for embedded child package.
     * 
    */
    public Optional<String> getPackageLastModifiedDate() {
        return Optional.ofNullable(this.packageLastModifiedDate);
    }
    /**
     * Name for embedded child package.
     * 
    */
    public Optional<String> getPackageName() {
        return Optional.ofNullable(this.packageName);
    }
    /**
     * Path for embedded child package. Type: string (or Expression with resultType string).
     * 
    */
    public Object getPackagePath() {
        return this.packagePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISChildPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object packageContent;
        private @Nullable String packageLastModifiedDate;
        private @Nullable String packageName;
        private Object packagePath;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISChildPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageContent = defaults.packageContent;
    	      this.packageLastModifiedDate = defaults.packageLastModifiedDate;
    	      this.packageName = defaults.packageName;
    	      this.packagePath = defaults.packagePath;
        }

        public Builder setPackageContent(Object packageContent) {
            this.packageContent = Objects.requireNonNull(packageContent);
            return this;
        }

        public Builder setPackageLastModifiedDate(@Nullable String packageLastModifiedDate) {
            this.packageLastModifiedDate = packageLastModifiedDate;
            return this;
        }

        public Builder setPackageName(@Nullable String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder setPackagePath(Object packagePath) {
            this.packagePath = Objects.requireNonNull(packagePath);
            return this;
        }
        public SSISChildPackageResponse build() {
            return new SSISChildPackageResponse(packageContent, packageLastModifiedDate, packageName, packagePath);
        }
    }
}
