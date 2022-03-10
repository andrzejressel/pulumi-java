// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EmailTemplateParametersContractPropertiesResponse {
    /**
     * Template parameter description.
     * 
     */
    private final @Nullable String description;
    /**
     * Template parameter name.
     * 
     */
    private final @Nullable String name;
    /**
     * Template parameter title.
     * 
     */
    private final @Nullable String title;

    @OutputCustomType.Constructor
    private EmailTemplateParametersContractPropertiesResponse(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("title") @Nullable String title) {
        this.description = description;
        this.name = name;
        this.title = title;
    }

    /**
     * Template parameter description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Template parameter name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Template parameter title.
     * 
    */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailTemplateParametersContractPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String name;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailTemplateParametersContractPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.title = defaults.title;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }
        public EmailTemplateParametersContractPropertiesResponse build() {
            return new EmailTemplateParametersContractPropertiesResponse(description, name, title);
        }
    }
}
