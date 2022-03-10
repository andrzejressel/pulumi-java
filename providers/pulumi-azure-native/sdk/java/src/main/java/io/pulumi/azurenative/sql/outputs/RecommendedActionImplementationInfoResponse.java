// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RecommendedActionImplementationInfoResponse {
    /**
     * Gets the method in which this recommended action can be manually implemented. e.g., TSql, AzurePowerShell.
     * 
     */
    private final String method;
    /**
     * Gets the manual implementation script. e.g., T-SQL script that could be executed on the database.
     * 
     */
    private final String script;

    @OutputCustomType.Constructor
    private RecommendedActionImplementationInfoResponse(
        @OutputCustomType.Parameter("method") String method,
        @OutputCustomType.Parameter("script") String script) {
        this.method = method;
        this.script = script;
    }

    /**
     * Gets the method in which this recommended action can be manually implemented. e.g., TSql, AzurePowerShell.
     * 
    */
    public String getMethod() {
        return this.method;
    }
    /**
     * Gets the manual implementation script. e.g., T-SQL script that could be executed on the database.
     * 
    */
    public String getScript() {
        return this.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedActionImplementationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String method;
        private String script;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedActionImplementationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.script = defaults.script;
        }

        public Builder setMethod(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setScript(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        public RecommendedActionImplementationInfoResponse build() {
            return new RecommendedActionImplementationInfoResponse(method, script);
        }
    }
}
