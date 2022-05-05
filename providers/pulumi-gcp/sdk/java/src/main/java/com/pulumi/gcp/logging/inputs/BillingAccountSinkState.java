// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.logging.inputs.BillingAccountSinkBigqueryOptionsArgs;
import com.pulumi.gcp.logging.inputs.BillingAccountSinkExclusionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BillingAccountSinkState extends com.pulumi.resources.ResourceArgs {

    public static final BillingAccountSinkState Empty = new BillingAccountSinkState();

    /**
     * Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    @Import(name="bigqueryOptions")
    private @Nullable Output<BillingAccountSinkBigqueryOptionsArgs> bigqueryOptions;

    /**
     * @return Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    public Optional<Output<BillingAccountSinkBigqueryOptionsArgs>> bigqueryOptions() {
        return Optional.ofNullable(this.bigqueryOptions);
    }

    /**
     * The billing account exported to the sink.
     * 
     */
    @Import(name="billingAccount")
    private @Nullable Output<String> billingAccount;

    /**
     * @return The billing account exported to the sink.
     * 
     */
    public Optional<Output<String>> billingAccount() {
        return Optional.ofNullable(this.billingAccount);
    }

    /**
     * A description of this exclusion.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of this exclusion.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         }
     * }
     * ```
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    /**
     * @return The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         }
     * }
     * ```
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    @Import(name="exclusions")
    private @Nullable Output<List<BillingAccountSinkExclusionArgs>> exclusions;

    /**
     * @return Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    public Optional<Output<List<BillingAccountSinkExclusionArgs>>> exclusions() {
        return Optional.ofNullable(this.exclusions);
    }

    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    @Import(name="writerIdentity")
    private @Nullable Output<String> writerIdentity;

    /**
     * @return The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    public Optional<Output<String>> writerIdentity() {
        return Optional.ofNullable(this.writerIdentity);
    }

    private BillingAccountSinkState() {}

    private BillingAccountSinkState(BillingAccountSinkState $) {
        this.bigqueryOptions = $.bigqueryOptions;
        this.billingAccount = $.billingAccount;
        this.description = $.description;
        this.destination = $.destination;
        this.disabled = $.disabled;
        this.exclusions = $.exclusions;
        this.filter = $.filter;
        this.name = $.name;
        this.writerIdentity = $.writerIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BillingAccountSinkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BillingAccountSinkState $;

        public Builder() {
            $ = new BillingAccountSinkState();
        }

        public Builder(BillingAccountSinkState defaults) {
            $ = new BillingAccountSinkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryOptions(@Nullable Output<BillingAccountSinkBigqueryOptionsArgs> bigqueryOptions) {
            $.bigqueryOptions = bigqueryOptions;
            return this;
        }

        /**
         * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryOptions(BillingAccountSinkBigqueryOptionsArgs bigqueryOptions) {
            return bigqueryOptions(Output.of(bigqueryOptions));
        }

        /**
         * @param billingAccount The billing account exported to the sink.
         * 
         * @return builder
         * 
         */
        public Builder billingAccount(@Nullable Output<String> billingAccount) {
            $.billingAccount = billingAccount;
            return this;
        }

        /**
         * @param billingAccount The billing account exported to the sink.
         * 
         * @return builder
         * 
         */
        public Builder billingAccount(String billingAccount) {
            return billingAccount(Output.of(billingAccount));
        }

        /**
         * @param description A description of this exclusion.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of this exclusion.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destination The destination of the sink (or, in other words, where logs are written to). Can be a
         * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
         * ```java
         * package generated_program;
         * 
         * import java.util.*;
         * import java.io.*;
         * import java.nio.*;
         * import com.pulumi.*;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         }
         * }
         * ```
         * The writer associated with the sink must have access to write to the above resource.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination The destination of the sink (or, in other words, where logs are written to). Can be a
         * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
         * ```java
         * package generated_program;
         * 
         * import java.util.*;
         * import java.io.*;
         * import java.nio.*;
         * import com.pulumi.*;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         }
         * }
         * ```
         * The writer associated with the sink must have access to write to the above resource.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param disabled If set to True, then this exclusion is disabled and it does not exclude any log entries.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled If set to True, then this exclusion is disabled and it does not exclude any log entries.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(@Nullable Output<List<BillingAccountSinkExclusionArgs>> exclusions) {
            $.exclusions = exclusions;
            return this;
        }

        /**
         * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(List<BillingAccountSinkExclusionArgs> exclusions) {
            return exclusions(Output.of(exclusions));
        }

        /**
         * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(BillingAccountSinkExclusionArgs... exclusions) {
            return exclusions(List.of(exclusions));
        }

        /**
         * @param filter An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
         * write a filter.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
         * write a filter.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param writerIdentity The identity associated with this sink. This identity must be granted write access to the
         * configured `destination`.
         * 
         * @return builder
         * 
         */
        public Builder writerIdentity(@Nullable Output<String> writerIdentity) {
            $.writerIdentity = writerIdentity;
            return this;
        }

        /**
         * @param writerIdentity The identity associated with this sink. This identity must be granted write access to the
         * configured `destination`.
         * 
         * @return builder
         * 
         */
        public Builder writerIdentity(String writerIdentity) {
            return writerIdentity(Output.of(writerIdentity));
        }

        public BillingAccountSinkState build() {
            return $;
        }
    }

}
