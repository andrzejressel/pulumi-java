// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.iam.inputs.GetRuleArgs;
import com.pulumi.gcp.iam.inputs.GetTestablePermissionsArgs;
import com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolArgs;
import com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolProviderArgs;
import com.pulumi.gcp.iam.outputs.GetRuleResult;
import com.pulumi.gcp.iam.outputs.GetTestablePermissionsResult;
import com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolProviderResult;
import com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolResult;
import java.util.concurrent.CompletableFuture;

public final class IamFunctions {
    /**
     * Use this data source to get information about a Google IAM Role.
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
     *         final var roleinfo = Output.of(IamFunctions.getRule(GetRuleArgs.builder()
     *             .name(&#34;roles/compute.viewer&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;theRolePermissions&#34;, roleinfo.apply(getRuleResult -&gt; getRuleResult.getIncludedPermissions()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRuleResult> getRule(GetRuleArgs args) {
        return getRule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRuleResult> getRule(GetRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:iam/getRule:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve a list of testable permissions for a resource. Testable permissions mean the permissions that user can add or remove in a role at a given resource. The resource can be referenced either via the full resource name or via a URI.
     * 
     * ## Example Usage
     * 
     * Retrieve all the supported permissions able to be set on `my-project` that are in either GA or BETA. This is useful for dynamically constructing custom roles.
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
     *         final var perms = Output.of(IamFunctions.getTestablePermissions(GetTestablePermissionsArgs.builder()
     *             .fullResourceName(&#34;//cloudresourcemanager.googleapis.com/projects/my-project&#34;)
     *             .stages(            
     *                 &#34;GA&#34;,
     *                 &#34;BETA&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTestablePermissionsResult> getTestablePermissions(GetTestablePermissionsArgs args) {
        return getTestablePermissions(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTestablePermissionsResult> getTestablePermissions(GetTestablePermissionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:iam/getTestablePermissions:getTestablePermissions", TypeShape.of(GetTestablePermissionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a IAM workload identity pool from Google Cloud by its id.
     * 
     * ## Example Usage
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
     *         final var foo = Output.of(IamFunctions.getWorkloadIdentityPool(GetWorkloadIdentityPoolArgs.builder()
     *             .workloadIdentityPoolId(&#34;foo-pool&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWorkloadIdentityPoolResult> getWorkloadIdentityPool(GetWorkloadIdentityPoolArgs args) {
        return getWorkloadIdentityPool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkloadIdentityPoolResult> getWorkloadIdentityPool(GetWorkloadIdentityPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:iam/getWorkloadIdentityPool:getWorkloadIdentityPool", TypeShape.of(GetWorkloadIdentityPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a IAM workload identity provider from Google Cloud by its id.
     * 
     * ## Example Usage
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
     *         final var foo = Output.of(IamFunctions.getWorkloadIdentityPoolProvider(GetWorkloadIdentityPoolProviderArgs.builder()
     *             .workloadIdentityPoolId(&#34;foo-pool&#34;)
     *             .workloadIdentityPoolProviderId(&#34;bar-provider&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWorkloadIdentityPoolProviderResult> getWorkloadIdentityPoolProvider(GetWorkloadIdentityPoolProviderArgs args) {
        return getWorkloadIdentityPoolProvider(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkloadIdentityPoolProviderResult> getWorkloadIdentityPoolProvider(GetWorkloadIdentityPoolProviderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:iam/getWorkloadIdentityPoolProvider:getWorkloadIdentityPoolProvider", TypeShape.of(GetWorkloadIdentityPoolProviderResult.class), args, Utilities.withVersion(options));
    }
}
