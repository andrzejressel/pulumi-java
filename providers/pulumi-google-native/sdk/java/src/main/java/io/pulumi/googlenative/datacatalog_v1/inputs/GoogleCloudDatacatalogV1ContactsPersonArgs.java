// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A contact person for the entry.
 * 
 */
public final class GoogleCloudDatacatalogV1ContactsPersonArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1ContactsPersonArgs Empty = new GoogleCloudDatacatalogV1ContactsPersonArgs();

    /**
     * Designation of the person, for example, Data Steward.
     * 
     */
    @InputImport(name="designation")
    private final @Nullable Input<String> designation;

    public Input<String> getDesignation() {
        return this.designation == null ? Input.empty() : this.designation;
    }

    /**
     * Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`.
     * 
     */
    @InputImport(name="email")
    private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    public GoogleCloudDatacatalogV1ContactsPersonArgs(
        @Nullable Input<String> designation,
        @Nullable Input<String> email) {
        this.designation = designation;
        this.email = email;
    }

    private GoogleCloudDatacatalogV1ContactsPersonArgs() {
        this.designation = Input.empty();
        this.email = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1ContactsPersonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> designation;
        private @Nullable Input<String> email;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1ContactsPersonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.designation = defaults.designation;
    	      this.email = defaults.email;
        }

        public Builder setDesignation(@Nullable Input<String> designation) {
            this.designation = designation;
            return this;
        }

        public Builder setDesignation(@Nullable String designation) {
            this.designation = Input.ofNullable(designation);
            return this;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public GoogleCloudDatacatalogV1ContactsPersonArgs build() {
            return new GoogleCloudDatacatalogV1ContactsPersonArgs(designation, email);
        }
    }
}
