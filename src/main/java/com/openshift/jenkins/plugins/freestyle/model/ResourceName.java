package com.openshift.jenkins.plugins.freestyle.model;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import hudson.util.FormValidation;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;

import java.io.Serializable;

public class ResourceName extends AbstractDescribableImpl<ResourceName>
        implements Serializable {

    private final String name;

    @DataBoundConstructor
    public ResourceName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<ResourceName> {

        @Override
        public String getDisplayName() {
            return "Name";
        }

        public FormValidation doCheckValue(@QueryParameter String value) {
            return FormValidation.validateRequired(value);
        }

    }

}
