// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1ContactsPersonResponse;
import java.util.List;
import java.util.Objects;


/**
 * Contact people for the entry.
 * 
 */
public final class GoogleCloudDatacatalogV1ContactsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1ContactsResponse Empty = new GoogleCloudDatacatalogV1ContactsResponse();

    /**
     * The list of contact people for the entry.
     * 
     */
    @InputImport(name="people", required=true)
    private final List<GoogleCloudDatacatalogV1ContactsPersonResponse> people;

    public List<GoogleCloudDatacatalogV1ContactsPersonResponse> getPeople() {
        return this.people;
    }

    public GoogleCloudDatacatalogV1ContactsResponse(List<GoogleCloudDatacatalogV1ContactsPersonResponse> people) {
        this.people = Objects.requireNonNull(people, "expected parameter 'people' to be non-null");
    }

    private GoogleCloudDatacatalogV1ContactsResponse() {
        this.people = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1ContactsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDatacatalogV1ContactsPersonResponse> people;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1ContactsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.people = defaults.people;
        }

        public Builder setPeople(List<GoogleCloudDatacatalogV1ContactsPersonResponse> people) {
            this.people = Objects.requireNonNull(people);
            return this;
        }

        public GoogleCloudDatacatalogV1ContactsResponse build() {
            return new GoogleCloudDatacatalogV1ContactsResponse(people);
        }
    }
}
