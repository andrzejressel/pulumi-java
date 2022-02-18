// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.jobs_v4.CompanyArgs;
import io.pulumi.googlenative.jobs_v4.outputs.CompanyDerivedInfoResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new company entity.
 * 
 */
@ResourceType(type="google-native:jobs/v4:Company")
public class Company extends io.pulumi.resources.CustomResource {
    /**
     * The URI to employer's career site or careers page on the employer's web site, for example, "https://careers.google.com".
     * 
     */
    @OutputExport(name="careerSiteUri", type=String.class, parameters={})
    private Output<String> careerSiteUri;

    /**
     * @return The URI to employer's career site or careers page on the employer's web site, for example, "https://careers.google.com".
     * 
     */
    public Output<String> getCareerSiteUri() {
        return this.careerSiteUri;
    }
    /**
     * Derived details about the company.
     * 
     */
    @OutputExport(name="derivedInfo", type=CompanyDerivedInfoResponse.class, parameters={})
    private Output<CompanyDerivedInfoResponse> derivedInfo;

    /**
     * @return Derived details about the company.
     * 
     */
    public Output<CompanyDerivedInfoResponse> getDerivedInfo() {
        return this.derivedInfo;
    }
    /**
     * The display name of the company, for example, "Google LLC".
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the company, for example, "Google LLC".
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    @OutputExport(name="eeoText", type=String.class, parameters={})
    private Output<String> eeoText;

    /**
     * @return Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    public Output<String> getEeoText() {
        return this.eeoText;
    }
    /**
     * Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    @OutputExport(name="externalId", type=String.class, parameters={})
    private Output<String> externalId;

    /**
     * @return Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    public Output<String> getExternalId() {
        return this.externalId;
    }
    /**
     * The street address of the company's main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    @OutputExport(name="headquartersAddress", type=String.class, parameters={})
    private Output<String> headquartersAddress;

    /**
     * @return The street address of the company's main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    public Output<String> getHeadquartersAddress() {
        return this.headquartersAddress;
    }
    /**
     * Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    @OutputExport(name="hiringAgency", type=Boolean.class, parameters={})
    private Output<Boolean> hiringAgency;

    /**
     * @return Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    public Output<Boolean> getHiringAgency() {
        return this.hiringAgency;
    }
    /**
     * A URI that hosts the employer's company logo.
     * 
     */
    @OutputExport(name="imageUri", type=String.class, parameters={})
    private Output<String> imageUri;

    /**
     * @return A URI that hosts the employer's company logo.
     * 
     */
    public Output<String> getImageUri() {
        return this.imageUri;
    }
    /**
     * A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword searches. Jobs with `string_values` under these specified field keys are returned if any of the values match the search keyword. Custom field values with parenthesis, brackets and special symbols are not searchable as-is, and those keyword queries must be surrounded by quotes.
     * 
     */
    @OutputExport(name="keywordSearchableJobCustomAttributes", type=List.class, parameters={String.class})
    private Output<List<String>> keywordSearchableJobCustomAttributes;

    /**
     * @return A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword searches. Jobs with `string_values` under these specified field keys are returned if any of the values match the search keyword. Custom field values with parenthesis, brackets and special symbols are not searchable as-is, and those keyword queries must be surrounded by quotes.
     * 
     */
    public Output<List<String>> getKeywordSearchableJobCustomAttributes() {
        return this.keywordSearchableJobCustomAttributes;
    }
    /**
     * Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for example, "projects/foo/tenants/bar/companies/baz".
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for example, "projects/foo/tenants/bar/companies/baz".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The employer's company size.
     * 
     */
    @OutputExport(name="size", type=String.class, parameters={})
    private Output<String> size;

    /**
     * @return The employer's company size.
     * 
     */
    public Output<String> getSize() {
        return this.size;
    }
    /**
     * Indicates whether a company is flagged to be suspended from public availability by the service when job content appears suspicious, abusive, or spammy.
     * 
     */
    @OutputExport(name="suspended", type=Boolean.class, parameters={})
    private Output<Boolean> suspended;

    /**
     * @return Indicates whether a company is flagged to be suspended from public availability by the service when job content appears suspicious, abusive, or spammy.
     * 
     */
    public Output<Boolean> getSuspended() {
        return this.suspended;
    }
    /**
     * The URI representing the company's primary web site or home page, for example, "https://www.google.com". The maximum number of allowed characters is 255.
     * 
     */
    @OutputExport(name="websiteUri", type=String.class, parameters={})
    private Output<String> websiteUri;

    /**
     * @return The URI representing the company's primary web site or home page, for example, "https://www.google.com". The maximum number of allowed characters is 255.
     * 
     */
    public Output<String> getWebsiteUri() {
        return this.websiteUri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Company(String name, CompanyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:jobs/v4:Company", name, args == null ? CompanyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Company(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:jobs/v4:Company", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Company get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Company(name, id, options);
    }
}
