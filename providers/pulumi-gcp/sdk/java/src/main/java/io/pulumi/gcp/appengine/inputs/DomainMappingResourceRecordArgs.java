// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingResourceRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingResourceRecordArgs Empty = new DomainMappingResourceRecordArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="rrdata")
    private final @Nullable Input<String> rrdata;

    public Input<String> getRrdata() {
        return this.rrdata == null ? Input.empty() : this.rrdata;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DomainMappingResourceRecordArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> rrdata,
        @Nullable Input<String> type) {
        this.name = name;
        this.rrdata = rrdata;
        this.type = type;
    }

    private DomainMappingResourceRecordArgs() {
        this.name = Input.empty();
        this.rrdata = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingResourceRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> rrdata;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingResourceRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.rrdata = defaults.rrdata;
    	      this.type = defaults.type;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRrdata(@Nullable Input<String> rrdata) {
            this.rrdata = rrdata;
            return this;
        }

        public Builder setRrdata(@Nullable String rrdata) {
            this.rrdata = Input.ofNullable(rrdata);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public DomainMappingResourceRecordArgs build() {
            return new DomainMappingResourceRecordArgs(name, rrdata, type);
        }
    }
}
