// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.securitycenter.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class NotificationConfigStreamingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationConfigStreamingConfigArgs Empty = new NotificationConfigStreamingConfigArgs();

    /**
     * Expression that defines the filter to apply across create/update
     * events of assets or findings as specified by the event type. The
     * expression is a list of zero or more restrictions combined via
     * logical operators AND and OR. Parentheses are supported, and OR
     * has higher precedence than AND.
     * Restrictions have the form <field> <operator> <value> and may have
     * a - character in front of them to indicate negation. The fields
     * map to those defined in the corresponding resource.
     * The supported operators are:
     * * = for all value types.
     * * > , <, >=, <= for integer values.
     * * :, meaning substring matching, for strings.
     *   The supported value types are:
     * * string literals in quotes.
     * * integer literals without quotes.
     * * boolean literals true and false without quotes.
     *   See
     *   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
     *   for information on how to write a filter.
     * 
     */
    @InputImport(name="filter", required=true)
    private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    public NotificationConfigStreamingConfigArgs(Input<String> filter) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
    }

    private NotificationConfigStreamingConfigArgs() {
        this.filter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigStreamingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> filter;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigStreamingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
        }

        public Builder setFilter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public NotificationConfigStreamingConfigArgs build() {
            return new NotificationConfigStreamingConfigArgs(filter);
        }
    }
}
