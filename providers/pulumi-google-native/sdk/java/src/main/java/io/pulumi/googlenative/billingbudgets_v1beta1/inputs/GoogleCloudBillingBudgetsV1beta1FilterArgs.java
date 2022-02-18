// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.billingbudgets_v1beta1.enums.GoogleCloudBillingBudgetsV1beta1FilterCalendarPeriod;
import io.pulumi.googlenative.billingbudgets_v1beta1.enums.GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment;
import io.pulumi.googlenative.billingbudgets_v1beta1.inputs.GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A filter for a budget, limiting the scope of the cost to calculate.
 * 
 */
public final class GoogleCloudBillingBudgetsV1beta1FilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1beta1FilterArgs Empty = new GoogleCloudBillingBudgetsV1beta1FilterArgs();

    /**
     * Optional. Specifies to track usage for recurring calendar period. For example, assume that CalendarPeriod.QUARTER is set. The budget will track usage from April 1 to June 30, when the current calendar month is April, May, June. After that, it will track usage from July 1 to September 30 when the current calendar month is July, August, September, so on.
     * 
     */
    @InputImport(name="calendarPeriod")
    private final @Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterCalendarPeriod> calendarPeriod;

    public Input<GoogleCloudBillingBudgetsV1beta1FilterCalendarPeriod> getCalendarPeriod() {
        return this.calendarPeriod == null ? Input.empty() : this.calendarPeriod;
    }

    /**
     * Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold calculations. See [a list of acceptable credit type values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type). If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
     * 
     */
    @InputImport(name="creditTypes")
    private final @Nullable Input<List<String>> creditTypes;

    public Input<List<String>> getCreditTypes() {
        return this.creditTypes == null ? Input.empty() : this.creditTypes;
    }

    /**
     * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
     * 
     */
    @InputImport(name="creditTypesTreatment")
    private final @Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment> creditTypesTreatment;

    public Input<GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment> getCreditTypesTreatment() {
        return this.creditTypesTreatment == null ? Input.empty() : this.creditTypesTreatment;
    }

    /**
     * Optional. Specifies to track usage from any start date (required) to any end date (optional). This time period is static, it does not recur.
     * 
     */
    @InputImport(name="customPeriod")
    private final @Nullable Input<GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs> customPeriod;

    public Input<GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs> getCustomPeriod() {
        return this.customPeriod == null ? Input.empty() : this.customPeriod;
    }

    /**
     * Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. If omitted, the report will include all labeled and unlabeled usage. An object containing a single `"key": value` pair. Example: `{ "name": "wrench" }`. _Currently, multiple entries or multiple values per entry are not allowed._
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report will include all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
     * 
     */
    @InputImport(name="projects")
    private final @Nullable Input<List<String>> projects;

    public Input<List<String>> getProjects() {
        return this.projects == null ? Input.empty() : this.projects;
    }

    /**
     * Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report will include usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
     * 
     */
    @InputImport(name="services")
    private final @Nullable Input<List<String>> services;

    public Input<List<String>> getServices() {
        return this.services == null ? Input.empty() : this.services;
    }

    /**
     * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount is set to the name of the parent account, usage from the parent account will be included. If omitted, the report will include usage from the parent account and all subaccounts, if they exist.
     * 
     */
    @InputImport(name="subaccounts")
    private final @Nullable Input<List<String>> subaccounts;

    public Input<List<String>> getSubaccounts() {
        return this.subaccounts == null ? Input.empty() : this.subaccounts;
    }

    public GoogleCloudBillingBudgetsV1beta1FilterArgs(
        @Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterCalendarPeriod> calendarPeriod,
        @Nullable Input<List<String>> creditTypes,
        @Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment> creditTypesTreatment,
        @Nullable Input<GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs> customPeriod,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<String>> projects,
        @Nullable Input<List<String>> services,
        @Nullable Input<List<String>> subaccounts) {
        this.calendarPeriod = calendarPeriod;
        this.creditTypes = creditTypes;
        this.creditTypesTreatment = creditTypesTreatment;
        this.customPeriod = customPeriod;
        this.labels = labels;
        this.projects = projects;
        this.services = services;
        this.subaccounts = subaccounts;
    }

    private GoogleCloudBillingBudgetsV1beta1FilterArgs() {
        this.calendarPeriod = Input.empty();
        this.creditTypes = Input.empty();
        this.creditTypesTreatment = Input.empty();
        this.customPeriod = Input.empty();
        this.labels = Input.empty();
        this.projects = Input.empty();
        this.services = Input.empty();
        this.subaccounts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1beta1FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterCalendarPeriod> calendarPeriod;
        private @Nullable Input<List<String>> creditTypes;
        private @Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment> creditTypesTreatment;
        private @Nullable Input<GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs> customPeriod;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<String>> projects;
        private @Nullable Input<List<String>> services;
        private @Nullable Input<List<String>> subaccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1beta1FilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calendarPeriod = defaults.calendarPeriod;
    	      this.creditTypes = defaults.creditTypes;
    	      this.creditTypesTreatment = defaults.creditTypesTreatment;
    	      this.customPeriod = defaults.customPeriod;
    	      this.labels = defaults.labels;
    	      this.projects = defaults.projects;
    	      this.services = defaults.services;
    	      this.subaccounts = defaults.subaccounts;
        }

        public Builder setCalendarPeriod(@Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterCalendarPeriod> calendarPeriod) {
            this.calendarPeriod = calendarPeriod;
            return this;
        }

        public Builder setCalendarPeriod(@Nullable GoogleCloudBillingBudgetsV1beta1FilterCalendarPeriod calendarPeriod) {
            this.calendarPeriod = Input.ofNullable(calendarPeriod);
            return this;
        }

        public Builder setCreditTypes(@Nullable Input<List<String>> creditTypes) {
            this.creditTypes = creditTypes;
            return this;
        }

        public Builder setCreditTypes(@Nullable List<String> creditTypes) {
            this.creditTypes = Input.ofNullable(creditTypes);
            return this;
        }

        public Builder setCreditTypesTreatment(@Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment> creditTypesTreatment) {
            this.creditTypesTreatment = creditTypesTreatment;
            return this;
        }

        public Builder setCreditTypesTreatment(@Nullable GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment creditTypesTreatment) {
            this.creditTypesTreatment = Input.ofNullable(creditTypesTreatment);
            return this;
        }

        public Builder setCustomPeriod(@Nullable Input<GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs> customPeriod) {
            this.customPeriod = customPeriod;
            return this;
        }

        public Builder setCustomPeriod(@Nullable GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs customPeriod) {
            this.customPeriod = Input.ofNullable(customPeriod);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setProjects(@Nullable Input<List<String>> projects) {
            this.projects = projects;
            return this;
        }

        public Builder setProjects(@Nullable List<String> projects) {
            this.projects = Input.ofNullable(projects);
            return this;
        }

        public Builder setServices(@Nullable Input<List<String>> services) {
            this.services = services;
            return this;
        }

        public Builder setServices(@Nullable List<String> services) {
            this.services = Input.ofNullable(services);
            return this;
        }

        public Builder setSubaccounts(@Nullable Input<List<String>> subaccounts) {
            this.subaccounts = subaccounts;
            return this;
        }

        public Builder setSubaccounts(@Nullable List<String> subaccounts) {
            this.subaccounts = Input.ofNullable(subaccounts);
            return this;
        }

        public GoogleCloudBillingBudgetsV1beta1FilterArgs build() {
            return new GoogleCloudBillingBudgetsV1beta1FilterArgs(calendarPeriod, creditTypes, creditTypesTreatment, customPeriod, labels, projects, services, subaccounts);
        }
    }
}
