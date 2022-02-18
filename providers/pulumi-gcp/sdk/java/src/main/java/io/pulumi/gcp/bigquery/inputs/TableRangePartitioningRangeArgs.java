// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class TableRangePartitioningRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableRangePartitioningRangeArgs Empty = new TableRangePartitioningRangeArgs();

    /**
     * End of the range partitioning, exclusive.
     * 
     */
    @InputImport(name="end", required=true)
    private final Input<Integer> end;

    public Input<Integer> getEnd() {
        return this.end;
    }

    /**
     * The width of each range within the partition.
     * 
     */
    @InputImport(name="interval", required=true)
    private final Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval;
    }

    /**
     * Start of the range partitioning, inclusive.
     * 
     */
    @InputImport(name="start", required=true)
    private final Input<Integer> start;

    public Input<Integer> getStart() {
        return this.start;
    }

    public TableRangePartitioningRangeArgs(
        Input<Integer> end,
        Input<Integer> interval,
        Input<Integer> start) {
        this.end = Objects.requireNonNull(end, "expected parameter 'end' to be non-null");
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
    }

    private TableRangePartitioningRangeArgs() {
        this.end = Input.empty();
        this.interval = Input.empty();
        this.start = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableRangePartitioningRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> end;
        private Input<Integer> interval;
        private Input<Integer> start;

        public Builder() {
    	      // Empty
        }

        public Builder(TableRangePartitioningRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.interval = defaults.interval;
    	      this.start = defaults.start;
        }

        public Builder setEnd(Input<Integer> end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }

        public Builder setEnd(Integer end) {
            this.end = Input.of(Objects.requireNonNull(end));
            return this;
        }

        public Builder setInterval(Input<Integer> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Input.of(Objects.requireNonNull(interval));
            return this;
        }

        public Builder setStart(Input<Integer> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder setStart(Integer start) {
            this.start = Input.of(Objects.requireNonNull(start));
            return this;
        }

        public TableRangePartitioningRangeArgs build() {
            return new TableRangePartitioningRangeArgs(end, interval, start);
        }
    }
}
