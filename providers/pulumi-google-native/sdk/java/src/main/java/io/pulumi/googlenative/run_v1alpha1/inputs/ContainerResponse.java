// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.ContainerPortResponse;
import io.pulumi.googlenative.run_v1alpha1.inputs.EnvFromSourceResponse;
import io.pulumi.googlenative.run_v1alpha1.inputs.EnvVarResponse;
import io.pulumi.googlenative.run_v1alpha1.inputs.ProbeResponse;
import io.pulumi.googlenative.run_v1alpha1.inputs.ResourceRequirementsResponse;
import io.pulumi.googlenative.run_v1alpha1.inputs.SecurityContextResponse;
import io.pulumi.googlenative.run_v1alpha1.inputs.VolumeMountResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A single application container. This specifies both the container to run, the command to run in the container and the arguments to supply to it. Note that additional arguments may be supplied by the system to the container at runtime.
 * 
 */
public final class ContainerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerResponse Empty = new ContainerResponse();

    /**
     * (Optional) Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @InputImport(name="args", required=true)
    private final List<String> args;

    public List<String> getArgs() {
        return this.args;
    }

    @InputImport(name="command", required=true)
    private final List<String> command;

    public List<String> getCommand() {
        return this.command;
    }

    /**
     * (Optional) List of environment variables to set in the container.
     * 
     */
    @InputImport(name="env", required=true)
    private final List<EnvVarResponse> env;

    public List<EnvVarResponse> getEnv() {
        return this.env;
    }

    /**
     * (Optional) List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    @InputImport(name="envFrom", required=true)
    private final List<EnvFromSourceResponse> envFrom;

    public List<EnvFromSourceResponse> getEnvFrom() {
        return this.envFrom;
    }

    /**
     * Only supports containers from Google Container Registry or Artifact Registry URL of the Container image. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @InputImport(name="image", required=true)
    private final String image;

    public String getImage() {
        return this.image;
    }

    /**
     * (Optional) Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    @InputImport(name="imagePullPolicy", required=true)
    private final String imagePullPolicy;

    public String getImagePullPolicy() {
        return this.imagePullPolicy;
    }

    /**
     * (Optional) Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @InputImport(name="livenessProbe", required=true)
    private final ProbeResponse livenessProbe;

    public ProbeResponse getLivenessProbe() {
        return this.livenessProbe;
    }

    /**
     * (Optional) Name of the container specified as a DNS_LABEL. Currently unused in Cloud Run. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-label-names
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    @InputImport(name="ports", required=true)
    private final List<ContainerPortResponse> ports;

    public List<ContainerPortResponse> getPorts() {
        return this.ports;
    }

    /**
     * (Optional) Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @InputImport(name="readinessProbe", required=true)
    private final ProbeResponse readinessProbe;

    public ProbeResponse getReadinessProbe() {
        return this.readinessProbe;
    }

    /**
     * (Optional) Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    @InputImport(name="resources", required=true)
    private final ResourceRequirementsResponse resources;

    public ResourceRequirementsResponse getResources() {
        return this.resources;
    }

    /**
     * (Optional) Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @InputImport(name="securityContext", required=true)
    private final SecurityContextResponse securityContext;

    public SecurityContextResponse getSecurityContext() {
        return this.securityContext;
    }

    /**
     * (Optional) Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @InputImport(name="startupProbe", required=true)
    private final ProbeResponse startupProbe;

    public ProbeResponse getStartupProbe() {
        return this.startupProbe;
    }

    /**
     * (Optional) Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
     * 
     */
    @InputImport(name="terminationMessagePath", required=true)
    private final String terminationMessagePath;

    public String getTerminationMessagePath() {
        return this.terminationMessagePath;
    }

    /**
     * (Optional) Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     */
    @InputImport(name="terminationMessagePolicy", required=true)
    private final String terminationMessagePolicy;

    public String getTerminationMessagePolicy() {
        return this.terminationMessagePolicy;
    }

    /**
     * (Optional) Volume to mount into the container's filesystem. Only supports SecretVolumeSources. Pod volumes to mount into the container's filesystem.
     * 
     */
    @InputImport(name="volumeMounts", required=true)
    private final List<VolumeMountResponse> volumeMounts;

    public List<VolumeMountResponse> getVolumeMounts() {
        return this.volumeMounts;
    }

    /**
     * (Optional) Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image.
     * 
     */
    @InputImport(name="workingDir", required=true)
    private final String workingDir;

    public String getWorkingDir() {
        return this.workingDir;
    }

    public ContainerResponse(
        List<String> args,
        List<String> command,
        List<EnvVarResponse> env,
        List<EnvFromSourceResponse> envFrom,
        String image,
        String imagePullPolicy,
        ProbeResponse livenessProbe,
        String name,
        List<ContainerPortResponse> ports,
        ProbeResponse readinessProbe,
        ResourceRequirementsResponse resources,
        SecurityContextResponse securityContext,
        ProbeResponse startupProbe,
        String terminationMessagePath,
        String terminationMessagePolicy,
        List<VolumeMountResponse> volumeMounts,
        String workingDir) {
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
        this.env = Objects.requireNonNull(env, "expected parameter 'env' to be non-null");
        this.envFrom = Objects.requireNonNull(envFrom, "expected parameter 'envFrom' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.imagePullPolicy = Objects.requireNonNull(imagePullPolicy, "expected parameter 'imagePullPolicy' to be non-null");
        this.livenessProbe = Objects.requireNonNull(livenessProbe, "expected parameter 'livenessProbe' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
        this.readinessProbe = Objects.requireNonNull(readinessProbe, "expected parameter 'readinessProbe' to be non-null");
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.securityContext = Objects.requireNonNull(securityContext, "expected parameter 'securityContext' to be non-null");
        this.startupProbe = Objects.requireNonNull(startupProbe, "expected parameter 'startupProbe' to be non-null");
        this.terminationMessagePath = Objects.requireNonNull(terminationMessagePath, "expected parameter 'terminationMessagePath' to be non-null");
        this.terminationMessagePolicy = Objects.requireNonNull(terminationMessagePolicy, "expected parameter 'terminationMessagePolicy' to be non-null");
        this.volumeMounts = Objects.requireNonNull(volumeMounts, "expected parameter 'volumeMounts' to be non-null");
        this.workingDir = Objects.requireNonNull(workingDir, "expected parameter 'workingDir' to be non-null");
    }

    private ContainerResponse() {
        this.args = List.of();
        this.command = List.of();
        this.env = List.of();
        this.envFrom = List.of();
        this.image = null;
        this.imagePullPolicy = null;
        this.livenessProbe = null;
        this.name = null;
        this.ports = List.of();
        this.readinessProbe = null;
        this.resources = null;
        this.securityContext = null;
        this.startupProbe = null;
        this.terminationMessagePath = null;
        this.terminationMessagePolicy = null;
        this.volumeMounts = List.of();
        this.workingDir = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private List<String> command;
        private List<EnvVarResponse> env;
        private List<EnvFromSourceResponse> envFrom;
        private String image;
        private String imagePullPolicy;
        private ProbeResponse livenessProbe;
        private String name;
        private List<ContainerPortResponse> ports;
        private ProbeResponse readinessProbe;
        private ResourceRequirementsResponse resources;
        private SecurityContextResponse securityContext;
        private ProbeResponse startupProbe;
        private String terminationMessagePath;
        private String terminationMessagePolicy;
        private List<VolumeMountResponse> volumeMounts;
        private String workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.envFrom = defaults.envFrom;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
    	      this.securityContext = defaults.securityContext;
    	      this.startupProbe = defaults.startupProbe;
    	      this.terminationMessagePath = defaults.terminationMessagePath;
    	      this.terminationMessagePolicy = defaults.terminationMessagePolicy;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setCommand(List<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setEnv(List<EnvVarResponse> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setEnvFrom(List<EnvFromSourceResponse> envFrom) {
            this.envFrom = Objects.requireNonNull(envFrom);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = Objects.requireNonNull(imagePullPolicy);
            return this;
        }

        public Builder setLivenessProbe(ProbeResponse livenessProbe) {
            this.livenessProbe = Objects.requireNonNull(livenessProbe);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPorts(List<ContainerPortResponse> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setReadinessProbe(ProbeResponse readinessProbe) {
            this.readinessProbe = Objects.requireNonNull(readinessProbe);
            return this;
        }

        public Builder setResources(ResourceRequirementsResponse resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setSecurityContext(SecurityContextResponse securityContext) {
            this.securityContext = Objects.requireNonNull(securityContext);
            return this;
        }

        public Builder setStartupProbe(ProbeResponse startupProbe) {
            this.startupProbe = Objects.requireNonNull(startupProbe);
            return this;
        }

        public Builder setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = Objects.requireNonNull(terminationMessagePath);
            return this;
        }

        public Builder setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = Objects.requireNonNull(terminationMessagePolicy);
            return this;
        }

        public Builder setVolumeMounts(List<VolumeMountResponse> volumeMounts) {
            this.volumeMounts = Objects.requireNonNull(volumeMounts);
            return this;
        }

        public Builder setWorkingDir(String workingDir) {
            this.workingDir = Objects.requireNonNull(workingDir);
            return this;
        }

        public ContainerResponse build() {
            return new ContainerResponse(args, command, env, envFrom, image, imagePullPolicy, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, terminationMessagePath, terminationMessagePolicy, volumeMounts, workingDir);
        }
    }
}
