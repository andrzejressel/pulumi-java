// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A condition to be met.
 * 
 */
public final class ConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConditionResponse Empty = new ConditionResponse();

    /**
     * Trusted attributes supplied by the IAM system.
     * 
     */
    @InputImport(name="iam", required=true)
    private final String iam;

    public String getIam() {
        return this.iam;
    }

    /**
     * An operator to apply the subject with.
     * 
     */
    @InputImport(name="op", required=true)
    private final String op;

    public String getOp() {
        return this.op;
    }

    /**
     * Trusted attributes discharged by the service.
     * 
     */
    @InputImport(name="svc", required=true)
    private final String svc;

    public String getSvc() {
        return this.svc;
    }

    /**
     * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
     * 
     */
    @InputImport(name="sys", required=true)
    private final String sys;

    public String getSys() {
        return this.sys;
    }

    /**
     * The objects of the condition.
     * 
     */
    @InputImport(name="values", required=true)
    private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public ConditionResponse(
        String iam,
        String op,
        String svc,
        String sys,
        List<String> values) {
        this.iam = Objects.requireNonNull(iam, "expected parameter 'iam' to be non-null");
        this.op = Objects.requireNonNull(op, "expected parameter 'op' to be non-null");
        this.svc = Objects.requireNonNull(svc, "expected parameter 'svc' to be non-null");
        this.sys = Objects.requireNonNull(sys, "expected parameter 'sys' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ConditionResponse() {
        this.iam = null;
        this.op = null;
        this.svc = null;
        this.sys = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iam;
        private String op;
        private String svc;
        private String sys;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.op = defaults.op;
    	      this.svc = defaults.svc;
    	      this.sys = defaults.sys;
    	      this.values = defaults.values;
        }

        public Builder setIam(String iam) {
            this.iam = Objects.requireNonNull(iam);
            return this;
        }

        public Builder setOp(String op) {
            this.op = Objects.requireNonNull(op);
            return this;
        }

        public Builder setSvc(String svc) {
            this.svc = Objects.requireNonNull(svc);
            return this;
        }

        public Builder setSys(String sys) {
            this.sys = Objects.requireNonNull(sys);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public ConditionResponse build() {
            return new ConditionResponse(iam, op, svc, sys, values);
        }
    }
}
